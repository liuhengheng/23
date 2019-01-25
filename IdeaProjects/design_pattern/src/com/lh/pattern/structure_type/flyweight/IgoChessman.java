package com.lh.pattern.structure_type.flyweight;

/**
 * 围棋棋子类：抽象享元类
 * 
 * @author liuheng
 * 
 */
abstract class IgoChessman {
	public abstract String getColor();

	public void display() {
		System.out.println("棋子颜色：" + this.getColor());
	}
}
