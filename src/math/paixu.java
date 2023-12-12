package math;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.util.StrUtil;
import com.ctc.wstx.util.StringUtil;
import com.sun.jna.WString;
import org.apache.cxf.jaxws.handler.types.CString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class paixu {
    /*穷举法*/
    public static void main(String[] args) {
        TimeInterval timer = DateUtil.timer();
        long j = 999999999L;
        ArrayList<String> list = new ArrayList<>();

        for (long i = 100000000; i <= j; i++) {
            String s = Long.toString(i);

            String[] cut = StrUtil.cut(s, 1);

            if (isContain(cut)) {
                continue;
            }
            list.add(s);
        }
        System.out.println(timer.intervalMs());

        for (String o : list) {
            if (cal(o) != "") {
                System.out.println(cal(o));
            }
        }
        timer.interval();
    }

    private static boolean isContain(String[] cut) {
        HashSet hashSet = new HashSet();

        for (String s1 : cut) {
            boolean contains = hashSet.contains(s1);
            if (contains) return true;
            hashSet.add(s1);
        }
        return false;
    }

    private static String cal(String s) {
        String[] cut = StrUtil.cut(s, 2);

        return "";
    }
	
}
