package com.lh.pattern.structure_type.decorator;

/**
 * 装饰器模式
 * @author liuheng
 *
 */
public class Main {
	
	public static void main(String[] args){
		DecoratorImpl decoratorImpl = new DecoratorImpl(new ComponentImpl2());
		decoratorImpl.biu();
	}
}
