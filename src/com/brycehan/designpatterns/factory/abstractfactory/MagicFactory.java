package com.brycehan.designpatterns.factory.abstractfactory;

/**
 * @author brycehan
 * @date 2021/1/22
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Mushroom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }
}
