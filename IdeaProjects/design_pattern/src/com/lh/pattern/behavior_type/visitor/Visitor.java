package com.lh.pattern.behavior_type.visitor;

public class Visitor implements IVisitor {
    // 访问cel1元素
    @Override
    public void visit(ConcreteElement1 cel1) {
        cel1.doSomething();
    }
    // 访问cel2元素
    @Override
    public void visit(ConcreteElement2 cel2) {
        cel2.doSomething();
    }
}
