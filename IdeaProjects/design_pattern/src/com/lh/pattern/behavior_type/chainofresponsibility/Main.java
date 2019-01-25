package com.lh.pattern.behavior_type.chainofresponsibility;

/**
 * 责任链模式
 */
public class Main {
    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("MyHandler1");
        MyHandler handler2 = new MyHandler("MyHandler2");
        MyHandler handler3 = new MyHandler("MyHandler3");
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler1.operator();
    }
}
