public class RectSVG extends FiguraSVG {
    private int x, y, width, height;

    public RectSVG(int x, int y, int width, int height, String fill, String stroke, String strokeWidth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fill = fill;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    @Override
    public void dibujar(java.awt.Graphics2D g2d) {
        g2d.setColor(new java.awt.Color(173, 216, 230));
        g2d.fillRect(x, y, width, height);

        g2d.setColor(new java.awt.Color(0, 0, 128));
        g2d.setStroke(new java.awt.BasicStroke(3));
        g2d.drawRect(x, y, width, height);
    }
}