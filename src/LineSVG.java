public class LineSVG extends FiguraSVG {
    private int x1, y1, x2, y2;

    public LineSVG(int x1, int y1, int x2, int y2, String stroke, String strokeWidth) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    @Override
    public void dibujar(java.awt.Graphics2D g2d) {
        g2d.setColor(java.awt.Color.RED);   
        g2d.setStroke(new java.awt.BasicStroke(4));
        g2d.drawLine(x1, y1, x2, y2);
    }
}