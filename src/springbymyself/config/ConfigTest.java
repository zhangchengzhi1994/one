package springbymyself.config;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * javaConfig 取代了spring的xml配置
 * xml配置是一种装配形式的属性注入
 * xml的每一条等于是一个Bean （可以开多个分支，给多个属性安排值）
 *
 *
 *
 *
 */




public class ConfigTest {
    //这个方法的名字就相当于bean标签中的ID属性
    //方法的返回值相当于bean标签中的class属性
    @Bean
    public People getUser(){
        return new People(); //就是要注入到bean的对象
        
    }
    
    public static void main(String[] args) {
        ObjectMapper on = new ObjectMapper();
        on.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        on.set
    }

}


@Component
@Data
class People {
    @Value("张承志")
    String name;
}


