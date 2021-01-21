package com.brycehan.designpatterns.factory.factorymethod;

/**
 * @author brycehan
 * @date 2021/1/19
 */
public class PlaneFactory implements Factory {
    @Override
    public Movable create() {
        return new Plane();
    }
}
