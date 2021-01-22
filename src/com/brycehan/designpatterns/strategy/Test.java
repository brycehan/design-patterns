package com.brycehan.designpatterns.strategy;

/**
 * 策略设计模式测试
 * @author brycehan
 * @date 2021/1/20
 */
public class Test {
    public static void main(String[] args) {
        StrategyHolder strategyHolder = new StrategyHolder();

        strategyHolder.setStrategy(new StrategyA());
        strategyHolder.executeStrategy();

        strategyHolder.setStrategy(new StrategyB());
        strategyHolder.executeStrategy();

        strategyHolder.setStrategy(() -> {
            System.out.println("执行策略C");
        });
        strategyHolder.executeStrategy();
    }
}
