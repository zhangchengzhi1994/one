package annotation;

import lombok.ToString;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

public class MethodInfoTest {

    public static void main(String[] args) {
        MethodInfoTest methodInfoTest = new MethodInfoTest();
        methodInfoTest.getMethodInfo();
    }

    @MethodInfo("gsdfgsdgsdgfshjwjenw")
    public void getMethodInfo() {
        Method[] declaredMethods = this.getClass().getDeclaredMethods();
        //遍历循环方法并获取对应的注解名称
        for (Method declaredMethod : declaredMethods) {
            boolean annotationPresent = declaredMethod.isAnnotationPresent(MethodInfo.class);
            if (annotationPresent) {
                MethodInfo annotation = declaredMethod.getAnnotation(MethodInfo.class);
                System.out.println(annotation.age());
                System.out.println(annotation.name());
                System.out.println("data ---- " + annotation.data());
                System.out.println("value ---- " + annotation.value());
            }
        }
    }
}
