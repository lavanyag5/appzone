/*package com.xworkz.appzone.service.addapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.dto.AddAppDTO;
import com.xworkz.appzone.exception.addapp.AddAppServiceException;

@Service
public class AddAppServiceImpl implements AddAppService {

	public static final Logger logger = LoggerFactory.getLogger(AddAppServiceImpl.class);

	public AddAppServiceImpl() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	@Override
	public AddAppDTO appAppService(AddAppDTO dto) throws AddAppServiceException {
		logger.info("AddAppServiceImpl--> appAppService()-----invoked");
		try {

		} catch (Exception e) {
			logger.info("Exception occurred in AddAppServiceImpl " + e.getMessage());
		}
		return null;
	}

}
*/