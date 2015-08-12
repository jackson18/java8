package com.java8.test03;

/**
 * Created by Administrator on 2015/8/12.
 */

public class FunctionalInterface {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        int converted = converter.convert("123");
        System.out.println(converted);    // 123
    }
}

@java.lang.FunctionalInterface
interface Converter<F,T>{
    T convert(F from);
}

