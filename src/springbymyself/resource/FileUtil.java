package springbymyself.resource;

import org.hibernate.validator.internal.engine.validationcontext.ReturnValueExecutableValidationContext;
import org.junit.Test;
import org.springframework.http.RequestEntity;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class FileUtil {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    @Test
    public Document getXmlFile() {
        Document document = null;
        try {
            String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(new File(path + "/myself.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return document;
    }

    public static void main(String[] args) {
        FileUtil parser = new FileUtil();
        Document document = parser.getXmlFile();
        //get root element
        Element rootElement = document.getDocumentElement();

        //traverse child elements


        NodeList nodeList = rootElement.getElementsByTagName("book");
        if(nodeList != null)
        {
            for (int i = 0 ; i < nodeList.getLength(); i++)
            {
                // root
                Element element = (Element)nodeList.item(i);
                String id = element.getAttribute("id");

                // child
                NodeList nodes = element.getElementsByTagName("title");
                for (int j=0; j < nodes.getLength(); j++)
                {
                    Element item = (Element) nodes.item(j);
                    String value = item.getTagName();

                    String value1 = item.getNodeValue();
                    System.out.println(id + "---" + value + "---" + value1);
                }

            }
        }
    }
}
