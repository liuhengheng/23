package com.lh.pattern.behavior_type.visitor;

public class ConcreteElement1 extends Element {
    // 完善业务逻辑
    @Override
    public void doSomething() {
        // 业务处理
        System.out.println("ConcreteElement1 业务处理");
    }
    // 允许哪个访问者来访问
    @Override
    public void accet(IVisitor visitor) {
        visitor.visit(this);
    }
}
