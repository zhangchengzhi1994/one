package java8.func;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Tester {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true
        
        System.out.println("输出所有数据:");
        
        // 传递参数 n
        eval(list, n->true);
        
        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true
        
        System.out.println("输出所有偶数:");
        eval(list, Java8Tester::qwer);
        
        // Predicate<Integer> predicate2 = n -> n > 3
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n 大于 3 test 方法返回 true
        
        System.out.println("输出大于 3 的所有数字:");
        eval(list, n-> n > 3 );
    }
    
    public static boolean qwer(Integer a) {
        return  a%2 == 0;
    }
    
    public static void eval(List<Integer> list, a<Integer> predicate) {
        for(Integer n: list) {
            
            if(predicate.zcz(n)) {
                System.out.println(n + " ");
            }
        }
    }
    
    @FunctionalInterface
    public interface a<T> {
        boolean zcz(T t);
    }
}