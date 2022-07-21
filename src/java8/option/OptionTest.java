package java8.option;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.StrUtil;

import javax.naming.Name;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class OptionTest {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = null;
    
        Optional<Integer> a1 = Optional.of(a);
        Optional<Integer> b1 = Optional.ofNullable(b);
    
        System.out.println(StrUtil.compare("2.7", "4", false));
        System.out.println(a1.isPresent());
        System.out.println(b1.isPresent());
    
        System.out.println(a1.get());
        System.out.println(b1.orElse(new Integer("100")));
    
        HashMap<Object, Object> map = new HashMap<>();
    
        test test = new test();
        OptionTest.test test1 = BeanUtil.mapToBean(null, test.class, false);
    
        
        System.out.println(111);
    }
    
    static class test {
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        private String name;
        
    }
}
