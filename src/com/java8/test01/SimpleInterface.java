package com.java8.test01;

/**
 * Created by Administrator on 2015/8/10.
 */
public interface SimpleInterface {

    public void doSomeWork();

    default public void doSomeOtherWork() {
        System.out.println("doSomeOtherWork...");
    }
}
