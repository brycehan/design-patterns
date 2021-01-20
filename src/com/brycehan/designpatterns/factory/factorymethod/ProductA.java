package com.brycehan.designpatterns.factory.factorymethod;

/**
 * @author brycehan
 * @date 2021/1/19
 */
public class ProductA implements Product {
    @Override
    public void show() {
        System.out.println("生产出了产品A");
    }
}
