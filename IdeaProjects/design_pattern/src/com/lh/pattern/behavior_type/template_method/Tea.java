package com.lh.pattern.behavior_type.template_method;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水侵泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    protected boolean hook() {
        return super.hook();
    }
}
