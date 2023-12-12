package HT;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.map.MapUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CTAddAll {
    public static void main(String[] args) throws InterruptedException {
        Map<String, DateTime> idMap = new HashMap<>();
        while (true) {
            System.out.println(idMap);
            DateTime dateTime = idMap.get("1");
            if (null != dateTime) {
                DateTime now = DateUtil.offsetMinute(new Date(), -1);
                if (DateUtil.compare(now, dateTime) == 1){
                    idMap.put("1", new DateTime());
                    continue;
                } else {
                    MapUtil.removeAny(idMap, "1");
                }
            }
            idMap.put("1", new DateTime());

            Thread.sleep(10000);
        }

    }
}
