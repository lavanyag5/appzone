/*package com.xworkz.appzone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.appzone.dto.MapEnvironmentDTO;
import com.xworkz.appzone.exception.mapenvironment.MapEnvironmentControllerException;
import com.xworkz.appzone.service.mapenvironment.MapEnvironmentService;

@Controller
@RequestMapping("*.do")
public class MapEnvironmentController {

	@Autowired
	private MapEnvironmentService service;

	public static final Logger logger = LoggerFactory.getLogger(MapEnvironmentController.class);

	public MapEnvironmentController() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	@RequestMapping(value = "mapenvironment.do")
	public void mapEnvironment(MapEnvironmentDTO dto) throws MapEnvironmentControllerException {
		logger.info("MapEnvironmentController-->  mapEnvironment()-----invoked");
		try {

		} catch (Exception e) {
			throw new MapEnvironmentControllerException(
					"Exception occurred in MapEnvironmentController" + e.getMessage());
		}

	}
}*/