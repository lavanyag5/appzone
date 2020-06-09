package com.xworkz.appzone.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.core.ApplicationSessionCookieConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.appzone.constant.ApplicationConstants;
import com.xworkz.appzone.constant.StringConstants;
import com.xworkz.appzone.dto.LoginDTO;

@Controller
@RequestMapping("*.do")
public class HomeController {

	public static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	public HomeController() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	@RequestMapping("/gotohome.do")
	public ModelAndView redirectingToHome(HttpServletRequest req) {
		logger.info("HomeController--> redirectingToHome() invoked");
		HttpSession session = req.getSession();
		LoginDTO dto = (LoginDTO) session.getAttribute("user");
		return new ModelAndView(ApplicationConstants.HOME, StringConstants.USER, dto);
	}

}
