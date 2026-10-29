public class PolylineSVG extends FiguraSVG {
    private int[] xPoints;
    private int[] yPoints;
    private int nPoints;

    public PolylineSVG(int[] xPoints, int[] yPoints, int nPoints, String stroke, String strokeWidth) {
        this.xPoints = xPoints;
        this.yPoints = yPoints;
        this.nPoints = nPoints;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    @Override
    public void dibujar(java.awt.Graphics2D g2d) {
        g2d.setColor(java.awt.Color.BLUE);
        g2d.setStroke(new java.awt.BasicStroke(3));
        g2d.drawPolyline(xPoints, yPoints, nPoints);
    }
}