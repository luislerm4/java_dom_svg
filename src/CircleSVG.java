public class CircleSVG extends FiguraSVG {
    private int cx, cy, r;
    private String fill;

    public CircleSVG(int cx, int cy, int r, String fill, String stroke, String strokeWidth) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
        this.fill = fill;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    @Override
    public void dibujar(java.awt.Graphics2D g2d) {
        int x = cx - r;
        int y = cy - r;
        int diametro = r * 2;


        g2d.setColor(java.awt.Color.ORANGE);
        g2d.fillOval(x, y, diametro, diametro);

        g2d.setColor(java.awt.Color.BLACK);
        g2d.setStroke(new java.awt.BasicStroke(2));
        g2d.drawOval(x, y, diametro, diametro);
    }
}