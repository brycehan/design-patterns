package com.brycehan.designpatterns.factory.factorymethod;

/**
 * @author brycehan
 * @date 2021/1/19
 */
public class Plane implements Movable {
    @Override
    public void move() {
        System.out.println("飞机起飞了");
    }
}
