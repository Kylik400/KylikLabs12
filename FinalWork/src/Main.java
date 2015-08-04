import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Dimon on 03.08.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ClassInput tr = new ClassInput();


        URL url = new URL("http://cashexchange.com.ua/XmlApi.ashx");
        InputStream in = new BufferedInputStream(url.openStream());

        Document doc = parseXML(in);
        System.out.println(doc);


    private static Document parseXML(InputStream stream) throws Exception {
        DocumentBuilderFactory objDocumentBuilderFactory = null;
        DocumentBuilder objDocumentBuilder = null;
        Document doc = null;
        try {
            objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
            doc = objDocumentBuilder.parse(stream);
        } catch (Exception ex) {
            throw ex;
        }

        return doc;
    }

}

}