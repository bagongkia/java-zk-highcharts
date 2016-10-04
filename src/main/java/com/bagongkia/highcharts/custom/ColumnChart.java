package com.bagongkia.highcharts.custom;

import com.google.gson.JsonElement;
import com.bagongkia.highcharts.component.Axis;
import com.bagongkia.highcharts.component.Chart;
import com.bagongkia.highcharts.component.DataLabels;
import com.bagongkia.highcharts.component.Drilldown;
import com.bagongkia.highcharts.component.PlotOptions;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ColumnChart extends HChart {
    private String xAxisTitle;
    private String yAxisTitle;
    
    private List<Series> seriesList;
    private Map<String, List<Data>> seriesMap = new LinkedHashMap<>();
    
    private List<Series> drilldownSeriesList;
    private Map<String, List<Data>> drilldownSeriesMap = new LinkedHashMap<>();
    
    public ColumnChart() {
        chart = new Chart();
        xAxis = new Axis();
        yAxis = new Axis();
        drilldown = new Drilldown();
        plotOptions = new PlotOptions();
    }

    @Override
    void initChart() {
        chart.setType("column");
    }

    @Override
    void initxAxis() {
        xAxis.setType("category");
        xAxis.getTitle().setText(getxAxisTitle());
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
            series.setColorByPoint(false);
            series.setData(entry.getValue());
            drilldownSeriesList.add(series);
        }
        Series[] arrSeries = new Series[drilldownSeriesList.size()];
        drilldownSeriesList.toArray(arrSeries);
        drilldown.setSeries(arrSeries);
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
    
    public void setLegend(String layout, String align, String verticalAlign, Double borderWidth) {
        setLegendLayout(layout);
        setLegendAlign(align);
        setLegendVerticalAlign(verticalAlign);
        setLegendBorderWidth(borderWidth);
    }
    
    public class Series {
        private String name;
        private Boolean colorByPoint;
        private List<Data> data;
        private String id;
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getColorByPoint() {
            return colorByPoint;
        }

        public void setColorByPoint(Boolean colorByPoint) {
            this.colorByPoint = colorByPoint;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
    
    public class Data {
        private Color color;
        private DataLabels dataLabels;
        private String drilldown;
        private Double labelrank;
        private String name;
        private Boolean selected;
        private Double x;
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

        public Double getX() {
            return x;
        }

        public void setX(Double x) {
            this.x = x;
        }

        public Double getY() {
            return y;
        }

        public void setY(Double y) {
            this.y = y;
        }
    }
}
