package com.xiaoerzuche.biz.permission.enu;

/**
 * 记录状态枚举类
 * @author Nick C
 *
 */
public enum CommonStatus {
	
    ENABLE (1, "启用"), DISABLE (0, "禁用");

    //code
    private int code ;
    //名称
    private String name;

    private CommonStatus(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
