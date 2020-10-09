package cn.bcsoft.interfacedemo.controller;

import cn.bcsoft.interfacedemo.entity.Test1;
import cn.bcsoft.interfacedemo.service.Test1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试(Test1)表控制层
 *
 * @author blackchen
 * @since 2020-09-22 14:48:22
 */
@RestController
@RequestMapping("test1")
public class Test1Controller {
	/**
	 * 服务对象
	 */
	@Resource
	private Test1Service test1Service;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param test1 主键
	 * @return 单条数据
	 */
	@GetMapping("add")

	public Test1 add(Test1 test1) {
		return this.test1Service.insert(test1);
	}

	/**
	 * 通过主键查询单条数据
	 *
	 * @param idd 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public Test1 selectOne(int idd) {
		return this.test1Service.queryById(idd);
	}

}