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
import com.xworkz.appzone.dto.CreateGroupDTO;
import com.xworkz.appzone.dto.GroupDTO;
import com.xworkz.appzone.dto.LoginDTO;
import com.xworkz.appzone.dto.UserDTO;
import com.xworkz.appzone.exception.creategroup.CreateGroupControllerException;
import com.xworkz.appzone.service.creategroup.CreateGroupServiceImpl;

@Controller
@RequestMapping("*.do")
public class CreateGroupController {

	@Autowired
	private CreateGroupServiceImpl service;

	public static final Logger logger = LoggerFactory.getLogger(CreateGroupController.class);

	public CreateGroupController() {
		logger.info(this.getClass().getSimpleName() + " \t Created");

	}

	@RequestMapping(value = "creategroup.do", method = RequestMethod.GET)
	public ModelAndView createGroup(HttpServletRequest req) throws CreateGroupControllerException {
		logger.info("CreateGroupController-->createGroup()-----invoked");
		try {
			HttpSession session = req.getSession(false);
			LoginDTO dto = (LoginDTO) session.getAttribute("user");
			return new ModelAndView(ApplicationConstants.CREATEGROUP, StringConstants.USER, dto);

		} catch (Exception e) {
			throw new CreateGroupControllerException("Exception occurred in CreateGroupController " + e.getMessage());
		}
	}

	@RequestMapping(value = "creategroupform.do", method = RequestMethod.GET)
	public ModelAndView createGroupinDB(CreateGroupDTO dto, HttpServletRequest req)
			throws CreateGroupControllerException {
		logger.info("CreateGroupController-->createGroupinDB()-----invoked");
		try {
			System.out.println(dto.getGroupName());
			GroupDTO dtoFromDb = service.createGroupService(dto);
			if (dtoFromDb == null)
				return new ModelAndView(ApplicationConstants.CREATEGROUP, StringConstants.GROUP,
						StringConstants.GROUP_SUCCESS_MESSAGE);
			else
				return new ModelAndView(ApplicationConstants.CREATEGROUP, StringConstants.GROUP,
						StringConstants.GROUP_FAILURE_MESSAGE);
		} catch (Exception e) {
			throw new CreateGroupControllerException("Exception occurred in CreateGroupController " + e.getMessage());
		}
	}

}
