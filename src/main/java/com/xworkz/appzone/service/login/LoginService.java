package com.xworkz.appzone.service.login;

import com.xworkz.appzone.dto.LoginDTO;
import com.xworkz.appzone.exception.login.LoginServiceException;

public interface LoginService {

	public LoginDTO loginService(LoginDTO dto) throws LoginServiceException;

}
