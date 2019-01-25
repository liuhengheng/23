package com.lh.pattern.behavior_type.interpret;

public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String d) {
        // TODO Auto-generated constructor stub
        this.distance = d;
    }

    @Override
    public String interpret() {
        // TODO Auto-generated method stub

        return distance;
    }
}
