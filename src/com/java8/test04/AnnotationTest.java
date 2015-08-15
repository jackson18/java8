package com.java8.test04;

import java.lang.annotation.*;
import java.util.Arrays;

/**
 * java8 ������@Repeatableע�⣬��ʵֻ���﷨�Ƕ��ѣ�
 * java8 ע��� {@link RepeatAnn} ���� {@link Annotations}�ǵȼ۵ģ�
 * ��ע�⽲�﷨��ת��Ϊע��ֵΪ������ʽ��
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
