package com.kiosk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PosController {
	
	private static final Logger logger = LoggerFactory.getLogger(PosController.class);
	
	@RequestMapping(value = "/pos", method = RequestMethod.GET)
	public String pos() {
		logger.info("pos 메인으로 redirect요청");
		return "redirect:/pos/main";
	}
	
	@RequestMapping(value = "/pos/main", method = RequestMethod.GET)
	public String posMain() {
		logger.info("pos 메인 요청");
		return "/pos/posMain";
	}
	
	
}
