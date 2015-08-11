package com.java8.test01;

import sun.applet.Main;

/**
 * Created by Administrator on 2015/8/11.
 */
public class C implements A, B {

    public void foo() {
        A.super.foo();
    }

    public static void main(String[] args) {
        C c = new C();
        c.foo();
    }
}
