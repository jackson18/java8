package com.java8.test01;

/**
 * Created by Administrator on 2015/8/11.
 */
public interface A {

    default public void foo() {
        System.out.println("call A.foo()");
    }
}
