package com.brycehan.designpatterns.factory.factorymethod;

/**
 * @author brycehan
 * @date 2021/1/19
 */
public class Test {
    public static void main(String[] args) {
        Product productA = new ProductAFactory().create();
        Product productB = new ProductBFactory().create();
        productA.show();
        productB.show();
    }
}
