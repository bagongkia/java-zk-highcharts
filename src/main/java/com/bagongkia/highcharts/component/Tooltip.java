package com.bagongkia.highcharts.component;

import java.awt.Color;

public class Tooltip {
    private Boolean animation;
    private Color backgroundColor;
    private Color borderColor;
    private Double borderRadius;
    private Double borderWidth;
    private Boolean crosshairs;
    private DateTimeLabelFormats dateTimeLabelFormats = new DateTimeLabelFormats();
    private Boolean enabled;
    private Boolean followPointer;
    private Boolean followTouchMove;
    private String footerFormat;
    private String headerFormat;
    private Double hideDelay;
    private String pointFormat;
    private Boolean shadow;
    private String shape;
    private Boolean shared;
    private Double snap;
    private Object[] style;
    private Boolean useHTML;
    private Double valueDecimals;
    private String valuePrefix;
    private String valueSuffix;
    private String xDateFormat;

    public Boolean getAnimation() {
        return animation;
    }

    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Double getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(Double borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Boolean getCrosshairs() {
        return crosshairs;
    }

    public void setCrosshairs(Boolean crosshairs) {
        this.crosshairs = crosshairs;
    }

    public DateTimeLabelFormats getDateTimeLabelFormats() {
        return dateTimeLabelFormats;
    }

    public void setDateTimeLabelFormats(DateTimeLabelFormats dateTimeLabelFormats) {
        this.dateTimeLabelFormats = dateTimeLabelFormats;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getFollowPointer() {
        return followPointer;
    }

    public void setFollowPointer(Boolean followPointer) {
        this.followPointer = followPointer;
    }

    public Boolean getFollowTouchMove() {
        return followTouchMove;
    }

    public void setFollowTouchMove(Boolean followTouchMove) {
        this.followTouchMove = followTouchMove;
    }

    public String getFooterFormat() {
        return footerFormat;
    }

    public void setFooterFormat(String footerFormat) {
        this.footerFormat = footerFormat;
    }

    public String getHeaderFormat() {
        return headerFormat;
    }

    public void setHeaderFormat(String headerFormat) {
        this.headerFormat = headerFormat;
    }

    public Double getHideDelay() {
        return hideDelay;
    }

    public void setHideDelay(Double hideDelay) {
        this.hideDelay = hideDelay;
    }

    public String getPointFormat() {
        return pointFormat;
    }

    public void setPointFormat(String pointFormat) {
        this.pointFormat = pointFormat;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public Double getSnap() {
        return snap;
    }

    public void setSnap(Double snap) {
        this.snap = snap;
    }

    public Object[] getStyle() {
        return style;
    }

    public void setStyle(Object[] style) {
        this.style = style;
    }

    public Boolean getUseHTML() {
        return useHTML;
    }

    public void setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
    }

    public Double getValueDecimals() {
        return valueDecimals;
    }

    public void setValueDecimals(Double valueDecimals) {
        this.valueDecimals = valueDecimals;
    }

    public String getValuePrefix() {
        return valuePrefix;
    }

    public void setValuePrefix(String valuePrefix) {
        this.valuePrefix = valuePrefix;
    }

    public String getValueSuffix() {
        return valueSuffix;
    }

    public void setValueSuffix(String valueSuffix) {
        this.valueSuffix = valueSuffix;
    }

    public String getxDateFormat() {
        return xDateFormat;
    }

    public void setxDateFormat(String xDateFormat) {
        this.xDateFormat = xDateFormat;
    }
    
    public class DateTimeLabelFormats {
        private String millisecond;
        private String second;
        private String minute;
        private String hour;
        private String day;
        private String week;
        private String month;
        private String year;
        
        public DateTimeLabelFormats() {
        }

        public String getMillisecond() {
            return millisecond;
        }

        public void setMillisecond(String millisecond) {
            this.millisecond = millisecond;
        }

        public String getSecond() {
            return second;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        public String getMinute() {
            return minute;
        }

        public void setMinute(String minute) {
            this.minute = minute;
        }

        public String getHour() {
            return hour;
        }

        public void setHour(String hour) {
            this.hour = hour;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }
    }
}
