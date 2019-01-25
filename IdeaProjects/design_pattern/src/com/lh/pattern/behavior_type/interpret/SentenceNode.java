package com.lh.pattern.behavior_type.interpret;

public class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distanc;

    public SentenceNode(AbstractNode direc, AbstractNode a, AbstractNode d) {
        // TODO Auto-generated constructor stub
        this.direction = direc;
        this.action = a;
        this.distanc = d;
    }

    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distanc.interpret();
    }
}
