package java8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = new java.util.Date();
        dt.setTime(dt.getTime() - 1000 * 3600 * 24 * 11);
        String date = df.format(dt);
    
        System.out.println(date);
    }
}
