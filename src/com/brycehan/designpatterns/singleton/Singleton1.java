package com.brycehan.designpatterns.singleton;

/**
 * 饿汉式
 * @author brycehan
 * @date 2021/1/19
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
