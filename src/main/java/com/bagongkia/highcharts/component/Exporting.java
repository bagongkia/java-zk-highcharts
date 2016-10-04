package com.bagongkia.highcharts.component;

import java.util.ArrayList;
import java.util.List;

public class Exporting {
    private Boolean allowHTML;
    private Buttons buttons = new Buttons();
    private Object chartOptions;
    private Boolean enabled;
    private Boolean fallbackToExportServer;
    private String filename;
    private Object formAttributes;
    private Double printMaxWidth;
    private Double scale;
    private Double sourceHeight;
    private Double sourceWidth;
    private String type;
    private String url;
    private Double width;

    public Boolean getAllowHTML() {
        return allowHTML;
    }

    public void setAllowHTML(Boolean allowHTML) {
        this.allowHTML = allowHTML;
    }

    public Buttons getButtons() {
        return buttons;
    }

    public void setButtons(Buttons buttons) {
        this.buttons = buttons;
    }

    public Object getChartOptions() {
        return chartOptions;
    }

    public void setChartOptions(Object chartOptions) {
        this.chartOptions = chartOptions;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getFallbackToExportServer() {
        return fallbackToExportServer;
    }

    public void setFallbackToExportServer(Boolean fallbackToExportServer) {
        this.fallbackToExportServer = fallbackToExportServer;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Object getFormAttributes() {
        return formAttributes;
    }

    public void setFormAttributes(Object formAttributes) {
        this.formAttributes = formAttributes;
    }

    public Double getPrintMaxWidth() {
        return printMaxWidth;
    }

    public void setPrintMaxWidth(Double printMaxWidth) {
        this.printMaxWidth = printMaxWidth;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public Double getSourceHeight() {
        return sourceHeight;
    }

    public void setSourceHeight(Double sourceHeight) {
        this.sourceHeight = sourceHeight;
    }

    public Double getSourceWidth() {
        return sourceWidth;
    }

    public void setSourceWidth(Double sourceWidth) {
        this.sourceWidth = sourceWidth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
    
    public class Buttons {
        private ContextButton contextButton;

        public Buttons() {
             contextButton = new ContextButton();
        }

        public ContextButton getContextButton() {
            return contextButton;
        }

        public void setContextButton(ContextButton contextButton) {
            this.contextButton = contextButton;
        }
        
        public class ContextButton {
            private String align;
            private Boolean enabled;
            private Double height;
            private List<Object> menuItems = new ArrayList<>();
            public void onclick() {
                
            }
            private String symbol;
            private String symbolFill;
            private Double symbolSize;
            private String symbolStroke;
            private Double symbolStrokeWidth;
            private Double symbolX;
            private Double symbolY;
            private String text;
            private Object theme;
            private String verticalAlign;
            private Double width;
            private Double x;
            private Double y;

            public String getAlign() {
                return align;
            }

            public void setAlign(String align) {
                this.align = align;
            }

            public Boolean getEnabled() {
                return enabled;
            }

            public void setEnabled(Boolean enabled) {
                this.enabled = enabled;
            }

            public Double getHeight() {
                return height;
            }

            public void setHeight(Double height) {
                this.height = height;
            }

            public List<Object> getMenuItems() {
                return menuItems;
            }

            public void setMenuItems(List<Object> menuItems) {
                this.menuItems = menuItems;
            }

            public String getSymbol() {
                return symbol;
            }

            public void setSymbol(String symbol) {
                this.symbol = symbol;
            }

            public String getSymbolFill() {
                return symbolFill;
            }

            public void setSymbolFill(String symbolFill) {
                this.symbolFill = symbolFill;
            }

            public Double getSymbolSize() {
                return symbolSize;
            }

            public void setSymbolSize(Double symbolSize) {
                this.symbolSize = symbolSize;
            }

            public String getSymbolStroke() {
                return symbolStroke;
            }

            public void setSymbolStroke(String symbolStroke) {
                this.symbolStroke = symbolStroke;
            }

            public Double getSymbolStrokeWidth() {
                return symbolStrokeWidth;
            }

            public void setSymbolStrokeWidth(Double symbolStrokeWidth) {
                this.symbolStrokeWidth = symbolStrokeWidth;
            }

            public Double getSymbolX() {
                return symbolX;
            }

            public void setSymbolX(Double symbolX) {
                this.symbolX = symbolX;
            }

            public Double getSymbolY() {
                return symbolY;
            }

            public void setSymbolY(Double symbolY) {
                this.symbolY = symbolY;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public Object getTheme() {
                return theme;
            }

            public void setTheme(Object theme) {
                this.theme = theme;
            }

            public String getVerticalAlign() {
                return verticalAlign;
            }

            public void setVerticalAlign(String verticalAlign) {
                this.verticalAlign = verticalAlign;
            }

            public Double getWidth() {
                return width;
            }

            public void setWidth(Double width) {
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
            
        }
    }
}
