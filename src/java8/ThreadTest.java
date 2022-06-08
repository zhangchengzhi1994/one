package java8;

import java.util.Date;

public class ThreadTest {
    
    public static void main(String[] args) throws InterruptedException {
    
        int j = 100;
        int i = 0;
            while (i<j) {
                try {
                    while (i<j) {
                        Thread.sleep(11);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("2222");
                } finally {
                    System.out.println("3333");
                }
            }
    
//        int j = 100;
//        int i = 0;
//        while (i < j) {
//            i++;
//            System.out.println(111);
//        }
    }
    
}
