package com.bagongkia.highcharts.custom;

import com.google.gson.JsonElement;
import com.bagongkia.highcharts.component.Axis;
import com.bagongkia.highcharts.component.Axis.PlotBands;
import com.bagongkia.highcharts.component.Chart;
import com.bagongkia.highcharts.component.DataLabels;
import com.bagongkia.highcharts.component.Pane;
import com.bagongkia.highcharts.component.Tooltip;
import java.util.ArrayList;
import java.util.List;

public class GaugeChart extends HChart {
    private String chartType = "gauge";
    private String xAxisTitle;
    private String yAxisTitle;
    
    private final List<PlotBands> plotBandsList = new ArrayList<>();
    private final List<String[]> stopsList = new ArrayList<>();
    
    private String innerRadius;
    private String outerRadius;
    private String paneSize;
    private String[] paneCenter = new String[2];
    private String paneShape;
    
    private Double min;
    private Double max;
    
    private String minorTickInterval;
    private Double tickInterval;
    private String tickColor;
    private Double tickWidth;
    private Double tickAmount;
    
    private Double startAngle;
    private Double endAngle;
    
    private List<Series> seriesList;
    private String seriesName;
    private Double seriesValue;
    private String seriesSuffix;

    public GaugeChart() {
        chart = new Chart();
        xAxis = new Axis();
        yAxis = new Axis();
        pane = new Pane();
    }

    @Override
    void initChart() {
        chart.setType(getChartType());
    }

    @Override
    void initxAxis() {
        xAxis.getTitle().setText(getxAxisTitle());
    }

    @Override
    void inityAxis() {
        yAxis.setMax(getMax());
        yAxis.setMin(getMin());
        yAxis.setPlotBands(plotBandsList);
        yAxis.setStops(stopsList);
        yAxis.setMinorTickInterval(getMinorTickInterval());
        yAxis.setTickInterval(getTickInterval());
        yAxis.setTickColor(getTickColor());
        yAxis.setTickWidth(getTickWidth());
        yAxis.setTickAmount(getTickAmount());
        yAxis.getTitle().setText(getyAxisTitle());
    }

    @Override
    void initSeries() {
        seriesList = new ArrayList<>();
        Series series =  new Series();
        series.setName(getSeriesName());
        series.getData().add(new Data(getSeriesValue()));
        series.getTooltip().setValueSuffix(getSeriesSuffix());
        
        seriesList.add(series);
        String json = gson.toJson(seriesList);
        jsonSeries = (JsonElement)jsonParser.parse(json);
    }
    
    @Override
    protected void initPane() {
        pane.setSize(getPaneSize());
        pane.setCenter(getPaneCenter());
        pane.setStartAngle(getStartAngle());
        pane.setEndAngle(getEndAngle());
        pane.getBackground().setInnerRadius(getInnerRadius());
        pane.getBackground().setOuterRadius(getOuterRadius());
        pane.getBackground().setShape(getPaneShape());
    }
    
    public void addPlotBands(Double from, Double to, String color, String outerRadius) {
        plotBandsList.add(new PlotBands(from, to, color, outerRadius));
    }
    
    public void addStops(Double value, String color) {
        stopsList.add(new String[]{value.toString(), color});
    }
    
    public void setTick(Double min, Double max, Double interval) {
        setMin(min);
        setMax(max);
        setTickInterval(interval);
    }
    
    public void setPaneAngle(Double startAngle, Double endAngle) {
        setStartAngle(startAngle);
        setEndAngle(endAngle);
    }
    
    public void setPaneBackground(String innerRadius, String outerRadius, String paneShape) {
        setInnerRadius(innerRadius);
        setOuterRadius(outerRadius);
        setPaneShape(paneShape);
    }
    
    public void setSeries(String seriesName, Double seriesValue, String seriesSuffix) {
        setSeriesName(seriesName);
        setSeriesValue(seriesValue);
        setSeriesSuffix(seriesSuffix);
    }

    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public String getxAxisTitle() {
        return xAxisTitle;
    }

    public void setxAxisTitle(String xAxisTitle) {
        this.xAxisTitle = xAxisTitle;
    }

    public String getyAxisTitle() {
        return yAxisTitle;
    }

    public void setyAxisTitle(String yAxisTitle) {
        this.yAxisTitle = yAxisTitle;
    }

    public String getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
    }

    public String getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(String outerRadius) {
        this.outerRadius = outerRadius;
    }

    public String getPaneSize() {
        return paneSize;
    }

    public void setPaneSize(String paneSize) {
        this.paneSize = paneSize;
    }

    public String[] getPaneCenter() {
        return paneCenter;
    }

    public void setPaneCenter(String[] paneCenter) {
        this.paneCenter = paneCenter;
    }
    
    public void setPaneCenter(String centerX, String centerY) {
        this.paneCenter[0] = centerX;
        this.paneCenter[1] = centerY;
    }

    public String getPaneShape() {
        return paneShape;
    }

    public void setPaneShape(String paneShape) {
        this.paneShape = paneShape;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public String getMinorTickInterval() {
        return minorTickInterval;
    }
    
    public void setMinorTickInterval(String minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
    }
    
    public void setMinorTickInterval(Double minorTickInterval) {
        this.minorTickInterval = minorTickInterval.toString();
    }

    public Double getTickInterval() {
        return tickInterval;
    }

    public void setTickInterval(Double tickInterval) {
        this.tickInterval = tickInterval;
    }

    public String getTickColor() {
        return tickColor;
    }

    public void setTickColor(String tickColor) {
        this.tickColor = tickColor;
    }

    public Double getTickWidth() {
        return tickWidth;
    }

    public void setTickWidth(Double tickWidth) {
        this.tickWidth = tickWidth;
    }

    public Double getTickAmount() {
        return tickAmount;
    }

    public void setTickAmount(Double tickAmount) {
        this.tickAmount = tickAmount;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Double getSeriesValue() {
        return seriesValue;
    }

    public void setSeriesValue(Double seriesValue) {
        this.seriesValue = seriesValue;
    }

    public String getSeriesSuffix() {
        return seriesSuffix;
    }

    public void setSeriesSuffix(String seriesSuffix) {
        this.seriesSuffix = seriesSuffix;
    }
    
    public class Series {
        private String name;
        private List<Data> data = new ArrayList<>();
        private Tooltip tooltip = new Tooltip();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }
        
        public Tooltip getTooltip() {
            return tooltip;
        }

        public void setTooltip(Tooltip tooltip) {
            this.tooltip = tooltip;
        }
    }
    
    public class Data {
        private String color;
        private DataLabels dataLabels = new DataLabels();
        private String id;
        private Double labelrank;
        private String name;
        private Boolean selected;
        private Double y;

        public Data(Double y) {
            this.y = y;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
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

        public Double getLabelrank() {
            return labelrank;
        }

        public void setLabelrank(Double labelrank) {
            this.labelrank = labelrank;
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

        public Double getY() {
            return y;
        }

        public void setY(Double y) {
            this.y = y;
        }
    }
}
