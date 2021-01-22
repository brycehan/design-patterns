package com.brycehan.designpatterns.facade;

/**
 * @author brycehan
 * @date 2021/1/22
 */
public class Light {
    public void open(){
        System.out.println("打开灯");
    }

    public void close(){
        System.out.println("关闭灯");
    }
}
