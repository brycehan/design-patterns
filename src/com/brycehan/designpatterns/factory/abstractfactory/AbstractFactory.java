package com.brycehan.designpatterns.factory.abstractfactory;

/**
 * 工厂好扩展，产品不好扩展
 * @author brycehan
 * @date 2021/1/22
 */
public abstract class AbstractFactory {
    /**
     * 生产食物
     * @return
     */
    abstract Food createFood();

    /**
     * 生产交通工具
     * @return
     */
    abstract Vehicle createVehicle();
}
