package com.bagongkia.highcharts.component;

import com.google.gson.JsonElement;
import java.awt.Color;

public class PlotOptions {
    
    private Pie pie = new Pie();

    public Pie getPie() {
        return pie;
    }

    public void setPie(Pie pie) {
        this.pie = pie;
    }
    
    public class Pie {
        private Boolean allowPointSelect;
        private Boolean animation;
        private Double animationLimit;
        private String borderColor;
        private Double borderWidth;
        private String[] center;
        private Color[] colors;
        private String cursor;
        private DataLabels dataLabels = new DataLabels();
        private Double depth;
        private Boolean enableMouseTracking;
        private Double endAngle;
        private Boolean getExtremesFromAll;
        private Boolean ignoreHiddenPoint;
        private String innerSize;
        private String[] keys;
        private String linkedTo;
        private Double minSize;
        private Boolean selected;
        private Boolean shadow;
        private Boolean showInLegend;
        private String size;
        private Double slicedObject;
        private Double startAngel;
        private States states;
        private Boolean stickyTracking;
        private Tooltip tooltip;
        private Boolean visible;
        private String zoneAxis;
        private JsonElement zones;

        public Boolean getAllowPointSelect() {
            return allowPointSelect;
        }

        public void setAllowPointSelect(Boolean allowPointSelect) {
            this.allowPointSelect = allowPointSelect;
        }

        public Boolean getAnimation() {
            return animation;
        }

        public void setAnimation(Boolean animation) {
            this.animation = animation;
        }

        public Double getAnimationLimit() {
            return animationLimit;
        }

        public void setAnimationLimit(Double animationLimit) {
            this.animationLimit = animationLimit;
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

        public String[] getCenter() {
            return center;
        }

        public void setCenter(String[] center) {
            this.center = center;
        }

        public Color[] getColors() {
            return colors;
        }

        public void setColors(Color[] colors) {
            this.colors = colors;
        }

        public String getCursor() {
            return cursor;
        }

        public void setCursor(String cursor) {
            this.cursor = cursor;
        }

        public DataLabels getDataLabels() {
            return dataLabels;
        }

        public void setDataLabels(DataLabels dataLabels) {
            this.dataLabels = dataLabels;
        }

        public Double getDepth() {
            return depth;
        }

        public void setDepth(Double depth) {
            this.depth = depth;
        }

        public Boolean getEnableMouseTracking() {
            return enableMouseTracking;
        }

        public void setEnableMouseTracking(Boolean enableMouseTracking) {
            this.enableMouseTracking = enableMouseTracking;
        }

        public Double getEndAngle() {
            return endAngle;
        }

        public void setEndAngle(Double endAngle) {
            this.endAngle = endAngle;
        }

        public Boolean getGetExtremesFromAll() {
            return getExtremesFromAll;
        }

        public void setGetExtremesFromAll(Boolean getExtremesFromAll) {
            this.getExtremesFromAll = getExtremesFromAll;
        }

        public Boolean getIgnoreHiddenPoint() {
            return ignoreHiddenPoint;
        }

        public void setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
            this.ignoreHiddenPoint = ignoreHiddenPoint;
        }

        public String getInnerSize() {
            return innerSize;
        }

        public void setInnerSize(String innerSize) {
            this.innerSize = innerSize;
        }

        public String[] getKeys() {
            return keys;
        }

        public void setKeys(String[] keys) {
            this.keys = keys;
        }

        public String getLinkedTo() {
            return linkedTo;
        }

        public void setLinkedTo(String linkedTo) {
            this.linkedTo = linkedTo;
        }

        public Double getMinSize() {
            return minSize;
        }

        public void setMinSize(Double minSize) {
            this.minSize = minSize;
        }

        public Boolean getSelected() {
            return selected;
        }

        public void setSelected(Boolean selected) {
            this.selected = selected;
        }

        public Boolean getShadow() {
            return shadow;
        }

        public void setShadow(Boolean shadow) {
            this.shadow = shadow;
        }

        public Boolean getShowInLegend() {
            return showInLegend;
        }

