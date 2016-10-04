package com.bagongkia.highcharts.component;

public class Legend {
    private String align;
    private String backgroundColor;
    private String borderColor;
    private Double borderRadius;
    private Double borderWidth;
    private Boolean enabled;
    private Boolean floating;
    private Double itemDistance;
    private Object itemHiddenStyle;
    private Object itemHoverStyle;
    private Double itemMarginBottom;
    private Double itemMarginTop;
    private Object itemStyle;
    private Double itemWidth;
    private String labelFormat;
    private String layout;
    private Double lineHeight;
    private Double margin;
    private Double maxHeight;
    private Navigation navigation = new Navigation();
    private Double padding;
    private Boolean reversed;
    private Boolean rtl;
    private Boolean shadow;
    private Object style;
    private Double symbolHeight;
    private Double symbolPadding;
    private Double symbolRadius;
    private Double symbolWidth;
    private Title title = new Title();
    private Boolean useHTML;
    private String verticalAlign;
    private Boolean width;
    private Double x;
    private Double y;

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getFloating() {
        return floating;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public Double getItemDistance() {
        return itemDistance;
    }

    public void setItemDistance(Double itemDistance) {
        this.itemDistance = itemDistance;
    }

    public Object getItemHiddenStyle() {
        return itemHiddenStyle;
    }

    public void setItemHiddenStyle(Object itemHiddenStyle) {
        this.itemHiddenStyle = itemHiddenStyle;
    }

    public Object getItemHoverStyle() {
        return itemHoverStyle;
    }

    public void setItemHoverStyle(Object itemHoverStyle) {
        this.itemHoverStyle = itemHoverStyle;
    }

    public Double getItemMarginBottom() {
        return itemMarginBottom;
    }

    public void setItemMarginBottom(Double itemMarginBottom) {
        this.itemMarginBottom = itemMarginBottom;
    }

    public Double getItemMarginTop() {
        return itemMarginTop;
    }

    public void setItemMarginTop(Double itemMarginTop) {
        this.itemMarginTop = itemMarginTop;
    }

    public Object getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(Object itemStyle) {
        this.itemStyle = itemStyle;
    }

    public Double getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(Double itemWidth) {
        this.itemWidth = itemWidth;
    }

    public String getLabelFormat() {
        return labelFormat;
    }

    public void setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Double getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(Double lineHeight) {
        this.lineHeight = lineHeight;
    }

    public Double getMargin() {
        return margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public Double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public Double getPadding() {
        return padding;
    }

    public void setPadding(Double padding) {
        this.padding = padding;
    }

    public Boolean getReversed() {
        return reversed;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }

    public Boolean getRtl() {
        return rtl;
    }

    public void setRtl(Boolean rtl) {
        this.rtl = rtl;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    public Object getStyle() {
        return style;
    }

    public void setStyle(Object style) {
        this.style = style;
    }

    public Double getSymbolHeight() {
        return symbolHeight;
    }

    public void setSymbolHeight(Double symbolHeight) {
        this.symbolHeight = symbolHeight;
    }

    public Double getSymbolPadding() {
        return symbolPadding;
    }

    public void setSymbolPadding(Double symbolPadding) {
        this.symbolPadding = symbolPadding;
    }

    public Double getSymbolRadius() {
        return symbolRadius;
    }

    public void setSymbolRadius(Double symbolRadius) {
        this.symbolRadius = symbolRadius;
    }

    public Double getSymbolWidth() {
        return symbolWidth;
    }

    public void setSymbolWidth(Double symbolWidth) {
        this.symbolWidth = symbolWidth;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Boolean getUseHTML() {
        return useHTML;
    }

    public void setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
    }

    public String getVerticalAlign() {
        return verticalAlign;
    }

    public void setVerticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
    }

    public Boolean getWidth() {
        return width;
    }

    public void setWidth(Boolean width) {
        this.width = width;
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
    
    
    
    public class Navigation {
        private String activeColor;
        private Boolean animation;
        private Double arrowSize;
        private Boolean enabled;
        private String inactiveColor;
        private Object style;

        public Navigation() {
        }

        public String getActiveColor() {
            return activeColor;
        }

        public void setActiveColor(String activeColor) {
            this.activeColor = activeColor;
        }

        public Boolean getAnimation() {
            return animation;
        }

        public void setAnimation(Boolean animation) {
            this.animation = animation;
        }

        public Double getArrowSize() {
            return arrowSize;
        }

        public void setArrowSize(Double arrowSize) {
            this.arrowSize = arrowSize;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getInactiveColor() {
            return inactiveColor;
        }

        public void setInactiveColor(String inactiveColor) {
            this.inactiveColor = inactiveColor;
        }

        public Object getStyle() {
            return style;
        }

        public void setStyle(Object style) {
            this.style = style;
        }
    }
    
    public class Title {
        private Object style;
        private String text;

        public Title() {
        }

        public Object getStyle() {
            return style;
        }

        public void setStyle(Object style) {
            this.style = style;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
