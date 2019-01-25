package com.lh.pattern.behavior_type.strategy;

public class Enviroment {
    private Strategy strategy;

    public Enviroment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calute(int a, int b) {
        return strategy.calc(a, b);
    }
}
