package com.java8.test03;

/**
 * Created by Administrator on 2015/8/12.
 */

public class FunctionalInterface {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        int converted = converter.convert("123");
        System.out.println(converted);    // 123

        Converter<String, Integer> converter2 = Integer::valueOf;
        int converted2 = converter2.convert("123");
        System.out.println(converted2);

        int num = 1;
        Converter<String, Integer> converter3 = (from) -> Integer.valueOf(from + num);
        int converted3 = converter3.convert("123");
        System.out.println(converted3);

        PersonFactory<Person> personFactroy = Person::new;
        Person p = personFactroy.create("jackson", "qi");
        System.out.println(p.firstName);
    }
}

@java.lang.FunctionalInterface
interface Converter<F,T>{
    T convert(F from);
}

interface PersonFactory<p extends Person> {
    Person create(String firstName, String lastName);
}

class Person {
    String firstName;
    String lastName;
    Person() {}
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
