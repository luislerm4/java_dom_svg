public abstract class FiguraSVG {
    protected String stroke;
    protected String strokeWidth;
    protected String fill;

    public abstract void dibujar(java.awt.Graphics2D g2d);
}