package com.kiosk.vo;

import java.util.Date;

public class ManagerVo {
	private int num;
	private String id;
	private String pw;
	private String status;
	private Date regdate;
	
	public ManagerVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManagerVo(int num, String id, String pw, String status, Date regdate) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.status = status;
		this.regdate = regdate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "ManagerVo [num=" + num + ", id=" + id + ", pw=" + pw + ", status=" + status + ", regdate=" + regdate
				+ "]";
	}
}
