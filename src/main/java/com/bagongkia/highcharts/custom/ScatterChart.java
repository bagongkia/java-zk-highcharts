package com.bagongkia.highcharts.custom;

import com.google.gson.JsonElement;
import com.bagongkia.highcharts.component.Axis;
import com.bagongkia.highcharts.component.Chart;
import com.bagongkia.highcharts.component.DataLabels;
import com.bagongkia.highcharts.component.Drilldown;
import com.bagongkia.highcharts.component.Pane;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ScatterChart extends HChart {
    private String xAxisTitle;
    private String yAxisTitle;
    private String zoomType = "xy";
    
    private List<Series> seriesList;
    private final Map<String, List<Data>> seriesMap = new LinkedHashMap<>();
    
    public ScatterChart() {
        chart = new Chart();
        xAxis = new Axis();
        yAxis = new Axis();
        pane = new Pane();
    }
    
    @Override
    void initChart() {
        chart.setType("scatter");
        chart.setZoomType(getZoomType());
    }

    @Override
    void initxAxis() {
        xAxis.getTitle().setText(getxAxisTitle());
    }

    @Override
    void inityAxis() {
        yAxis.getTitle().setText(getyAxisTitle());
    }

    @Override
    void initSeries() {
        Series series;
        seriesList =  new ArrayList<>();
        for (Map.Entry<String, List<Data>> entry : seriesMap.entrySet()) {
            series = new Series();
            series.setName((entry.getKey()).split("\\^")[0]);
            series.setColor((entry.getKey()).split("\\^")[1]);
            series.setData(entry.getValue());
            seriesList.add(series);
        }
        String json = gson.toJson(seriesList);
        jsonSeries = (JsonElement)jsonParser.parse(json);
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

    public String getZoomType() {
        return zoomType;
    }

    public void setZoomType(String zoomType) {
        this.zoomType = zoomType;
    }
    
    public void addSeries(String seriesName, String seriesColor, Double x, Double y) {
        List<Data> dataList = new ArrayList<>();
        if (seriesMap.get(seriesName + "^" + seriesColor) != null) {
            dataList = seriesMap.get(seriesName + "^" + seriesColor);
        }
        dataList.add(new Data(seriesName, x, y));
        seriesMap.put(seriesName + "^" + seriesColor, dataList);
    }
    
    public void setLegend(String layout, String align, String verticalAlign, Double borderWidth) {
        setLegendLayout(layout);
        setLegendAlign(align);
        setLegendVerticalAlign(verticalAlign);
        setLegendBorderWidth(borderWidth);
    }
    
    public class Series {
        private String name;
        private String color;
        private List<Data> data = new ArrayList<>();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }
    }
    
    public class Data {
        private String color;
        private DataLabels dataLabels = new DataLabels();
        private Drilldown drilldown = new Drilldown();
        private String id;
        private String name;
        private Boolean selected;
        private Double x;
        private Double y;

        public Data(String name, Double x, Double y) {
            this.name = name;
            this.x = x;
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

        public Drilldown getDrilldown() {
            return drilldown;
        }

        public void setDrilldown(Drilldown drilldown) {
            this.drilldown = drilldown;
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
