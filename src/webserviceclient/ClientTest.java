package webserviceclient;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.XmlUtil;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.service.model.DescriptionInfo;
import org.apache.cxf.service.model.ServiceInfo;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ClientTest {
    public static void main22(String[] args) throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl");
//        Client client = dcf.createClient("http://localhost:9000/HelloWorld?wsdl");
        ServiceInfo serviceInfo = client.getEndpoint().getService().getServiceInfos().get(0);
        DescriptionInfo description = serviceInfo.getDescription();


        Object[] result;
        try {
            result = client.invoke("sayHelloWorldFrom", "张承志");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            client.close();
        }
        System.out.println(result[0]);
    }

    public static void main123213(String[] args) throws Exception {
        String code = "0";
        if (StrUtil.isNotBlank(code)) {
            switch (code) {
                case "0": {
                    System.out.println(1.1);
                    break;
                }
                case "1": {
                    System.out.println(2);
                    break;
                }
            }
        } else {
        }
    }

    public static void main(String[] args) {
        System.out.println(123/10);

    }

    public static void main3333(String[] args) throws JAXBException {
        String rspXmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<Csbdc001Response\n" +
                "    xmlns:ns2=\"http://www.chinatax.gov.cn/dataspec/\">\n" +
                "    <ns2:code>1</ns2:code>\n" +
                "    <ns2:msg>成功</ns2:msg>\n" +
                "    <ns2:jkxxGrid>\n" +
                "        <ns2:jkxxGridlb>\n" +
                "            <ns2:swjgDm>24301910000</ns2:swjgDm>\n" +
                "            <ns2:dzsphm>320181016000045818</ns2:dzsphm>\n" +
                "            <ns2:yjse>27059.44</ns2:yjse>\n" +
                "            <ns2:jkqx>2018-11-30</ns2:jkqx>\n" +
                "            <ns2:szxxGrid>\n" +
                "                <ns2:szxxGridlb>\n" +
                "                    <ns2:spuuid>428F4C300180AE1E3C8F7A0C4E93FB25</ns2:spuuid>\n" +
                "                    <ns2:zsuuid>40EA51F0CCDB5C960E5B7A8B64B89304</ns2:zsuuid>\n" +
                "                    <ns2:dzsphm>320181016000045818</ns2:dzsphm>\n" +
                "                    <ns2:dzspmxxh>0</ns2:dzspmxxh>\n" +
                "                    <ns2:gldzspmxxh>0</ns2:gldzspmxxh>\n" +
                "                    <ns2:pzzlDm>000006010</ns2:pzzlDm>\n" +
                "                    <ns2:djxh>20124300100010801581</ns2:djxh>\n" +
                "                    <ns2:skssqq>2018-10-16</ns2:skssqq>\n" +
                "                    <ns2:skssqz>2018-11-15</ns2:skssqz>\n" +
                "                    <ns2:zsxmDm>10111</ns2:zsxmDm>\n" +
                "                    <ns2:zspmDm>101110200</ns2:zspmDm>\n" +
                "                    <ns2:djzclxDm>431</ns2:djzclxDm>\n" +
                "                    <ns2:hyDm>9519</ns2:hyDm>\n" +
                "                    <ns2:sbfsDm>32</ns2:sbfsDm>\n" +
                "                    <ns2:zsfsDm>900</ns2:zsfsDm>\n" +
                "                    <ns2:czlxDm>24</ns2:czlxDm>\n" +
                "                    <ns2:skzlDm>10</ns2:skzlDm>\n" +
                "                    <ns2:sksxDm>0101</ns2:sksxDm>\n" +
                "                    <ns2:zsdlfsDm>0</ns2:zsdlfsDm>\n" +
                "                    <ns2:kssl>51.8</ns2:kssl>\n" +
                "                    <ns2:jsyj>667720.95</ns2:jsyj>\n" +
                "                    <ns2:yjse>.00</ns2:yjse>\n" +
                "                    <ns2:sl1>.0005</ns2:sl1>\n" +
                "                    <ns2:sjje>350.60</ns2:sjje>\n" +
                "                    <ns2:kjrq>2018-10-16 14:32:26</ns2:kjrq>\n" +
                "                    <ns2:skjnfsDm>73</ns2:skjnfsDm>\n" +
                "                    <ns2:yskmDm>1011119</ns2:yskmDm>\n" +
                "                    <ns2:ysfpblDm>24330007</ns2:ysfpblDm>\n" +
                "                    <ns2:skgkDm>2430100014</ns2:skgkDm>\n" +
                "                    <ns2:jdxzDm>430105102</ns2:jdxzDm>\n" +
                "                    <ns2:tzlxDm>1</ns2:tzlxDm>\n" +
                "                    <ns2:jkqx>2018-11-30</ns2:jkqx>\n" +
                "                    <ns2:yjkqx>2018-11-30</ns2:yjkqx>\n" +
                "                    <ns2:ssglyDm>24301fcjyZj</ns2:ssglyDm>\n" +
                "                    <ns2:zgswskfjDm>24301910000</ns2:zgswskfjDm>\n" +
                "                    <ns2:skssswjgDm>24301910000</ns2:skssswjgDm>\n" +
                "                    <ns2:zsswjgDm>24301910700</ns2:zsswjgDm>\n" +
                "                    <ns2:sybh1>F43012120180054457</ns2:sybh1>\n" +
                "                </ns2:szxxGridlb>\n" +
                "                <ns2:szxxGridlb>\n" +
                "                    <ns2:spuuid>6FA02B32F76EF8E79AE7455FF3268C3D</ns2:spuuid>\n" +
                "                    <ns2:zsuuid>2EE212275B1F5C3498B3D50135A30E66</ns2:zsuuid>\n" +
                "                    <ns2:dzsphm>320181016000045818</ns2:dzsphm>\n" +
                "                    <ns2:dzspmxxh>0</ns2:dzspmxxh>\n" +
                "                    <ns2:gldzspmxxh>0</ns2:gldzspmxxh>\n" +
                "                    <ns2:pzzlDm>000006010</ns2:pzzlDm>\n" +
                "                    <ns2:djxh>20124300100010801581</ns2:djxh>\n" +
                "                    <ns2:skssqq>2018-10-16</ns2:skssqq>\n" +
                "                    <ns2:skssqz>2018-11-15</ns2:skssqz>\n" +
                "                    <ns2:zsxmDm>10119</ns2:zsxmDm>\n" +
                "                    <ns2:zspmDm>101191129</ns2:zspmDm>\n" +
                "                    <ns2:djzclxDm>431</ns2:djzclxDm>\n" +
                "                    <ns2:hyDm>9519</ns2:hyDm>\n" +
                "                    <ns2:sbfsDm>32</ns2:sbfsDm>\n" +
                "                    <ns2:zsfsDm>900</ns2:zsfsDm>\n" +
                "                    <ns2:czlxDm>24</ns2:czlxDm>\n" +
                "                    <ns2:skzlDm>10</ns2:skzlDm>\n" +
                "                    <ns2:sksxDm>0101</ns2:sksxDm>\n" +
                "                    <ns2:zsdlfsDm>0</ns2:zsdlfsDm>\n" +
                "                    <ns2:kssl>51.8</ns2:kssl>\n" +
                "                    <ns2:jsyj>667720.95</ns2:jsyj>\n" +
                "                    <ns2:yjse>.00</ns2:yjse>\n" +
                "                    <ns2:sl1>.0400</ns2:sl1>\n" +
                "                    <ns2:sjje>26708.84</ns2:sjje>\n" +
                "                    <ns2:kjrq>2018-10-16 14:32:26</ns2:kjrq>\n" +
                "                    <ns2:skjnfsDm>73</ns2:skjnfsDm>\n" +
                "                    <ns2:yskmDm>1011901</ns2:yskmDm>\n" +
                "                    <ns2:ysfpblDm>24330008</ns2:ysfpblDm>\n" +
                "                    <ns2:skgkDm>2430100014</ns2:skgkDm>\n" +
                "                    <ns2:jdxzDm>430105102</ns2:jdxzDm>\n" +
                "                    <ns2:tzlxDm>1</ns2:tzlxDm>\n" +
                "                    <ns2:jkqx>2018-11-30</ns2:jkqx>\n" +
                "                    <ns2:yjkqx>2018-11-30</ns2:yjkqx>\n" +
                "                    <ns2:ssglyDm>24301fcjyZj</ns2:ssglyDm>\n" +
                "                    <ns2:zgswskfjDm>24301910000</ns2:zgswskfjDm>\n" +
                "                    <ns2:skssswjgDm>24301910000</ns2:skssswjgDm>\n" +
                "                    <ns2:zsswjgDm>24301910700</ns2:zsswjgDm>\n" +
                "                    <ns2:sybh1>F43012120180054457</ns2:sybh1>\n" +
                "                </ns2:szxxGridlb>\n" +
                "            </ns2:szxxGrid>\n" +
                "        </ns2:jkxxGridlb>\n" +
                "    </ns2:jkxxGrid>\n" +
                "</Csbdc001Response>";
        System.out.println(StrUtil.subBetween(rspXmlStr, "<ns2:msg>", "</ns2:msg>"));
        rspXmlStr = StrUtil.removeAny(rspXmlStr,
                "<ns2:jkxxGrid>", "</ns2:jkxxGrid>", "<ns2:szxxGrid>", "</ns2:szxxGrid>", "ns2:");
        Node firstChild = XmlUtil.readXML(rspXmlStr).getFirstChild();
        Unmarshaller createUnmarshaller = JAXBContext.newInstance(TaxVo.class).createUnmarshaller();
        Object unmarshal = createUnmarshaller.unmarshal(firstChild);

    }
}
