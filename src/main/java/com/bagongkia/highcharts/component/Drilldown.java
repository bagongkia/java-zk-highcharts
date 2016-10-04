package com.bagongkia.highcharts.component;

public class Drilldown {
    private Object activeAxisLabelStyle = new Object();
    private Object activeDataLabelStyle = new Object();
    private Boolean allowPointDrilldown;
    private DrillUpButton drillUpButton = new DrillUpButton();
    private Object[] series;
    
    public class DrillUpButton {
        private Object position = new Object();
        private String relativeTo;
        private Object theme = new Object();

        public Object getPosition() {
            return position;
        }

        public void setPosition(Object position) {
            this.position = position;
        }

        public String getRelativeTo() {
            return relativeTo;
        }

        public void setRelativeTo(String relativeTo) {
            this.relativeTo = relativeTo;
        }

        public Object getTheme() {
            return theme;
        }

        public void setTheme(Object theme) {
            this.theme = theme;
        }
    }

    public Object getActiveAxisLabelStyle() {
        return activeAxisLabelStyle;
    }

    public void setActiveAxisLabelStyle(Object activeAxisLabelStyle) {
        this.activeAxisLabelStyle = activeAxisLabelStyle;
    }

    public Object getActiveDataLabelStyle() {
        return activeDataLabelStyle;
    }

    public void setActiveDataLabelStyle(Object activeDataLabelStyle) {
        this.activeDataLabelStyle = activeDataLabelStyle;
    }

    public Boolean getAllowPointDrilldown() {
        return allowPointDrilldown;
    }

    public void setAllowPointDrilldown(Boolean allowPointDrilldown) {
        this.allowPointDrilldown = allowPointDrilldown;
    }

    public DrillUpButton getDrillUpButton() {
        return drillUpButton;
    }

    public void setDrillUpButton(DrillUpButton drillUpButton) {
        this.drillUpButton = drillUpButton;
    }

    public Object[] getSeries() {
        return series;
    }

    public void setSeries(Object[] series) {
        this.series = series;
    }
}
