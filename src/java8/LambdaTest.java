package java8;

import springbymyself.resource.beanread.XmlBeanReader;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
    
        LTest hh = lambdaTest::hh2;
        String sout = hh.sout("11");
        LambdaTest.what("哈哈哈哈", hh);
        LambdaTest.who("哈哈哈哈222", System.out::println);
    }
    
    
    public static void what(String a, LTest lTest) {
        String sout = lTest.sout(a);
        System.out.println(sout);
    }
    
    public static void who(String a, Consumer lTest){
    
    }
    
    private String hh(String a) {
        return a;
    }
    
    private String hh2(String a) {
        return a;
    }
    
    @FunctionalInterface
    interface LTest {
        String sout(String a);
    }
}
