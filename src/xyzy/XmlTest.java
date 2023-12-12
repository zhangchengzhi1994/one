package xyzy;

import cn.hutool.core.util.XmlUtil;
import org.w3c.dom.Document;

import java.util.ArrayList;

public class XmlTest {

    public static void main(String[] args) {
        HouseGyrVo houseGyrVo = new HouseGyrVo();
        houseGyrVo.setMsfgyxm("");
        houseGyrVo.setMsfgyzjzl("");
        houseGyrVo.setMsfgyzjhm("");
        houseGyrVo.setMsfgygj("");
        houseGyrVo.setMsfgydz("");
        houseGyrVo.setMsfgylxdh("");
        houseGyrVo.setMsfgyszfe("");
        houseGyrVo.setMsfgyqssl("");
        houseGyrVo.setMsfgyqsse("");
        houseGyrVo.setMsfgyyhssl("");
        houseGyrVo.setMsfgyyhsse("");
        houseGyrVo.setQsjmxzdm("");
        houseGyrVo.setQsjmse("");
        houseGyrVo.setMsfgryhsjmse("");
        houseGyrVo.setQsyhsl("");

        HouseVo houseVo = new HouseVo();
        houseVo.setId("");
        houseVo.setSqlxdm("");
        houseVo.setMsfmc("");
        houseVo.setMsflx("");
        houseVo.setMsfgj("");
        houseVo.setMsfxb("");
        houseVo.setMsflxdz("");
        houseVo.setMsfsfzhmsbm("");
        houseVo.setMsfzjlxdm("");
        houseVo.setMsfdh("");
        houseVo.setKfqymc("");
        houseVo.setKfqysbm("");
        houseVo.setKfslxdh("");
        houseVo.setXzqu("");
        houseVo.setXzjd("");
        houseVo.setYszbh("");
        houseVo.setFwbh("");
        houseVo.setFwzlwz("");
        houseVo.setGhyt("");
        houseVo.setFwdh("");
        houseVo.setFwdyh("");
        houseVo.setFwfjh("");
        houseVo.setFwlc("");
        houseVo.setFwjg("");
        houseVo.setJyfs("");
        houseVo.setHtbh("");
        houseVo.setHtqdsj("");
        houseVo.setHtje("");
        houseVo.setJzmj("");
        houseVo.setTnmj("");
        houseVo.setYpmjg("");
        houseVo.setJyjg("");
        houseVo.setSfwyzf("");
        houseVo.setCdsj("");
        houseVo.setSzfe("");
        houseVo.setQssl("");
        houseVo.setQsse("");
        houseVo.setYhssl("");
        houseVo.setYhsse("");
        houseVo.setQsjmxzdm("");
        houseVo.setQsjmse("");
        houseVo.setYhsjmse("");
        houseVo.setQsyhsl("");
        houseVo.setJsyj("");
        houseVo.setGyrList(new ArrayList<HouseGyrVo>(){{add(houseGyrVo);}});

        Document document = XmlUtil.beanToXml(houseVo);
        String format = XmlUtil.format(document);
//        System.out.println(StrUtil.replace(format,
//                "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>",
//                "<?xml version=\"1.0\" encoding=\"GBK\"?>"));

    }
}
