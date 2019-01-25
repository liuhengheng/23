package com.lh.pattern.structure_type.proxy.static_mode;

/**
 * 代理对象
 * 静态代理
 * @author liuheng
 *
 */
public class UserDaoProxy implements IUserDao{
	IUserDao iUserDao;
	public UserDaoProxy(IUserDao iUserDao){
		this.iUserDao = iUserDao;
	}
	public void save() { 
		System.out.println("开始事务...");
		iUserDao.save();//执行目标对象的方法
        System.out.println("提交事务...");
	}

}
