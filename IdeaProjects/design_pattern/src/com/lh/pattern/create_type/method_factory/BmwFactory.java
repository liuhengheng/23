package com.lh.pattern.create_type.method_factory;

import com.lh.pattern.create_type.simple_factory.Audi;
import com.lh.pattern.create_type.simple_factory.Car;

public class BmwFactory implements FunFactory {

	public Car getCar() {
		return new Audi();
	}

}
