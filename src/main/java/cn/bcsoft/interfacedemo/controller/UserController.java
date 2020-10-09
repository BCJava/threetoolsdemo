package cn.bcsoft.interfacedemo.controller;

import cn.bcsoft.interfacedemo.entity.User;
import cn.bcsoft.interfacedemo.listenertest.MyRobotListener;
import cn.bcsoft.interfacedemo.listenertest.Robot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: interfacedemo
 * Created by blackchen on 2020/9/10 10:24
 */
@RestController
@RequestMapping("threetest")
public class UserController {
	//过滤器
	@GetMapping("/filter")
	public Object filter(String name, String pwd) {

		return "拦截器----" + "\n name:"+ name + "\n pwd:"+pwd;
	}

	//拦截器
	@RequestMapping("/login")
	public String intercept(){
		System.out.println("Controller执行中....");
		return "Hello Interceptor!";
	}

	@RequestMapping("/logout")
	public String logout(){
		System.out.println("注销中....");
		return "logouting.....!";
	}

	//监听器
	@GetMapping("/listener")
	public String listener() {
		Robot robot = new Robot();
		robot.registerListener(new MyRobotListener());
		robot.working();
		robot.dancing();

		return "this.testtestService.queryById(id)" + "----" ;
	}
//	@Autowired
//	UserService service;
	@RequestMapping(value = "/getUserItem",method = RequestMethod.GET)
	public String getUserItem(){
		User user = new User();
		user.setName("aaaa");
		user.setPassword("asdasdasda");
		return user.toString();
	}
}
