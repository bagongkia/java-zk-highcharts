package com.bagongkia.highcharts.component;

import java.util.ArrayList;
import java.util.List;

public class Axis {
    private Boolean allowDecimals;
    private String[] categories;
    private Labels labels = new Labels();
    private String lineColor;
    private Double lineWidth;
    private Double min;
    private Double max;
    private String minorTickColor;
    private String minorTickInterval;
    private Double minorTickLength;
    private String minorTickPosition;
    private Double minorTickWidth;
    private List<PlotBands> plotBands = new ArrayList<>();
    private List<String[]> stops = new ArrayList<>();
    private Double tickAmount;
    private String tickColor;
    private Double tickInterval;
    private Double tickLength;
    private Double tickPixelInterval;
    private String tickPosition;
    private Double tickWidth;
    private String type;
    private Boolean visible;
    private AxisTitle title = new AxisTitle();

    public Boolean getAllowDecimals() {
        return allowDecimals;
    }

    public void setAllowDecimals(Boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public Double getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(Double lineWidth) {
        this.lineWidth = lineWidth;
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

    public String getMinorTickColor() {
        return minorTickColor;
    }

    public void setMinorTickColor(String minorTickColor) {
        this.minorTickColor = minorTickColor;
    }

    public String getMinorTickInterval() {
        return minorTickInterval;
    }

    public void setMinorTickInterval(String minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
    }

    public Double getMinorTickLength() {
        return minorTickLength;
    }

    public void setMinorTickLength(Double minorTickLength) {
        this.minorTickLength = minorTickLength;
    }

    public String getMinorTickPosition() {
        return minorTickPosition;
    }

    public void setMinorTickPosition(String minorTickPosition) {
        this.minorTickPosition = minorTickPosition;
    }

    public Double getMinorTickWidth() {
        return minorTickWidth;
    }

    public void setMinorTickWidth(Double minorTickWidth) {
        this.minorTickWidth = minorTickWidth;
    }

    public List<PlotBands> getPlotBands() {
        return plotBands;
    }

    public void setPlotBands(List<PlotBands> plotBands) {
        this.plotBands = plotBands;
    }

    public List<String[]> getStops() {
        return stops;
    }

    public void setStops(List<String[]> stops) {
        this.stops = stops;
    }

    public Double getTickAmount() {
        return tickAmount;
    }

    public void setTickAmount(Double tickAmount) {
        this.tickAmount = tickAmount;
    }

    public String getTickColor() {
        return tickColor;
    }

    public void setTickColor(String tickColor) {
        this.tickColor = tickColor;
    }

    public Double getTickInterval() {
        return tickInterval;
    }

    public void setTickInterval(Double tickInterval) {
        this.tickInterval = tickInterval;
    }

    public Double getTickLength() {
        return tickLength;
    }

    public void setTickLength(Double tickLength) {
        this.tickLength = tickLength;
    }

    public Double getTickPixelInterval() {
        return tickPixelInterval;
    }

    public void setTickPixelInterval(Double tickPixelInterval) {
        this.tickPixelInterval = tickPixelInterval;
    }

    public String getTickPosition() {
        return tickPosition;
    }

    public void setTickPosition(String tickPosition) {
        this.tickPosition = tickPosition;
    }

    public Double getTickWidth() {
        return tickWidth;
    }

    public void setTickWidth(Double tickWidth) {
        this.tickWidth = tickWidth;
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

    public AxisTitle getTitle() {
        return title;
    }

    public void setTitle(AxisTitle title) {
        this.title = title;
    }

    public class AxisTitle {
        String align;
        String enabled;
        Double margin;
        Double offset;
        Double rotation;
        String text;
        Double x;
        Double y;
        
        public AxisTitle() {
        }

        public String getAlign() {
            return align;
        }

        public void setAlign(String align) {
            this.align = align;
        }

        public String getEnabled() {
            return enabled;
        }

        public void setEnabled(String enabled) {
            this.enabled = enabled;
        }

        public Double getMargin() {
            return margin;
        }

        public void setMargin(Double margin) {
            this.margin = margin;
        }

        public Double getOffset() {
            return offset;
        }

        public void setOffset(Double offset) {
            this.offset = offset;
        }

        public Double getRotation() {
            return rotation;
        }

        public void setRotation(Double rotation) {
            this.rotation = rotation;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
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
    
    public class Labels {
        private String align;
        private Double[] autoRotation;
        private Double autoRotationLimit;
        private Double distance;
        private Boolean enabled;
        private String format;
        private Double maxStaggerLines;
        private String overflow;
        private Double padding;
        private Boolean reserveSpace;
        private Double rotation;
        private Double staggerLines;
        private Double step;
        private Object style;
        private Boolean useHTML;
        private Double x;
        private Double y;
        private Double zIndex;

        public String getAlign() {
            return align;
        }

        public void setAlign(String align) {
            this.align = align;
        }

        public Double[] getAutoRotation() {
            return autoRotation;
        }

        public void setAutoRotation(Double[] autoRotation) {
            this.autoRotation = autoRotation;
        }

        public Double getAutoRotationLimit() {
            return autoRotationLimit;
        }

        public void setAutoRotationLimit(Double autoRotationLimit) {
            this.autoRotationLimit = autoRotationLimit;
        }

        public Double getDistance() {
            return distance;
        }

        public void setDistance(Double distance) {
            this.distance = distance;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public Double getMaxStaggerLines() {
            return maxStaggerLines;
        }

        public void setMaxStaggerLines(Double maxStaggerLines) {
            this.maxStaggerLines = maxStaggerLines;
        }

        public String getOverflow() {
            return overflow;
        }

        public void setOverflow(String overflow) {
            this.overflow = overflow;
        }

        public Double getPadding() {
            return padding;
        }

        public void setPadding(Double padding) {
            this.padding = padding;
        }

        public Boolean getReserveSpace() {
            return reserveSpace;
        }

        public void setReserveSpace(Boolean reserveSpace) {
            this.reserveSpace = reserveSpace;
        }

        public Double getRotation() {
            return rotation;
        }

        public void setRotation(Double rotation) {
            this.rotation = rotation;
        }

        public Double getStaggerLines() {
            return staggerLines;
        }

        public void setStaggerLines(Double staggerLines) {
            this.staggerLines = staggerLines;
        }

        public Double getStep() {
            return step;
        }

        public void setStep(Double step) {
            this.step = step;
        }

        public Object getStyle() {
            return style;
        }

        public void setStyle(Object style) {
            this.style = style;
        }

        public Boolean getUseHTML() {
            return useHTML;
        }

        public void setUseHTML(Boolean useHTML) {
            this.useHTML = useHTML;
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

        public Double getzIndex() {
            return zIndex;
        }

        public void setzIndex(Double zIndex) {
            this.zIndex = zIndex;
        }
    }
    
    public static class PlotBands {
        private String borderColor;
        private Double borderWidth;
        private String color;
        private Double from;
        private String id;
        private String innerRadius;
        private String outerRadius;
        private Double thickness;
        private Double to;
        private Double zIndex;

        public PlotBands(Double from, Double to, String color, String outerRadius) {
            this.from = from;
            this.to = to;
            this.color = color;
            this.outerRadius = outerRadius;
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

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Double getFrom() {
            return from;
        }

        public void setFrom(Double from) {
            this.from = from;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public Double getThickness() {
            return thickness;
        }

        public void setThickness(Double thickness) {
            this.thickness = thickness;
        }

        public Double getTo() {
            return to;
        }

        public void setTo(Double to) {
            this.to = to;
        }

        public Double getzIndex() {
            return zIndex;
        }

        public void setzIndex(Double zIndex) {
            this.zIndex = zIndex;
        }
    }
}
