package com.java8.test04;

import java.lang.annotation.*;
import java.util.Arrays;

/**
 * java8 新增的@Repeatable注解，其实只是语法糖而已．
 * java8 注解的 {@link RepeatAnn} 类与 {@link Annotations}是等价的．
 * 新注解讲语法糖转化为注解值为数组形式．
 * Created by Administrator on 2015/8/15.
 */
public class AnnotationTest {

    public static void main(String[] args) {
        Annotation[] annotations = RepeatAnn.class.getAnnotations();
        System.out.println(annotations.length); //1
        Arrays.stream(annotations).forEach(System.out::println);

        Annotation[] annotations2 = Annotations.class.getAnnotations();
        System.out.println(annotations2.length);//1
        Arrays.stream(annotations2).forEach(System.out::println);

    }

    @Repeatable(value = Roles.class)
    public static @interface Role {
        String name() default "doctor";
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public static @interface Roles {
        Role[] value();
    }

    @Role(name = "doctor")
    @Role(name = "who")
    public static class RepeatAnn {

    }

    @Roles({@Role(name = "doctor"),
            @Role(name = "who")})
    public static class Annotations {

    }
}
