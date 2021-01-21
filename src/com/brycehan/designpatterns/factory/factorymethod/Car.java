package com.brycehan.designpatterns.factory.factorymethod;

/**
 * @author brycehan
 * @date 2021/1/19
 */
public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("汽车开动了");
    }
}
