package com.lh.pattern.behavior_type.visitor;

/**
 * 访问者模式
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 获得元素对象
            Element e = ObjectStruture.createElement();
            // 接受访问者访问
            e.accet(new Visitor());
        }

    }
}
