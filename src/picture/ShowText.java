package picture;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;

public class ShowText {

    public static void main(String[] args) {
        TimeInterval timer = DateUtil.timer();
        long j = 9999999999L;

        for (long i = 1000000000; i <= j; i++) {
        }
        System.out.println(timer.interval());
    }
}
