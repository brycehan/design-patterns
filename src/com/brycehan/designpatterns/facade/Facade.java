package com.brycehan.designpatterns.facade;

/**
 * @author brycehan
 * @date 2021/1/22
 */
public class Facade {
    private Light light;
    private Heater heater;
    private Television television;

    public Facade() {
        this.light = new Light();
        this.heater = new Heater();
        this.television = new Television();
    }

    public void open(){
        light.open();
        heater.open();
        television.open();
    }

    public void close(){
        light.close();
        heater.close();
        television.close();
    }
}
