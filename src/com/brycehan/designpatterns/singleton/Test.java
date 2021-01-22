package com.brycehan.designpatterns.singleton;

/**
 * 单例设计模式测试
 * @author brycehan
 * @date 2021/1/22
 */
public class Test {
    public static void main(String[] args) {
        SingletonA singletonA = SingletonA.getInstance();
        SingletonA singletonA1 = SingletonA.getInstance();
        System.out.println(singletonA = singletonA1);
    }
}
