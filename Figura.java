public abstract class Figura implements IFigura, Draw {
    
    protected String colorBorde;
    protected String colorFondo;
    protected Rectangle rectangle;

    public Figura(String colorBorde, String colorFondo, Rectangle rectangle){

        this.colorBorde = colorBorde;
        this.colorFondo = colorFondo;
        this.rectangle = rectangle;
    }

    public Figura(){}

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }
}