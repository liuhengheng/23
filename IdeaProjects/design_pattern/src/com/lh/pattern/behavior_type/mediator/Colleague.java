package com.lh.pattern.behavior_type.mediator;

/**
 * 定义抽象Colleague
 */
public class Colleague {
    //同事名称
    protected String name;
    //中介者
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
