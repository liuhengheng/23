package com.lh.pattern.structure_type.decorator;

/**
 * 具体装饰类
 * @author liuheng
 *
 */
public class DecoratorImpl extends Decorator{

	public DecoratorImpl(Component component) {
		super(component);
	}
	public void biu() {
		System.out.println("ready? go!");
		this.component.biu();
	}
}
