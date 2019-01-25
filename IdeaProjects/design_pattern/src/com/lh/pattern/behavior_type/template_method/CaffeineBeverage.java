package com.lh.pattern.behavior_type.template_method;

/**
 * 模板方法
 */
public abstract class CaffeineBeverage {
    //算法。 抽象类的算法是final 的不允许被子类修改
    public final void prepareRecipe() {

        //算法的具体步骤
        boilWater(); //烧水（不变）
        brew();//冲泡（变）
        pourInCup();// 把饮料倒入杯子（不变）
        if (hook()) {
            addCondiments();// 加调料（变）
        }

    }

    // 把饮料倒入杯子（
    private void pourInCup() {
        System.out.print("把饮料倒入杯子");
    }
    //烧水
    private void boilWater() {
        System.out.print("烧水");
    }
    //烧水
    protected abstract void brew();
    // 加调料
    protected abstract void addCondiments();
    /**
     *  钩子，具体实现可以对算法步骤做一些控制
     *
     * @return
     */
    protected boolean hook() {
        return true;
    }
}