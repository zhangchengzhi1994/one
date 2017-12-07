package priv.zhangchzh.game;

import java.util.Scanner;

public class ACM1067 {  
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);  
        int a = 0;  
        int b = 0;  
        int k = 0;  
        double r = 1.6180339887;  
  
        while (s.hasNext()) {  
            a = s.nextInt();  
            b = s.nextInt();  
              
            if (a>b) {  
                k = a;  
                a = b;  
                b = k;  
            }  
            k = b-a;  
              
            if (a == (int)((double)k*r)) {  
                System.out.println(0);  
            }else{  
                System.out.println(1);  
            }  
        }  
    }  
}  
