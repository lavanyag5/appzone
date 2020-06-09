/*package com.xworkz.appzone.controller;

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
import com.xworkz.appzone.dto.ManageRoleDTO;
import com.xworkz.appzone.exception.managerole.ManageRoleControllerException;
import com.xworkz.appzone.service.managerole.ManageRoleServiceImpl;

@Controller
@RequestMapping(value = "*.do")
public class ManageRoleController {

	@Autowired
	private ManageRoleServiceImpl service;

	public static final Logger logger = LoggerFactory.getLogger(ManageRoleController.class);

	public ManageRoleController() {
		logger.info(this.getClass().getSimpleName() + " \t Created");
	}

	@RequestMapping(value = "managerole.do", method = RequestMethod.POST)
	public ModelAndView manageRole(ManageRoleDTO dto, HttpServletRequest req) throws ManageRoleControllerException {
		try {
			logger.info("ManageRoleController--> manageRole() invoked");
			HttpSession session = req.getSession(false);
			service.manageRoleService(dto);
			return new ModelAndView(ApplicationConstants.MANAGEROLE, StringConstants.USER, dto)
					.addObject("Successfully Added");
		} catch (Exception e) {
			throw new ManageRoleControllerException("Exception occured in ManageRoleController " + e.getMessage());
		}
	}

}*/