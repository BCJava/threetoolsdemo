package cn.bcsoft.interfacedemo.entity;

import java.io.Serializable;

/**
 * 测试(Test1)实体类
 *
 * @author blackchen
 * @since 2020-09-22 14:48:19
 */
public class Test1 implements Serializable {
	private static final long serialVersionUID = -84987687373790585L;
	/**
	 * id
	 */
	private Integer rId;
	/**
	 * tt
	 */
	private String tt;


	public Integer getRId() {
		return rId;
	}

	public void setRId(Integer rId) {
		this.rId = rId;
	}

	public String getTt() {
		return tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

}