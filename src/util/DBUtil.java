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
import org.apache.log4j.Logger;


/**
 *
 * @author Y4SHVINE
 */
public class DBUtil {
    
    public static Logger LOG;

    // get xml data 
    public static String getXMLData(String XMLFileType, String dataType, String key) {
        Config cnf = new Config();
        /*
        <-----Parameters Examples------>
        XMLFileType   : "EmployeeError" / "EmployeeQuery"
        dataType      : "error" / "query"
        key           : "id"
        
        For more information refer : 
        https://stackoverflow.com/questions/428073/what-is-the-best-simplest-way-to-read-in-an-xml-file-in-java-application
        */
        
       
        LOG =cnf.getLogger(DBUtil.class);
        try {
            if (XMLFileType != null || dataType != null || key != null) {
                String XMLFilePath ="";
                if(dataType.equals("error")){
                    XMLFilePath = (Util.ERROR_FILE_PATH.concat(XMLFileType)).concat(".xml");
                }else if(dataType.equals("query")){
                    XMLFilePath = (Util.QUERY_FILE_PATH.concat(XMLFileType)).concat(".xml");
                }else{
                    LOG.error("Invalide XML dataType parameter for getXMLData method");
                }
                
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
                LOG.error("Null Parameters for getXMLData method");
                return null;
            }
        } catch (Exception ex) {
            LOG.error("Invalide Parameters for getXMLData method");
            ex.printStackTrace();
        }
        return null;
    }
}
