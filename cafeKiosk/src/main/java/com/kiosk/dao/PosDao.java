package com.kiosk.dao;

import com.kiosk.vo.ManagerVo;

public interface PosDao {
	
	// 관리자 로그인 계정 확인
	public ManagerVo managerLogin(ManagerVo managerVo);
	
}
