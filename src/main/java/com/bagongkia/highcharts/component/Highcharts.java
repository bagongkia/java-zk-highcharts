package com.bagongkia.highcharts.component;

import com.google.gson.JsonElement;

public class Highcharts {
    private Chart chart;
    private Title title;
    private Subtitle subtitle;
    private Axis xAxis;
    private Axis yAxis;
    private JsonElement series;
    private Pane pane;
    private Drilldown drilldown;
    private PlotOptions plotOptions;
    private Legend legend;
    private Tooltip tooltip;
    private Exporting exporting;
    private Credits credits;

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    public Axis getxAxis() {
        return xAxis;
    }

    public void setxAxis(Axis xAxis) {
        this.xAxis = xAxis;
    }

    public Axis getyAxis() {
        return yAxis;
    }

    public void setyAxis(Axis yAxis) {
        this.yAxis = yAxis;
    }

    public JsonElement getSeries() {
        return series;
    }

    public void setSeries(JsonElement series) {
        this.series = series;
    }

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public Drilldown getDrilldown() {
        return drilldown;
    }

    public void setDrilldown(Drilldown drilldown) {
        this.drilldown = drilldown;
    }

    public PlotOptions getPlotOptions() {
        return plotOptions;
    }

    public void setPlotOptions(PlotOptions plotOptions) {
        this.plotOptions = plotOptions;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public Exporting getExporting() {
        return exporting;
    }

    public void setExporting(Exporting exporting) {
        this.exporting = exporting;
    }

    public Credits getCredits() {
        return credits;
    }

    public void setCredits(Credits credits) {
        this.credits = credits;
    }
}
