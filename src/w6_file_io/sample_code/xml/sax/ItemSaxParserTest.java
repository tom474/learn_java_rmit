package w6_file_io.sample_code.xml.sax;

import w6_file_io.sample_code.xml.model.Item;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Use SAX to process items.xml and reproduce result of ItemListParserTest.java
 *
 * @author Caspar Ryan
 */
public class ItemSaxParserTest {
    public static void main(String[] args) throws Exception {
        // Create SAX-parser
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        // And parse using our custom handler
        ItemsSaxHandler handler = new ItemsSaxHandler();
        parser.parse("./src/w6_file_io/sample_code/xml/items.xml", handler);
        // Log model data once parsing complete
        for (Item item : handler.getItems()) {
            System.out.println(item);
        }
    }
}
