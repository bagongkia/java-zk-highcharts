package com.bagongkia.highcharts.custom;

import com.google.gson.JsonElement;
import com.bagongkia.highcharts.component.Axis;
import com.bagongkia.highcharts.component.Chart;
import com.bagongkia.highcharts.component.DataLabels;
import com.bagongkia.highcharts.component.Drilldown;
import com.bagongkia.highcharts.component.PlotOptions;
import com.bagongkia.highcharts.component.Tooltip;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PieChart extends HChart{
    private String yAxisTitle;
    
    private List<Series> seriesList;
    private Map<String, List<Data>> seriesMap = new LinkedHashMap<>();
    
    private List<Series> drilldownSeriesList = new ArrayList<>();
    private Map<String, List<Data>> drilldownSeriesMap = new LinkedHashMap<>();
    
    private Boolean allowPointSelect = true;
    private String dataLabelsFormat;
    
    public PieChart() {
        chart = new Chart();
        xAxis = new Axis();
        yAxis = new Axis();
        drilldown = new Drilldown();
        plotOptions = new PlotOptions();
    }
    
    @Override
    void initChart() {
        chart.setType("pie");
    }

    @Override
    void initxAxis() {
        xAxis.setType("category");
    }
    
    @Override
    void inityAxis() {
        yAxis.getTitle().setText(getyAxisTitle());
    }
    
    @Override
    void initSeries() {
        seriesList =  new ArrayList<>();
        for (Map.Entry<String, List<Data>> entry : seriesMap.entrySet()) {
            Series series = new Series();
            series.setName(entry.getKey());
            series.setData(entry.getValue());
            seriesList.add(series);
        }
        String json = gson.toJson(seriesList);
        jsonSeries = (JsonElement)jsonParser.parse(json);
    }
    
    @Override
    protected void initDrilldown() {
        drilldownSeriesList =  new ArrayList<>();
        for (Map.Entry<String, List<Data>> entry : drilldownSeriesMap.entrySet()) {
            Series series = new Series();
            series.setName((entry.getKey()).split("\\^")[0]);
            series.setId((entry.getKey()).split("\\^")[1]);
            series.setColorByPoint(true);
            series.setData(entry.getValue());
            drilldownSeriesList.add(series);
        }
        Series[] arrSeries = new Series[drilldownSeriesList.size()];
        drilldownSeriesList.toArray(arrSeries);
        drilldown.setSeries(arrSeries);
    }
    
    @Override
    protected void initPlotOptions() {
        plotOptions.getPie().setAllowPointSelect(getAllowPointSelect());
        plotOptions.getPie().setCursor("pointer");
        plotOptions.getPie().getDataLabels().setFormat(getDataLabelsFormat());
    }
    
    public String getyAxisTitle() {
        return yAxisTitle;
    }

    public void setyAxisTitle(String yAxisTitle) {
        this.yAxisTitle = yAxisTitle;
    }

    public Boolean getAllowPointSelect() {
        return allowPointSelect;
    }

    public void setAllowPointSelect(Boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
    }

    public String getDataLabelsFormat() {
        return dataLabelsFormat;
    }

    public void setDataLabelsFormat(String dataLabelsFormat) {
        this.dataLabelsFormat = dataLabelsFormat;
    }
    
    public void addSeries(String seriesName, String name, Double y) {
        addSeries(seriesName, name, y, null);
    }
    
    public void addSeries(String seriesName, String name, Double y, String drilldown) {
        List<Data> dataList = new ArrayList<>();
        if (seriesMap.get(seriesName) != null) {
            dataList = seriesMap.get(seriesName);
        }
        dataList.add(new Data(name, y, drilldown));
        seriesMap.put(seriesName, dataList);
    }
    
    public void addDrilldown(String seriesName, String name, Double y, String id) {
        List<Data> dataList = new ArrayList<>();
        if (drilldownSeriesMap.get(seriesName + "^" + id) != null) {
            dataList = drilldownSeriesMap.get(seriesName + "^" + id);
        }
        dataList.add(new Data(name, y));
        drilldownSeriesMap.put(seriesName + "^" + id, dataList);
    }
    
    public class Series {
        private Boolean allowPointSelect;
        private String borderColor;
        private Double borderWidth;
        private Boolean colorByPoint;
        private String[] colors;
        private String cursor;
        private List<Data> data;
        private DataLabels dataLabels;
        private String id;
        private String name;
        private Boolean selected;
        private Double slicedOffset;
        private Tooltip tooltip;
        private String type;
        private Boolean visible;

        public Boolean getAllowPointSelect() {
            return allowPointSelect;
        }

        public void setAllowPointSelect(Boolean allowPointSelect) {
            this.allowPointSelect = allowPointSelect;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public void setBorderColor(String borderColor) {
            this.borderColor = borderColor;
        }

        public Double getBorderWidth() {
            return borderWidth;
        }

        public void setBorderWidth(Double borderWidth) {
            this.borderWidth = borderWidth;
        }

        public Boolean getColorByPoint() {
            return colorByPoint;
        }

        public void setColorByPoint(Boolean colorByPoint) {
            this.colorByPoint = colorByPoint;
        }

        public String[] getColors() {
            return colors;
        }

        public void setColors(String[] colors) {
            this.colors = colors;
        }

        public String getCursor() {
            return cursor;
        }

        public void setCursor(String cursor) {
            this.cursor = cursor;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        public DataLabels getDataLabels() {
            return dataLabels;
        }

        public void setDataLabels(DataLabels dataLabels) {
            this.dataLabels = dataLabels;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSelected() {
            return selected;
        }

        public void setSelected(Boolean selected) {
            this.selected = selected;
        }

        public Double getSlicedOffset() {
            return slicedOffset;
        }

        public void setSlicedOffset(Double slicedOffset) {
            this.slicedOffset = slicedOffset;
        }

        public Tooltip getTooltip() {
            return tooltip;
        }

        public void setTooltip(Tooltip tooltip) {
            this.tooltip = tooltip;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getVisible() {
            return visible;
        }

        public void setVisible(Boolean visible) {
            this.visible = visible;
        }
    }
    
    public class Data {
        private Color color;
        private DataLabels dataLabels = new DataLabels();
        private String drilldown;
        private String id;
        private Double labelrank;
        private Double legendIndex;
        private String name;
        private Boolean selected;
        private Boolean sliced;
        private Double y;

        public Data(String name, Double y) {
            this.name = name;
            this.y = y;
        }
        
        public Data(String name, Double y, String drilldown) {
            this.name = name;
            this.y = y;
            this.drilldown = drilldown;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public DataLabels getDataLabels() {
            return dataLabels;
        }

        public void setDataLabels(DataLabels dataLabels) {
            this.dataLabels = dataLabels;
        }

        public String getDrilldown() {
            return drilldown;
        }

        public void setDrilldown(String drilldown) {
            this.drilldown = drilldown;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Double getLabelrank() {
            return labelrank;
        }

        public void setLabelrank(Double labelrank) {
            this.labelrank = labelrank;
        }

        public Double getLegendIndex() {
            return legendIndex;
        }

        public void setLegendIndex(Double legendIndex) {
            this.legendIndex = legendIndex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSelected() {
            return selected;
        }

        public void setSelected(Boolean selected) {
            this.selected = selected;
        }

        public Boolean getSliced() {
            return sliced;
        }

        public void setSliced(Boolean sliced) {
            this.sliced = sliced;
        }

        public Double getY() {
            return y;
        }

        public void setY(Double y) {
            this.y = y;
        }
    }
}
