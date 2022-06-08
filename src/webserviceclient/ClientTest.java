package webserviceclient;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class ClientTest {
    public static void main(String[] args) {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/service/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        Object[] objects = new Object[0];
        try {
            objects = client.invoke("sendAuditResult", "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<root><code>1</code><msg>cc</msg><htbh>4301000000993569</htbh><swjgdm>12345678</swjgdm><dzsphm>7345656735675673</dzsphm><hjyjje>12348412.90</hjyjje></root>");
            String s = String.valueOf(objects);
            Document document = DocumentHelper.parseText(s);
            Element rootElement = document.getRootElement();
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
