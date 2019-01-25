package com.lh.pattern.behavior_type.visitor;

public interface IVisitor {
    // 可以访问那些对象
    public void visit(ConcreteElement1 cel1);
    public void visit(ConcreteElement2 cel2);
}
