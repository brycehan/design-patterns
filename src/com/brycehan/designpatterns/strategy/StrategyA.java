package com.brycehan.designpatterns.strategy;

/**
 * @author brycehan
 * @date 2021/1/20
 */
public class StrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("执行策略A");
    }
}
