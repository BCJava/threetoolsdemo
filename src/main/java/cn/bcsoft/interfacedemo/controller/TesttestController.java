package cn.bcsoft.interfacedemo.controller;

import cn.bcsoft.interfacedemo.entity.Testtest;
import cn.bcsoft.interfacedemo.service.TesttestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试库(Testtest)表控制层
 *
 * @author blackchen
 * @since 2020-09-10 14:00:00
 */
@RestController
@RequestMapping("/testtest")
public class TesttestController {

	/**
	 * 服务对象
	 */
	@Resource
	private TesttestService testtestService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("/selectOne")
	public Testtest selectOne(Integer id) {
		return this.testtestService.queryById(id);
	}

}