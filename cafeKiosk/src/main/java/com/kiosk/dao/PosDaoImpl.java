package com.kiosk.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kiosk.vo.ManagerVo;

@Repository
public class PosDaoImpl implements PosDao{
	
	@Inject
	private SqlSession sqlSession;
	
	// 관리자 로그인 계정 확인
	@Override
	public ManagerVo managerLogin(ManagerVo managerVo) {
		return sqlSession.selectOne("posMapper.managerLogin", managerVo);
	}
}
