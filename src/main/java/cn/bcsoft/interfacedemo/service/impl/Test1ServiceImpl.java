package cn.bcsoft.interfacedemo.service.impl;

import cn.bcsoft.interfacedemo.dao.Test1Dao;
import cn.bcsoft.interfacedemo.entity.Test1;
import cn.bcsoft.interfacedemo.service.Test1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试(Test1)表服务实现类
 *
 * @author blackchen
 * @since 2020-09-22 14:48:19
 */
@Service("test1Service")
public class Test1ServiceImpl implements Test1Service {
	@Resource
	private Test1Dao test1Dao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param idd 主键
	 * @return 实例对象
	 */
	@Override
	public Test1 queryById(int idd) {
		return this.test1Dao.queryById(idd);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<Test1> queryAllByLimit(int offset, int limit) {
		return this.test1Dao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param test1 实例对象
	 * @return 实例对象
	 */
	@Override
	public Test1 insert(Test1 test1) {
		this.test1Dao.insert(test1);
		return test1;
	}

	/**
	 * 修改数据
	 *
	 * @param test1 实例对象
	 * @return 实例对象
	 */
	@Override
	public Test1 update(Test1 test1) {
		this.test1Dao.update(test1);
		return this.queryById(test1.getRId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param idd 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Integer idd) {
		return this.test1Dao.deleteById(idd) > 0;
	}
}