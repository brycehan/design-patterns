package com.brycehan.designpatterns.factory.factorymethod;

/**
 * 工厂方法设计模式测试
 * @author brycehan
 * @date 2021/1/19
 */
public class Test {
    public static void main(String[] args) {
        Movable car = new CarFactory().create();
        Movable plane = new PlaneFactory().create();
        car.move();
        plane.move();
    }
}
