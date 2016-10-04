package com.bagongkia.highcharts.component;

public class Pane {
    private Background background = new Background();
    private String[] center = new String[2];
    private Double endAngle;
    private String size;
    private Double startAngle;

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public String[] getCenter() {
        return center;
    }

    public void setCenter(String[] center) {
        this.center = center;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }
    
    public class Background {
        private String innerRadius;
        private String outerRadius;
        private String shape;

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

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }
    }
}
