package cn.bcsoft.interfacedemo.dao;

import cn.bcsoft.interfacedemo.entity.User;

/**
 * Description: idea-workspace
 * Created by blackchen on 2020/9/10 13:43
 */
public interface UserDao {
	/**
	 * 通过ID查询单条数据
	 *
	 * @param testId 主键
	 * @return 实例对象
	 */
	User queryById(Integer testId);
}
