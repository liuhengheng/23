package com.lh.pattern.behavior_type.iterator;

/**
 * 迭代型模式
 */
public class Main {
    public static void main(String[] args) {
        List list = new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
