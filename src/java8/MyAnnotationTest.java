package java8;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class MyAnnotationTest {
    
    public static void main(String[] args) {
        AnnotationUser annotationUser = new AnnotationUser();
        MyAnnotation annotation = annotationUser.getClass().getAnnotation(MyAnnotation.class);
        String value = annotation.value();
        int id = annotation.id();
    
        System.out.println(value);
        System.out.println(id);
    }
    
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface MyAnnotation {
        int id() default 0;
        String value();
    }
    
    
    @MyAnnotation(value = "test")
    static
    class AnnotationUser {
    
    }
    
    
}
