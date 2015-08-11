package com.java8.test01;

/**
 * Created by Administrator on 2015/8/11.
 */
public interface B {

    default public void foo() {
        System.out.println("call B.foo()");
    }
}
