package com.brycehan.designpatterns.factory.factorymethod;

/**
 * @author brycehan
 * @date 2021/1/19
 */
public class ProductAFactory implements Factory{
    @Override
    public Product create() {
        return new ProductA();
    }
}
