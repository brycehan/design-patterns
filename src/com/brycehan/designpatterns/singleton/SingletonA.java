package com.brycehan.designpatterns.singleton;

/**
 * 饿汉式
 * @author brycehan
 * @date 2021/1/19
 */
public class SingletonA {
    private static final SingletonA INSTANCE = new SingletonA();

    private SingletonA(){}

    public static SingletonA getInstance(){
        return INSTANCE;
    }
}
