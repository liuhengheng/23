package com.lh.pattern.create_type.method_factory;

/**
 * 工厂方法模式
 * 
 * @author liuheng
 * 
 */
public class Main {
	public static void main(String[] args) {
		FunFactory factory = new AudiFactory();
		System.out.println(factory.getCar());
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		factory = new BenzFactory();
		System.out.println(factory.getCar());
	}
}
