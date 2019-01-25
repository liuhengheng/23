package com.lh.pattern.create_type.method_factory;

import com.lh.pattern.create_type.simple_factory.Benz;
import com.lh.pattern.create_type.simple_factory.Car;

public class BenzFactory implements FunFactory{

	public Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
