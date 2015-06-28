package com.pichen.demos.ant.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAnt extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * hello ant sting
	 */
	private String helloAnt;
	
	public String execute() throws Exception{
		setHelloAnt("hello Ant(this is a demo project!)");
		return SUCCESS;
	}
	public String getHelloAnt() {
		return helloAnt;
	}

	public void setHelloAnt(String helloAnt) {
		this.helloAnt = helloAnt;
	}
	
}
