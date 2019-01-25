package com.lh.pattern.behavior_type.strategy;

/**
 * 减法
 */
public class SubtractStrategy implements Strategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 - num2;
    }
}
