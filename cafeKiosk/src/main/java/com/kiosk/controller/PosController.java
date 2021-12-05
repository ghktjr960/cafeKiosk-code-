package com.kiosk.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kiosk.service.PosService;
import com.kiosk.vo.ManagerVo;

@Controller
public class PosController {
	
	private static final Logger logger = LoggerFactory.getLogger(PosController.class);
	
	@Inject
	private PosService posService;
	
	@RequestMapping(value = "/pos", method = RequestMethod.GET)
	public String pos() {
		logger.info("pos 메인으로 redirect요청");
		return "redirect:/pos/main";
	}
	
	@RequestMapping(value = "/pos/main", method = RequestMethod.GET)
	public String posMain() {
		logger.info("pos 메인 요청 : 관리자 로그인 페이지");
		return "/pos/posMain";
	}
	
	@RequestMapping(value = "/pos/main", method = RequestMethod.POST)
	public String posLogin(ManagerVo managerVo, HttpSession session) {
		
		logger.info("관리자 로그인 페이지 POST요청");
		
		if(managerVo != null) {
			System.out.println("post요청 시 manager : " + managerVo.toString());
		}
		
		ManagerVo login = posService.managerLogin(managerVo);
		
		if(login != null) {
			session.setAttribute("login", login);
			return "/pos/orderList";
		} else {
			return "/pos/posMain";
		}
		
	}
	
}
