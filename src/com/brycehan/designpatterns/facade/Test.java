package com.brycehan.designpatterns.facade;

/**
 * 门面设计模式测试
 * @author brycehan
 * @date 2021/1/22
 */
public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.open();
        facade.close();
    }
}
