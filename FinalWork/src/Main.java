import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;
import org.w3c.dom.Document;


public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        List<String> CurrList = new ArrayList<String>();

        CurrList.add("Доллар США");
        CurrList.add("Европейская составная единица");
        CurrList.add("Российский рубль");
        CurrList.add("Английский фунт стерлингов");
        CurrList.add("Австралийский доллар");
        CurrList.add("Белорусский рубль");
        CurrList.add("Форинт");
        CurrList.add("Датская крона");
        CurrList.add("Канадский доллар");
        CurrList.add("Юань");
        CurrList.add("Норвежская крона");
        CurrList.add("Злотый");
        CurrList.add("Чешская крона");
        CurrList.add("Шведская крона");
        CurrList.add("Швейцарский франк");
        CurrList.add("Иена");

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
        double sale = 0;



       // System.out.println("Название валюты     " + "     Покупка    " + "       Продажа");
        for (int i = 0; i < nodeList.getLength(); i++){
            Element element = (Element) nodeList.item(i);

            currency = element.getElementsByTagName("Currency").item(0).getChildNodes().item(0).getNodeValue();
            Lists.addCurrency(currency);
            buy = Double.parseDouble(element.getElementsByTagName("Buy").item(0).getChildNodes().item(0).getNodeValue());
            Lists.addBuy(buy);
            sale = Double.parseDouble(element.getElementsByTagName("Sale").item(0).getChildNodes().item(0).getNodeValue());
            Lists.addSale(sale);

               // System.out.println(currency +  "                       " + buy + "         " + sale );
        }




            ClassInput classInput = new ClassInput();

}



}