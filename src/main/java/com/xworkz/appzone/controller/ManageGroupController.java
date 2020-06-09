/*package com.xworkz.appzone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.appzone.dto.ManageGroupDTO;
import com.xworkz.appzone.exception.managegroup.ManageGroupControllerException;
import com.xworkz.appzone.service.managegroup.ManageGroupServiceImpl;

@Controller
@RequestMapping(value = "*.do")
public class ManageGroupController {

	@Autowired
	private ManageGroupServiceImpl service;

	public static final Logger logger = LoggerFactory.getLogger(ManageGroupController.class);

	public ManageGroupController() {
		logger.info(this.getClass().getSimpleName() + " \t Created");
	}

	@RequestMapping(value = "managegroup.do", method = RequestMethod.POST)
	public ModelAndView manageGroup(ManageGroupDTO dto) throws ManageGroupControllerException {
		logger.info("ManageGroupController--> managegroup()-----invoked");
		try {

			return new ModelAndView("");

		} catch (Exception e) {
			throw new ManageGroupControllerException("Exception occured in ManageGroupController" + e.getMessage());
		}

	}
}
*/