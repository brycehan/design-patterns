package com.brycehan.designpatterns.facade;

/**
 * @author brycehan
 * @date 2021/1/22
 */
public class Heater {
    public void open(){
        System.out.println("打开热水器");
    }

    public void close(){
        System.out.println("关闭热水器");
    }
}
