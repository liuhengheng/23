package com.lh.pattern.create_type.method_factory;

import com.lh.pattern.create_type.simple_factory.Bmw;
import com.lh.pattern.create_type.simple_factory.Car;

public class AudiFactory implements FunFactory{

	public Car getCar() {
		return new Bmw();
	}

}
