package com.brycehan.designpatterns.factory.abstractfactory;

/**
 * @author brycehan
 * @date 2021/1/22
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();

        Food food = factory.createFood();
        Vehicle vehicle = factory.createVehicle();
        System.out.println(food);
        System.out.println(vehicle);

        factory = new MagicFactory();
        food = factory.createFood();
        vehicle = factory.createVehicle();
        System.out.println(food);
        System.out.println(vehicle);
    }
}
