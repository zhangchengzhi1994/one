package java8.lambda;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Opt;
import lombok.Data;

import java.util.Date;
import java.util.Optional;

public class Java8Tester {
    
    
    public static void main(String args[]) {
        String salutation = "Hello! ";
        GreetingService greetService1 = message -> {
            System.out.println(salutation + message);
        };
        String s = null;
        String s1 = Optional.ofNullable(s).orElse("1");
        System.out.println(s1);
        greetService1.sayMessage("Runoob");
        DateTime start = DateUtil.date();
        DateTime end = DateUtil.date();
        
        System.out.println(DateUtil.between(start,end, DateUnit.MS));
        DateUtil.format(DateUtil.date(), "yyyy-MM-dd");
    
        User user = null;

        String addressValue = Opt.ofNullable(user)
                .map(User::getSchool)
                .map(User.School::getAddress).get();
        System.out.println(addressValue);
    }
    
    interface GreetingService {
        void sayMessage(String message);
    }
    
    @Data
    static class User {
        private String name;
        private String gender;
        private School school;
        
        @Data
        public static class School {
            private String name;
            private String address;
        }
    }
}
