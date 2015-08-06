import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;
import org.w3c.dom.Document;


public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {


        URL url = new URL("http://cashexchange.com.ua/XmlApi.ashx");
        InputStream in = new BufferedInputStream(url.openStream());
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document doc = (Document) documentBuilder.parse(in);

        String title = doc.getDocumentElement().getNodeName();
        System.out.println(title);

        NodeList nodeList = doc.getElementsByTagName("Results").item(0).getChildNodes();

        String currency = "";
        double buy = 0;
        double sell = 0;

        for (int i = 0; i < nodeList.getLength(); i++){
            Element element = (Element) nodeList.item(i);

                currency = element.getElementsByTagName("Currency").item(0).getChildNodes().item(0).getNodeValue();
               buy = Double.parseDouble(element.getElementsByTagName("Buy").item(0).getChildNodes().item(0).getNodeValue());
                sell = Double.parseDouble(element.getElementsByTagName("Sell").item(0).getChildNodes().item(0).getNodeValue());

                System.out.println(currency +  " " + buy + " " + sell );




        }







}

}