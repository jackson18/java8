package com.java8.test02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2015/8/11.
 */
public class CollectionSort {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("b", "a", "c");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        Collections.sort(list, (a, b) -> b.compareTo(a));
        System.out.println(list);
    }
}
