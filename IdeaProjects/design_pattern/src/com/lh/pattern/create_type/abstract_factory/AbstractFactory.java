package com.lh.pattern.create_type.abstract_factory;

import com.lh.pattern.create_type.method_factory.AudiFactory;
import com.lh.pattern.create_type.method_factory.BenzFactory;
import com.lh.pattern.create_type.method_factory.BmwFactory;
import com.lh.pattern.create_type.simple_factory.Car;

/**
 * 代理工厂
 * 
 * @author liuheng
 * 
 */
public abstract class AbstractFactory {
	abstract Car getCar();

	// 这段代码动态配置的功能
	public Car getCar(String name) {
		if ("Bmw".equalsIgnoreCase(name)) {
			return new BmwFactory().getCar();
		} else if ("Benz".equalsIgnoreCase(name)) {
			return new BenzFactory().getCar();
		} else if ("Audi".equalsIgnoreCase(name)) {
			return new AudiFactory().getCar();
		} else {
			System.out.println("这个商品暂无生产");
			return null;
		}

	}
}
