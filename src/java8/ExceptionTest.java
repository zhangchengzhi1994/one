package java8;

import junit.extensions.TestSetup;

public class ExceptionTest {
    
    public static void main(String[] args) {
        String test = "2131231231232131223";
    
        int exc = test.indexOf("exc");
        System.out.println(exc);
    
        if (exc < 0) {
            exc = 0;
        }
        String substring = test.substring(exc, exc + 1);
    
        System.out.println(substring);
    }
}
