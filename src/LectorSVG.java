import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;

public class LectorSVG {

    public void cargarSVG(File archivo) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true); // Procesar espacios de nombres XML

            dbf.setFeature("http://xml.org/sax/features/external-general-entities", false);
            dbf.setFeature("http://xml.org/sax/features/external-parameter-entities", false);

            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(archivo);
            doc.getDocumentElement().normalize();

            Element raiz = doc.getDocumentElement();
            System.out.println("Raíz encontrada: " + raiz.getNodeName());

            analizarElementos(raiz.getChildNodes());

        } catch (Exception e) {
            System.out.println("Error al leer el archivo SVG: " + e.getMessage());
        }
    }

    private void analizarElementos(NodeList listaNodos) {
        for (int i = 0; i < listaNodos.getLength(); i++) {
            Node nodo = listaNodos.item(i);

            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                String etiqueta = elemento.getTagName();

                switch (etiqueta) {
                    case "line":
                        System.out.println("Línea -> x1: " + elemento.getAttribute("x1") +
                                ", y1: " + elemento.getAttribute("y1") +
                                ", x2: " + elemento.getAttribute("x2") +
                                ", y2: " + elemento.getAttribute("y2") +
                                ", stroke: " + elemento.getAttribute("stroke"));
                        break;
                    case "circle":
                        System.out.println("Círculo -> cx: " + elemento.getAttribute("cx") +
                                ", cy: " + elemento.getAttribute("cy") +
                                ", r: " + elemento.getAttribute("r") +
                                ", fill: " + elemento.getAttribute("fill"));
                        break;
                    case "rect":
                        System.out.println("Rectángulo -> x: " + elemento.getAttribute("x") +
                                ", y: " + elemento.getAttribute("y") +
                                ", width: " + elemento.getAttribute("width") +
                                ", height: " + elemento.getAttribute("height"));
                        break;
                    case "ellipse":
                        System.out.println("Elipse -> cx: " + elemento.getAttribute("cx") +
                                ", cy: " + elemento.getAttribute("cy") +
                                ", rx: " + elemento.getAttribute("rx") +
                                ", ry: " + elemento.getAttribute("ry"));
                        break;
                    case "polyline":
                        System.out.println("Polyline -> points: " + elemento.getAttribute("points"));
                        break;
                    case "text":
                        System.out.println("Texto -> x: " + elemento.getAttribute("x") +
                                ", y: " + elemento.getAttribute("y") +
                                ", texto: " + elemento.getTextContent());
                        break;
                    case "g":
                        System.out.println("Grupo <g> detectado, buscando dentro...");
                        analizarElementos(elemento.getChildNodes());
                        break;
                }
            }
        }
    }
}