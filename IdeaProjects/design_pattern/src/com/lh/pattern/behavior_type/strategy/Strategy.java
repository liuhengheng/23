package com.lh.pattern.behavior_type.strategy;

/**
 * 定义抽象策略角色
 */
public interface Strategy {
    /**
     * 定义两个数可以计算 （只计算加减）
     * @param num1
     * @param num2
     * @return
     */
    public int calc(int num1,int num2);
}
