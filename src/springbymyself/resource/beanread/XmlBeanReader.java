package springbymyself.resource.beanread;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import springbymyself.resource.re.Resource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.InputStream;
import java.lang.reflect.Parameter;

public class XmlBeanReader implements BeanReader {


    @Override
    public void loadBean(Resource resource) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream inputstream = resource.getInputstream();
        Document parse = documentBuilder.parse(inputstream);
        registBean(parse);
        inputstream.close();
    }


    private void registBean(Document document) {
        Element root = document.getDocumentElement();
        NodeList childNodes = root.getChildNodes();

        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element beanNode = (Element) item;
                String id = beanNode.getAttribute("id");
                String className = beanNode.getAttribute("class");

            }
        }
    }
}
