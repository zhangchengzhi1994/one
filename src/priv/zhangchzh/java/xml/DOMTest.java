package priv.zhangchzh.java.xml;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * DOM方式解析xml
 */
public class DOMTest {

        public static void main(String[] args) {
	        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        try {
	            DocumentBuilder db = dbf.newDocumentBuilder();
	            Document document = db.parse("src/book.xml");//传入文件名可以是相对路径也可以是绝对路径
	            NodeList bookList = document.getElementsByTagName("book");
	            System.out.println("一共有" + bookList.getLength() + "本书");
	            for (int i = 0; i < bookList.getLength(); i++) {
	                System.out.println("=================下面开始遍历第" + (i + 1) + "本书的内容=================");
	                Node book = bookList.item(i);
	                NamedNodeMap attrs = book.getAttributes();
	                System.out.println("第 " + (i + 1) + "本书共有" + attrs.getLength() + "个属性");
	                for (int j = 0; j < attrs.getLength(); j++) {
	                    Node attr = attrs.item(j);
	                    System.out.print("属性名：" + attr.getNodeName());
	                    System.out.println("--属性值" + attr.getNodeValue());
	                }
	                NodeList childNodes = book.getChildNodes();
	                for (int k = 0; k < childNodes.getLength(); k++) {
	                    if(childNodes.item(k).getNodeType() == Node.ELEMENT_NODE){
	                        System.out.print("第" + (k + 1) + "个节点的节点名：" + childNodes.item(k).getNodeName());
	                        System.out.println("--节点值是：" + childNodes.item(k).getFirstChild().getNodeValue());
	                    }
	                }
	            }
	
	        } catch (ParserConfigurationException e) {
	            e.printStackTrace();
	        } catch (SAXException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}