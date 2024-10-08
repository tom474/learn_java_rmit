package w06_file_io.sample_code.xml.dom;

import w06_file_io.sample_code.xml.model.Item;

import java.util.List;

/**
 * This program parses an XML file containing an item list. It prints out the
 * items that are described in the XML file.
 *
 * @author: Original author unknown, refactored by Caspar
 */
public class ItemListParserTest {
    public static void main(String[] args) throws Exception {
        List<Item> items = new ItemListParser().parse("./src/w6_file_io/sample_code/xml/items.xml");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
