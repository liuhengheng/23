package com.lh.pattern.behavior_type.strategy;

/**
 * 策略模式
 */
public class Main {
    public static void main(String[] args) {
        Enviroment enviroment = new Enviroment(new AddStrategy());
        int aa = enviroment.calute(1,2);
        System.out.println("aa = " + aa);
    }
}
