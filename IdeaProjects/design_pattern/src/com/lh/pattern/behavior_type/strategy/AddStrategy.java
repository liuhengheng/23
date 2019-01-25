package com.lh.pattern.behavior_type.strategy;

/**
 * 加法
 */
public class AddStrategy implements Strategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
