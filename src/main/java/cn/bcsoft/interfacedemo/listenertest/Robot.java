package cn.bcsoft.interfacedemo.listenertest;

/**
 * Description: 事件起源
 * Created by blackchen on 2020/9/16 10:57
 */
public class Robot {
	private RobotListener listener;

	/**
	 * 注册机器人监听器
	 * @param listener
	 */
	public void registerListener(RobotListener listener){
		this.listener  = listener;
	}

	/**
	 * 工作
	 */
	public void working(){
		System.out.println("机器人开始工作......");

		if(listener!=null){
			RobotEven even = new RobotEven(this);
			this.listener.working(even);
		}
	}

	/**
	 * 跳舞
	 */
	public void dancing(){
		System.out.println("机器人开始跳舞......");

		if(listener!=null){
			RobotEven even = new RobotEven(this);
			this.listener.dancing(even);
		}
	}
}
