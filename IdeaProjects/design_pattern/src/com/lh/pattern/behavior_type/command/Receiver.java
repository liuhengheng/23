package com.lh.pattern.behavior_type.command;

/**
 * 第三步：定义Receiver,知道如何实现与执行一个请求相关的操作
 */
public class Receiver {
    public void action() {
        System.out.println("执行一个命令");
    }

    public void unAction() {
        System.out.println("撤销一个命令");
    }
}
