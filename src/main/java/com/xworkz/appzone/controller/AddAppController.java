/*package com.xworkz.appzone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.appzone.dto.AddAppDTO;
import com.xworkz.appzone.exception.addapp.AddAppControllerException;

@Controller
@RequestMapping("*.do")
public class AddAppController {

	public static final Logger logger = LoggerFactory.getLogger(AddAppController.class);

	public AddAppController() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	@RequestMapping(value = "addapp.do", method = RequestMethod.POST)
	public ModelAndView addApp(AddAppDTO dto) throws AddAppControllerException {
		logger.info("AddAppController-->addApp()----invoked");
		try {
			

		} catch (Exception e) {
			logger.info("Exception occured in AddAppController" + e.getMessage());
		}
		return null;
	}

}
*/