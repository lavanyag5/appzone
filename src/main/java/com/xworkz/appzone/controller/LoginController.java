package com.xworkz.appzone.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.appzone.constant.ApplicationConstants;
import com.xworkz.appzone.constant.StringConstants;
import com.xworkz.appzone.dto.LoginDTO;
import com.xworkz.appzone.exception.login.LoginControllerException;
import com.xworkz.appzone.service.login.LoginService;

@Controller
@RequestMapping("*.do")
public class LoginController {

	@Autowired
	private LoginService service;

	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	public LoginController() {
		logger.info(this.getClass().getSimpleName() + " \t Created");
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public ModelAndView loginController(LoginDTO dto, HttpServletRequest req) throws LoginControllerException {
		logger.info("LoginController--> logincontroller()-----invoked" + dto);
		try {
			HttpSession session = req.getSession(true);
			
			LoginDTO dtoFromDb = service.loginService(dto);
			logger.debug("data from db" + dtoFromDb);
			if (dtoFromDb != null) {

				session.setAttribute("user", dtoFromDb);

				if (dtoFromDb.getUserGroup().equals("admin")) {
					logger.info("User is Admin");

					return new ModelAndView(ApplicationConstants.HOME, StringConstants.SUCCESS,
							StringConstants.SUCCESS_MESSAGE).addObject(StringConstants.USER, dtoFromDb);
				} else if (dtoFromDb.getUserGroup() == "user") {
					logger.info("Input is User");
					return new ModelAndView(ApplicationConstants.SEARCH, StringConstants.SUCCESS,
							StringConstants.SUCCESS_MESSAGE);
				}

			} else {
				logger.info("User not found, Redirecting to Signin..");
				return new ModelAndView(ApplicationConstants.SIGNIN, StringConstants.USER_NOT_FOUND,
						StringConstants.USER_NOT_FOUND_MESSAGE);
			}
		} catch (Exception e) {
			throw new LoginControllerException("Exception occured in logincontroller" + e.getMessage());
		}
		return null;

	}
}
