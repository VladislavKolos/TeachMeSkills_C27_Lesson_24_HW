package org.example.service.sax_parsing;

import org.example.service.writing_service.FileWriting;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * Class contains static void method "parseWithSax" - method for parsing XML file using SAX
 * in "parseWithSax" method: creating a SAX-parser
 * event handlers are installed
 * "parseWithSax" method contains "startElement", "characters" and "endElement" method.
 */
public class SaxParsing {
    public static void parseWithSax() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean inLines = false;

                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equals("lines")) {
                        inLines = true;
                    }
                }

                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (inLines) {
                        String line = new String(ch, start, length);
                        if (!line.trim().isEmpty()) {
                            FileWriting.writeToFile(line);
                        }
                    }
                }

                public void endElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equals("lines")) {
                        inLines = false;
                    }
                }
            };

            saxParser.parse(new File("initial_data.xml"), handler);

            System.out.println("Successfully parsed XML using SAX.");

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
