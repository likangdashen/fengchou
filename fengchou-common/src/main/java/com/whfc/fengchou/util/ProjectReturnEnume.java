package com.whfc.fengchou.util;

/**
 * 项目回报类型枚举类
 * @author Administrator
 *
 */
public enum ProjectReturnEnume {
	VIRTUAL("0", "虚拟物品"), 
	REAL("1", "实物回报");

	private String code;
	private String type;

	private ProjectReturnEnume(String code, String type) {
		this.code = code;
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
