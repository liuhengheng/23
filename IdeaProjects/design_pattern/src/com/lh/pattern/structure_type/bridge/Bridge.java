package com.lh.pattern.structure_type.bridge;

/**
 * 桥梁类(抽象类)
 * 
 * @author liuheng
 * 
 */
public abstract class Bridge {
	private Driver driver;

	public void connect() {
		driver.connect();
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	
}
