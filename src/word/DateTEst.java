package word;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

public class DateTEst {
    public static void main(String[] args) {
        DateTime date = DateUtil.date();
        String s = DateUtil.format(date, "yyyy年MM月dd日HH时mm分ss秒");
        System.out.println(s);
    }
}
