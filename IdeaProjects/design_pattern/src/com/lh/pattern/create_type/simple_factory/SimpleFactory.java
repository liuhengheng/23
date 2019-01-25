package com.lh.pattern.create_type.simple_factory;

/**
 * 工厂开始准备加工，定义了一个工厂类
 * 
 * @author liuheng
 * 
 */
public class SimpleFactory {
	public Car getCar(String name) {
		if ("Bmw".equalsIgnoreCase(name)) {
			return new Bmw();
		} else if ("Benz".equalsIgnoreCase(name)) {
			return new Benz();
		} else if ("Audi".equalsIgnoreCase(name)) {
			return new Audi();
		} else {
			System.out.println("这款汽车暂无生产");
			return null;
		}
	}
}
