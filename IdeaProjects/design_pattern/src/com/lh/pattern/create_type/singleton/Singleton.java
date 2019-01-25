package com.lh.pattern.create_type.singleton;
/**
 * 单例模式
 * @author liuheng
 *
 */
public class Singleton {
	private static Singleton instance = null;
	  // 防止被外部实例化
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
