package com.java8.test01;

/**
 * Created by Administrator on 2015/8/10.
 */
public class SimpleInterfaceImpl implements SimpleInterface {
    @Override
    public void doSomeWork() {
        System.out.println("do some work...");
    }

    public static void main(String[] args) {
        SimpleInterfaceImpl sii = new SimpleInterfaceImpl();
        sii.doSomeWork();
        sii.doSomeOtherWork();
    }
}
