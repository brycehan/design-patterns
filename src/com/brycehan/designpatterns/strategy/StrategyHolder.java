package com.brycehan.designpatterns.strategy;

/**
 * @author brycehan
 * @date 2021/1/20
 */
public class StrategyHolder {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        this.strategy.execute();
    }
}
