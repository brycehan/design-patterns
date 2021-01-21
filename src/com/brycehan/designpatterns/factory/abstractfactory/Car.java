package com.brycehan.designpatterns.factory.abstractfactory;

/**
 * @author brycehan
 * @date 2021/1/22
 */
public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("The car is going.");
    }
}
