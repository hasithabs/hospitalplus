/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

/**
 *
 * @author Y4SHVINE
 */
public class DBUtil {

    // get xml data 
    public static String getXMLData(String XMLFilePath, String dataType, String key) {
        /*
        For more information refer : 
        https://stackoverflow.com/questions/428073/what-is-the-best-simplest-way-to-read-in-an-xml-file-in-java-application
        
        <-----Attributes------->
        XMLFilePath   : XML File path
        dataType      : error / query
        key           : id
        */
        try {
            if (XMLFilePath != null || dataType != null || key != null) {
                File fXmlFile = new File(XMLFilePath);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(fXmlFile);
                doc.getDocumentElement().normalize();
                
                NodeList nList = doc.getElementsByTagName(dataType);
                
                for (int i = 0; i < nList.getLength(); i++) {
                    Node nNode = nList.item(i);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        if (key.equals(eElement.getAttribute("key"))) {
                            return eElement.getElementsByTagName("entry").item(0).getTextContent();
                        }
                    }
                }
            }else{
                return null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
