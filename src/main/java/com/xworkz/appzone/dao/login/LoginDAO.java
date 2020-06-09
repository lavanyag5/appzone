package com.xworkz.appzone.dao.login;

import com.xworkz.appzone.entity.LoginEntity;
import com.xworkz.appzone.exception.login.LoginDAOException;

public interface LoginDAO {

	public LoginEntity loginDao(LoginEntity entity) throws LoginDAOException;
}
