package cn.bcsoft.interfacedemo.listenertest;

/**
 * Description: 事件对象
 * Created by blackchen on 2020/9/16 11:02
 */
public class RobotEven {
	private Robot robot;

	public RobotEven(Robot robot){
		super();
		this.robot = robot;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
}
