package com.lh.pattern.structure_type.proxy.static_mode;

/**
 * 接口实现
 * 目标对象
 * @author liuheng
 *
 */
public class UserDaoImpl implements IUserDao{

	public void save() {
		System.out.println("保存成功。。。。");
	}

}
