package w06_file_io.sample_code.xml.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import w06_file_io.sample_code.xml.model.Item;
import w06_file_io.sample_code.xml.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Process items.xml using SAX
 *
 * @author Caspar Ryan
 */
public class ItemsSaxHandler extends DefaultHandler {
    // Used for processing the xml payload
    private StringBuffer characters = new StringBuffer();
    // Create "model" from XML
    private Item item;
    private Product product;
    // Contains data after parsing complete
    private List<Item> items = new ArrayList<Item>();

    // Invoked when document-parsing is started
    @Override
    public void startDocument() throws SAXException {
        System.out.println("SAX Document processing started");
    }

    // Notified when parsing finished
    @Override
    public void endDocument() throws SAXException {
        System.out.println("SAX Document processing finished");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) throws SAXException {
        // Clear the buffer when we enter a new element
        characters.delete(0, characters.length());
        // Create model classes each time we reach a new <item>
        if (qName.equals("item")) {
            item = new Item();
            product = new Product();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String elementData = characters.toString();
        // St the end of the element process the relevant elements character data to populate the List
        if (qName.equals("description")) {
            product.setName(elementData);
            log(qName, elementData);
        } else if (qName.equals("price")) {
            product.setPrice(Double.parseDouble(elementData));
            log(qName, elementData);
        } else if (qName.equals("quantity")) {
            item.setQty(Integer.parseInt(elementData));
            log(qName, elementData);
        } else if (qName.equals("item")) {
            log(qName, elementData);
            item.setProduct(product);
            items.add(item);
        }
    }

    @Override
    public void characters(char buf[], int offset, int len) throws SAXException {
        // Append character data within element (may get called more than once per element)
        characters.append(new String(buf, offset, len));
    }

    private void log(String qName, String elementData) {
        System.out.printf("qName: %s, elementData: %s\n", qName, elementData);
    }

    public List<Item> getItems() {
        return items;
    }
}
