package webserviceclient;

import cn.hutool.http.webservice.SoapClient;


public class ClientTest {
    public static void main(String[] args) {
        SoapClient arg0 = SoapClient.create("http://10.0.0.217:8220/service/api")
                .setMethod("qsw:sendAuditResult", "http://QsWebService.controller.zjw.com")
                .setParam("req", "<root><code>1</code><msg>cc</msg><htbh>4301000000993569</htbh><swjgdm>12345678</swjgdm><dzsphm>7345656735675673</dzsphm><hjyjje>12348412.90</hjyjje></root>");
        System.out.println(arg0.send(true));
    }
}
