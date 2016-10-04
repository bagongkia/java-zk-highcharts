package com.bagongkia.highcharts.custom;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.bagongkia.highcharts.component.Axis;
import com.bagongkia.highcharts.component.Chart;
import com.bagongkia.highcharts.component.Credits;
import com.bagongkia.highcharts.component.Drilldown;
import com.bagongkia.highcharts.component.Exporting;
import com.bagongkia.highcharts.component.Highcharts;
import com.bagongkia.highcharts.component.Legend;
import com.bagongkia.highcharts.component.Pane;
import com.bagongkia.highcharts.component.PlotOptions;
import com.bagongkia.highcharts.component.Title;
import com.bagongkia.highcharts.component.Subtitle;
import com.bagongkia.highcharts.component.Tooltip;
import java.util.ArrayList;
import java.util.List;
import org.zkoss.zk.ui.util.Clients;

public abstract class HChart {
    protected final Gson gson = new Gson();
    protected final JsonParser jsonParser = new JsonParser();
    
    private final Highcharts highcharts = new Highcharts();
    private final Title title = new Title();
    private final Subtitle subtitle = new Subtitle();
    
    private final Legend legend = new Legend();
    private final Tooltip tooltip = new Tooltip();
    private final Exporting exporting = new Exporting();
    private final Credits credits = new Credits();
    
    protected Chart chart;
    protected Axis xAxis;
    protected Axis yAxis;
    protected JsonElement jsonSeries;
    protected Drilldown drilldown;
    protected Pane pane;
    protected PlotOptions plotOptions;
    
    private String titleText;
    private String subtitleText;
    private String json;
    
    private String tooltipHeaderFormat;
    private String tooltipPointFormat;
    private String tooltipFooterFormat;
    
    private String legendLayout;
    private String legendAlign;
    private String legendVerticalAlign;
    private Double legendBorderWidth;
    private Boolean legendEnabled = true;
    
    private Boolean enableExporting = true;
    private Boolean enableCredits = false;
    private String exportingFileName = "chart";
    private String exportingFunction = "";
    
    private Boolean showPrint = true;
    private Boolean showSeparator = true;
    private Boolean showPNG = true;
    private Boolean showJPEG = true;
    private Boolean showSVG = true;
    
    abstract void initChart();
    abstract void initxAxis();
    abstract void inityAxis();
    abstract void initSeries();
    
    private void initTitle() {
        this.title.setText(titleText);
    }
    
    private void initSubtitle() {
        this.subtitle.setText(subtitleText);
    }
    
    protected void initDrilldown() {
    }
    
    protected void initLegend() {
        this.legend.setLayout(getLegendLayout());
        this.legend.setAlign(getLegendAlign());
        this.legend.setVerticalAlign(getLegendVerticalAlign());
        this.legend.setBorderWidth(getLegendBorderWidth());
        this.legend.setEnabled(getLegendEnabled());
    }
    
    protected void initTooltip() {
        this.tooltip.setHeaderFormat(getTooltipHeaderFormat());
        this.tooltip.setPointFormat(getTooltipPointFormat());
        this.tooltip.setFooterFormat(getTooltipFooterFormat());
    }
    
    protected void initPane() {
    }
    
    protected void initPlotOptions() {
    }
    
    private void initExporting() {
        this.exporting.setEnabled(getEnableExporting());
        this.exporting.setFilename(getExportingFileName());
        this.exporting.setFallbackToExportServer(true);
        generateExportingMenuItems();
    }
    
    private void initCredits() {
        this.credits.setEnabled(getEnableCredits());
    }
    
    public final void init() {
        initTitle();
        initSubtitle();
        initChart();
        initxAxis();
        inityAxis();
        initSeries();
        initPane();
        initDrilldown();
        initLegend();
        initTooltip();
        initPlotOptions();
        initExporting();
        initCredits();
    }
    
    public final void render() {
        highcharts.setTitle(title);
        highcharts.setSubtitle(subtitle);
        highcharts.setChart(chart);
        highcharts.setxAxis(xAxis);
        highcharts.setyAxis(yAxis);
        highcharts.setSeries(jsonSeries);
        highcharts.setPane(pane);
        highcharts.setDrilldown(drilldown);
        highcharts.setLegend(legend);
        highcharts.setPlotOptions(plotOptions);
        highcharts.setTooltip(tooltip);
        highcharts.setExporting(exporting);
        highcharts.setCredits(credits);
        
        json = gson.toJson(highcharts);
    }
    
    public final void renderTo(String id) {
        init();
        render();
        Clients.evalJavaScript("$(document).ready(function() { " +
                               "var json = JSON.parse('" + json + "'); " +
                               getExportingFunction() +
                               "$('" + id + "').highcharts(json);});");
    }
    