        public void setShowInLegend(Boolean showInLegend) {
            this.showInLegend = showInLegend;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public Double getSlicedObject() {
            return slicedObject;
        }

        public void setSlicedObject(Double slicedObject) {
            this.slicedObject = slicedObject;
        }

        public Double getStartAngel() {
            return startAngel;
        }

        public void setStartAngel(Double startAngel) {
            this.startAngel = startAngel;
        }

        public States getStates() {
            return states;
        }

        public void setStates(States states) {
            this.states = states;
        }

        public Boolean getStickyTracking() {
            return stickyTracking;
        }

        public void setStickyTracking(Boolean stickyTracking) {
            this.stickyTracking = stickyTracking;
        }

        public Tooltip getTooltip() {
            return tooltip;
        }

        public void setTooltip(Tooltip tooltip) {
            this.tooltip = tooltip;
        }

        public Boolean getVisible() {
            return visible;
        }

        public void setVisible(Boolean visible) {
            this.visible = visible;
        }

        public String getZoneAxis() {
            return zoneAxis;
        }

        public void setZoneAxis(String zoneAxis) {
            this.zoneAxis = zoneAxis;
        }

        public JsonElement getZones() {
            return zones;
        }

        public void setZones(JsonElement zones) {
            this.zones = zones;
        }
        
        public class States {
            private Double brightness;
            private Boolean enabled;
            private Halo halo = new Halo();
            private Double lineWidth;
            private Double lineWidthPlus;
            private Marker marker;

            public Double getBrightness() {
                return brightness;
            }

            public void setBrightness(Double brightness) {
                this.brightness = brightness;
            }

            public Boolean getEnabled() {
                return enabled;
            }

            public void setEnabled(Boolean enabled) {
                this.enabled = enabled;
            }

            public Halo getHalo() {
                return halo;
            }

            public void setHalo(Halo halo) {
                this.halo = halo;
            }

            public Double getLineWidth() {
                return lineWidth;
            }

            public void setLineWidth(Double lineWidth) {
                this.lineWidth = lineWidth;
            }

            public Double getLineWidthPlus() {
                return lineWidthPlus;
            }

            public void setLineWidthPlus(Double lineWidthPlus) {
                this.lineWidthPlus = lineWidthPlus;
            }

            public Marker getMarker() {
                return marker;
            }

            public void setMarker(Marker marker) {
                this.marker = marker;
            }
            
            public class Halo {
                private Object attributes;
                private Double opacity;
                private Double size;

                public Object getAttributes() {
                    return attributes;
                }

                public void setAttributes(Object attributes) {
                    this.attributes = attributes;
                }

                public Double getOpacity() {
                    return opacity;
                }

                public void setOpacity(Double opacity) {
                    this.opacity = opacity;
                }

                public Double getSize() {
                    return size;
                }

                public void setSize(Double size) {
                    this.size = size;
                }
            }
            
            public class Marker {
                private Boolean enabled;
                private Color fillColor;
                private Double height;
                private Color lineColor;
                private Double lineWidth;
                private Double radius;
                private String states;
                private String symbol;
                private Double width;

                public Boolean getEnabled() {
                    return enabled;
                }

                public void setEnabled(Boolean enabled) {
                    this.enabled = enabled;
                }

                public Color getFillColor() {
                    return fillColor;
                }

                public void setFillColor(Color fillColor) {
                    this.fillColor = fillColor;
                }

                public Double getHeight() {
                    return height;
                }

                public void setHeight(Double height) {
                    this.height = height;
                }

                public Color getLineColor() {
                    return lineColor;
                }

                public void setLineColor(Color lineColor) {
                    this.lineColor = lineColor;
                }

                public Double getLineWidth() {
                    return lineWidth;
                }

                public void setLineWidth(Double lineWidth) {
                    this.lineWidth = lineWidth;
                }

                public Double getRadius() {
                    return radius;
                }

                public void setRadius(Double radius) {
                    this.radius = radius;
                }

                public String getStates() {
                    return states;
                }

                public void setStates(String states) {
                    this.states = states;
                }

                public String getSymbol() {
                    return symbol;
                }

                public void setSymbol(String symbol) {
                    this.symbol = symbol;
                }

                public Double getWidth() {
                    return width;
                }

                public void setWidth(Double width) {
                    this.width = width;
                }
            }
        }
    }
}
