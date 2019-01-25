package com.lh.pattern.behavior_type.template_method;

/**
 * 咖啡
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡粉");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    protected boolean hook() {
        return super.hook();
    }
}
