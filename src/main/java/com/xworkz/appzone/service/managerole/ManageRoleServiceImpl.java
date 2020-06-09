/*package com.xworkz.appzone.service.managerole;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.dao.managerole.ManageRoleDAOImpl;
import com.xworkz.appzone.dto.ManageRoleDTO;
import com.xworkz.appzone.exception.managerole.ManageRoleServiceException;


@Service
public class ManageRoleServiceImpl implements ManageRoleService {

	@Autowired
	private ManageRoleDAOImpl dao;

	public static final Logger logger = LoggerFactory.getLogger(ManageRoleServiceImpl.class);

	public ManageRoleServiceImpl() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}
	
	public void manageRoleService(ManageRoleDTO dto) throws ManageRoleServiceException {
		logger.info("ManageRoleServiceImpl-->  manageRoleService()-----invoked");
		try {
			dao.manageRoleDAO(dto);
		} catch (Exception e) {
			throw new ManageRoleServiceException("Exception occurred in ManageRoleServiceImpl "+e.getMessage());
		}
	}

}
*/