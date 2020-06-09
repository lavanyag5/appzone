package com.xworkz.appzone.service.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.dao.login.LoginDAO;
import com.xworkz.appzone.dto.LoginDTO;
import com.xworkz.appzone.entity.LoginEntity;
import com.xworkz.appzone.exception.login.LoginServiceException;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao;

	public static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	public LoginServiceImpl() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	public LoginDTO loginService(LoginDTO dto) throws LoginServiceException {
		logger.info("LoginServiceImpl-->  loginService()-----invoked " + dto);
		try {
			LoginEntity entity = new LoginEntity();
			BeanUtils.copyProperties(dto, entity);
			LoginEntity entityFromDb = dao.loginDao(entity);
			LoginDTO dtoToCtlr = new LoginDTO();
			BeanUtils.copyProperties(entityFromDb, dtoToCtlr);
			System.out.println("data from in service" + dtoToCtlr);
			return dtoToCtlr;
		} catch (Exception e) {
			throw new LoginServiceException("Exception occurred in LoginServiceImpl" + e.getMessage());
		}

	}

}
