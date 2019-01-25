package com.lh.pattern.structure_type.decorator;

/**
 * 装饰类
 * @author liuheng
 *
 */
public class Decorator implements Component{
	Component component;
	
	public Decorator(Component component){
		this.component = component;
	}
	public void biu() {
		this.component.biu();
	}
}
