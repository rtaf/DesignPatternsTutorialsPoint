/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSAXParser;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author rtafuni
 */
public class SAXParserDemo {

    public static void main(String[] args) {

        try {
            File inputFile;
            inputFile = new File("src/javaSAXParser/newXMLDocument.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler;
            userhandler = new UserHandler();
            saxParser.parse(inputFile, userhandler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
        }
    }
}
