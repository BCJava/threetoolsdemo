package cn.bcsoft.interfacedemo.listenertest;

/**
 * Description: 实现事件监听器
 * Created by blackchen on 2020/9/16 10:58
 */
public interface RobotListener {
	public void working(RobotEven even);
	public void dancing(RobotEven even);
}
