package com.kiosk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KioskController {
	
	private static final Logger logger = LoggerFactory.getLogger(KioskController.class);
	
	@RequestMapping(value = "/kiosk", method = RequestMethod.GET)
	public String kiosk() {
		
		logger.info("kiosk 메인으로 redirect요청");
		
		return "redirect:/kiosk/main";
	}
	
	@RequestMapping(value = "/kiosk/main", method = RequestMethod.GET)
	public String kioskMain() {
		
		logger.info("kiosk 메인 요청");
		
		return "/kiosk/kioskMain";
	}
}
