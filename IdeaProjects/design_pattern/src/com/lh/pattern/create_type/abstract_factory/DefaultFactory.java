package com.lh.pattern.create_type.abstract_factory;

import com.lh.pattern.create_type.method_factory.AudiFactory;
import com.lh.pattern.create_type.simple_factory.Car;

/**
 * 代理工厂品牌包装了
 * 
 * @author liuheng
 * 
 */
public class DefaultFactory extends AbstractFactory {
	private AudiFactory factory = new AudiFactory();

	@Override
	Car getCar() {
		// TODO Auto-generated method stub
		return factory.getCar();
	}

}
