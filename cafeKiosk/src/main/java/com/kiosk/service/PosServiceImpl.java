package com.kiosk.service;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.kiosk.dao.PosDao;
import com.kiosk.vo.ManagerVo;

@Repository
public class PosServiceImpl implements PosService{
	
	@Inject
	private PosDao posDao;
	
	@Override
	public ManagerVo managerLogin(ManagerVo managerVo) {

		ManagerVo loginCheck = posDao.managerLogin(managerVo);

		if(loginCheck != null && loginCheck.getPw().equals(managerVo.getPw())) {
			return loginCheck;
		} else {
			return null;
		}
	}
}
