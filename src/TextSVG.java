public class TextSVG extends FiguraSVG {
    private int x, y;
    private String contenido;
    private String fontFamily;
    private int fontSize;

    public TextSVG(int x, int y, String contenido, String fontFamily, int fontSize, String fill) {
        this.x = x;
        this.y = y;
        this.contenido = contenido;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.fill = fill;
    }

    @Override
    public void dibujar(java.awt.Graphics2D g2d) {
        g2d.setFont(new java.awt.Font(fontFamily, java.awt.Font.PLAIN, fontSize));
        g2d.setColor(java.awt.Color.BLACK);
        g2d.drawString(contenido, x, y);
    }
}