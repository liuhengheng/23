package com.lh.pattern.structure_type.component;

/**
 * 组合模式
 * 
 * @author liuheng
 * 
 */
public class Main {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));

		Composite compX = new Composite("Composite X");
		compX.add(new Leaf("Leaf XA"));
		compX.add(new Leaf("Leaf XB"));
		root.add(compX);

		Composite compXY = new Composite("Composite XY");
		compXY.add(new Leaf("Leaf XYA"));
		compXY.add(new Leaf("Leaf XYB"));
		compX.add(compXY);

		root.display(1);
	}
}
