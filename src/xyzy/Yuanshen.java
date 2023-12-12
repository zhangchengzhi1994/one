package xyzy;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Yuanshen {
    /*
    * 1.默认140点资源，1点资源换1%爆率，1点资源换2%爆伤
    * 2.初始输出1000点伤害
    * 3.初始爆率+武器暴率为30%, 爆伤初始为0%
    * 4.攻击段数为6，模拟次数为1000次，等价于单独攻击6000次
    * 5.最高爆率为100%
    * */
    public static void main(String[] args) {
        HashMap<Long, String> longStringHashMap = new HashMap<>();
        for (int i = 30; i <= 100; i++) {
            getSc(100 - i, i, longStringHashMap);
        }
        Set<Long> longs = longStringHashMap.keySet();
        ArrayList<Long> objects = new ArrayList<>();
        objects.addAll(longs);
        CollUtil.sort(objects, Long::compareTo);
        for (int i = objects.size() - 1; i > 0; i--) {
            System.out.println(longStringHashMap.get(objects.get(i)));
        }
    }

    public static void getSc(int bl_zy, int bs_zy, HashMap longStringHashMap) {
        int attach = 100;
        BigDecimal bl = NumberUtil.round(0.3 + (0.01 * bl_zy), 2);
        BigDecimal bs = NumberUtil.round(1 + (0.02 * bs_zy), 2);
        long sc = 0;
        for (int i = 0; i < 1000000; i++) {
            double random = Math.random();
            if (random < bl.doubleValue()) {
                sc += attach * bs.doubleValue();
            } else {
                sc += attach;
            }
        }
        longStringHashMap.put(sc ,"爆率为" + bl + "%，爆伤为" + bs + "%，攻击100万次，总输出为" + sc);
    }
}
