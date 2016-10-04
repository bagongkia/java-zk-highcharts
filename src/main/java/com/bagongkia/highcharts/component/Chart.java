package com.bagongkia.highcharts.component;

public class Chart {
    private Boolean alignTicks;
    private Boolean animation;
    private String backgroundColor;
    private String borderColor;
    private Double borderRadius;
    private Double borderWidth;
    private String className;
    
    private String type;
    private String zoomType;
    private Options3d options3d = new Options3d();

    public Boolean getAlignTicks() {
        return alignTicks;
    }

    public void setAlignTicks(Boolean alignTicks) {
        this.alignTicks = alignTicks;
    }

    public Boolean getAnimation() {
        return animation;
    }

    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZoomType() {
        return zoomType;
    }

    public void setZoomType(String zoomType) {
        this.zoomType = zoomType;
    }

    public Options3d getOptions3d() {
        return options3d;
    }

    public void setOptions3d(Options3d options3d) {
        this.options3d = options3d;
    }

    
    public class Options3d {
        private Double alpha;
        private Double beta;
        private Double depth;
        private Boolean enabled;
        private Boolean fitToPlot;
        private Frame frame = new Frame();
        private Double viewDistance;

        public Options3d() {
        }

        public Double getAlpha() {
            return alpha;
        }

        public void setAlpha(Double alpha) {
            this.alpha = alpha;
        }

        public Double getBeta() {
            return beta;
        }

        public void setBeta(Double beta) {
            this.beta = beta;
        }

        public Double getDepth() {
            return depth;
        }

        public void setDepth(Double depth) {
            this.depth = depth;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Boolean getFitToPlot() {
            return fitToPlot;
        }

        public void setFitToPlot(Boolean fitToPlot) {
            this.fitToPlot = fitToPlot;
        }

        public Frame getFrame() {
            return frame;
        }

        public void setFrame(Frame frame) {
            this.frame = frame;
        }

        public Double getViewDistance() {
            return viewDistance;
        }

        public void setViewDistance(Double viewDistance) {
            this.viewDistance = viewDistance;
        }
    }
    
    public class Frame {
        private Panel back = new Panel();
        private Panel bottom = new Panel();
        private Panel side = new Panel();

        public Frame() {
        }

        public Panel getBack() {
            return back;
        }

        public void setBack(Panel back) {
            this.back = back;
        }

        public Panel getBottom() {
            return bottom;
        }

        public void setBottom(Panel bottom) {
            this.bottom = bottom;
        }

        public Panel getSide() {
            return side;
        }

        public void setSide(Panel side) {
            this.side = side;
        }
        
        public class Panel {
            private String color;
            private Double size;

            public Panel() {
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public Double getSize() {
                return size;
            }

            public void setSize(Double size) {
                this.size = size;
            }
        }
    }
}
