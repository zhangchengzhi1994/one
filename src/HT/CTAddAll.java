package HT;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class CTAddAll {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<Object>(){{
            add(new HashMap<Object, Object>(){{
                put("1", "1");
            }});
        }};
        ArrayList<Object> list3 = new ArrayList<Object>(){{
            add(new HashMap<Object, Object>(){{
                put("1", "1");
                put("2", "2");
            }});
        }};;
        
        CollUtil.addAllIfNotContains(list1, list2);
    
        System.out.println(list1.contains(list3.get(0)));
        
        CollUtil.addAllIfNotContains(list1, list3);
    
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
    
    }
}
