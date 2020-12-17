package annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String name() default "张承志";
    int age() default 26;


    @AliasFor("data")
    String data() default "data";

    @AliasFor("pp")
    String value() default "value";
}


