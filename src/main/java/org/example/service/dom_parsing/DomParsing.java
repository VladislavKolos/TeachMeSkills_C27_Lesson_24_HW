package org.example.service.dom_parsing;

import org.example.service.writing_service.FileWriting;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Class contains static void method "parseWithDom" - method for parsing XML file using DOM
 * in "parseWithDom" method: a document writer factory is being created
 * get the contents of the "line" tags.
 */
public class DomParsing {
    public static void parseWithDom() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File("initial_data.xml"));

            NodeList lines = document.getElementsByTagName("line");
            for (int i = 0; i < lines.getLength(); i++) {
                String line = lines.item(i).getTextContent();
                FileWriting.writeToFile(line);
            }

            System.out.println("Successfully parsed XML using DOM.");

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
