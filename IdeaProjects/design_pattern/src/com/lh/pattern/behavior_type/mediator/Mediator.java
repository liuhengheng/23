package com.lh.pattern.behavior_type.mediator;

/**
 * 定义抽象Mediator,可以与同事们进行联络
 */
public abstract class Mediator {
    /**
     * 用来联系的方法
     * @param content
     * @param coll
     */
    public abstract void contact(String content,Colleague coll);
}