    public String getTitle() {
        return titleText;
    }
    
    public void setTitle(String titleText) {
        this.titleText = titleText;
    }

    public String getSubtitle() {
        return subtitleText;
    }
    
    public void setSubtitle(String subtitleText) {
        this.subtitleText = subtitleText;
    }
    
    //TOOLTIP START
    public String getTooltipHeaderFormat() {
        return tooltipHeaderFormat;
    }

    public void setTooltipHeaderFormat(String tooltipHeaderFormat) {
        this.tooltipHeaderFormat = tooltipHeaderFormat;
    }

    public String getTooltipPointFormat() {
        return tooltipPointFormat;
    }

    public void setTooltipPointFormat(String tooltipPointFormat) {
        this.tooltipPointFormat = tooltipPointFormat;
    }

    public String getTooltipFooterFormat() {
        return tooltipFooterFormat;
    }

    public void setTooltipFooterFormat(String tooltipFooterFormat) {
        this.tooltipFooterFormat = tooltipFooterFormat;
    }
    //TOOLTIP END
    
    //LEGEND START
    public String getLegendLayout() {    
        return legendLayout;
    }

    public void setLegendLayout(String legendLayout) {
        this.legendLayout = legendLayout;
    }

    public String getLegendAlign() {
        return legendAlign;
    }

    public void setLegendAlign(String legendAlign) {
        this.legendAlign = legendAlign;
    }

    public String getLegendVerticalAlign() {
        return legendVerticalAlign;
    }

    public void setLegendVerticalAlign(String legendVerticalAlign) {
        this.legendVerticalAlign = legendVerticalAlign;
    }

    public Double getLegendBorderWidth() {
        return legendBorderWidth;
    }

    public void setLegendBorderWidth(Double legendBorderWidth) {
        this.legendBorderWidth = legendBorderWidth;
    }

    public Boolean getLegendEnabled() {
        return legendEnabled;
    }
    
    public void setLegendEnabled(Boolean legendEnabled) {    
        this.legendEnabled = legendEnabled;
    }
    //LEGEND END
    
    //EXPORTING FEATURE START
    public Boolean getEnableExporting() {
        return enableExporting;
    }

    public void setEnableExporting(Boolean enableExporting) {
        this.enableExporting = enableExporting;
    }

    public String getExportingFileName() {
        return exportingFileName;
    }

    public void setExportingFileName(String exportingFileName) {
        this.exportingFileName = exportingFileName;
    }
    
    public String getExportingFunction() {
        return exportingFunction;
    }

    public void setExportingFunction(String exportingFunction) {
        this.exportingFunction = exportingFunction;
    }
    
    public void setExportingMenuItems(Boolean showPrint, Boolean showSeparator, Boolean showPNG, Boolean showJPEG, Boolean showSVG) {
        this.showPrint = showPrint;
        this.showSeparator = showSeparator;
        this.showPNG = showPNG;
        this.showJPEG = showJPEG;
        this.showSVG = showSVG;
    }
    
    public void generateExportingMenuItems() {
        setExportingFunction("");
        /*              2 = PNG
           4 = SVG      1 = Separator
           3 = JPEG     0 = Print
        */
        List<String> exportingMenuItems = new ArrayList<>();
        if (showPrint) {
            exportingMenuItems.add("{text: 'Print Chart', onclick: function() {this.print()}}");
        }
        if (showSeparator) {
            exportingMenuItems.add("{separator: true}");
        }
        if (showPNG) {
            exportingMenuItems.add("{text: 'Download PNG Image', onclick: function() {this.exportChartLocal()}}");
        }
        if (showJPEG) {
            exportingMenuItems.add("{text: 'Download JPEG Image', onclick: function() {this.exportChartLocal({type: 'image/jpeg'})}}");
        }
        if (showSVG) {
            exportingMenuItems.add("{text: 'Download SVG Image', onclick: function() {this.exportChartLocal({type: 'image/svg'})}}");
        }
       
        for (String menu : exportingMenuItems) {
            setExportingFunction(getExportingFunction() + "json.exporting.buttons.contextButton.menuItems.push(" + menu + "); ");
        }
    }

    public Boolean getEnableCredits() {
        return enableCredits;
    }

    public void setEnableCredits(Boolean enableCredits) {
        this.enableCredits = enableCredits;
    }
    
    public class MenuItems {
        private String text;
        private Boolean separator;
        
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Boolean getSeparator() {
            return separator;
        }

        public void setSeparator(Boolean separator) {
            this.separator = separator;
        }
    }
    //EXPORTING FEATURE END
}