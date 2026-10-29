public class EllipseSVG extends FiguraSVG {
    private int cx, cy, rx, ry;

    public EllipseSVG(int cx, int cy, int rx, int ry, String fill, String stroke, String strokeWidth) {
        this.cx = cx;
        this.cy = cy;
        this.rx = rx;
        this.ry = ry;
        this.fill = fill;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    @Override
    public void dibujar(java.awt.Graphics2D g2d) {
        int x = cx - rx;
        int y = cy - ry;
        int width = rx * 2;
        int height = ry * 2;

        g2d.setColor(new java.awt.Color(144, 238, 144));
        g2d.fillOval(x, y, width, height);

        g2d.setColor(new java.awt.Color(0, 128, 0));
        g2d.setStroke(new java.awt.BasicStroke(2));
        g2d.drawOval(x, y, width, height);
    }
}