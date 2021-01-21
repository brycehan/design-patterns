package com.brycehan.designpatterns.factory.abstractfactory;

/**
 * @author brycehan
 * @date 2021/1/22
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
