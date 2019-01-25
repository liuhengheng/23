package com.lh.pattern.behavior_type.template_method;

/**
 * 模板方法模式
 */
public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
