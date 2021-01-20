package com.brycehan.designpatterns.factory.factorymethod;

/**
 * @author brycehan
 * @date 2021/1/19
 */
public class ProductBFactory implements Factory {
    @Override
    public Product create() {
        return new ProductB();
    }
}
