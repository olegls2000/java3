package model;

import pattern.Iterator;

import java.util.Comparator;

public interface MyInterface /*extends Iterator, Comparator*/ {
    int t = 10;

    void myMethod();
/*    int myMethod(Number number);

    void myMethod(Long lng);

    void myMethod(Long lng, Long lng1);

    int myMethod(Integer integer);*/

    default int myDefaultMethod() {
        return 10;
    }
}
