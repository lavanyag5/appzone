/*package com.xworkz.appzone.service.managegroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.dao.managegroup.ManageGroupDAO;
import com.xworkz.appzone.dto.ManageGroupDTO;
import com.xworkz.appzone.entity.ManageGroupEntity;
import com.xworkz.appzone.exception.managegroup.ManageGroupServiceException;

@Service
public class ManageGroupServiceImpl implements ManageGroupService {

	@Autowired
	private ManageGroupDAO dao;

	public static final Logger logger = LoggerFactory.getLogger(ManageGroupServiceImpl.class);

	@Override
	public void manageGroup(ManageGroupDTO dto) throws ManageGroupServiceException {
		logger.info("ManageGroupServiceImpl--> manageGroup()-----invoked");
		try {

			ManageGroupEntity entity = new ManageGroupEntity();
			BeanUtils.copyProperties(dto, entity);
			dao.manageGroupDao(entity);
			

		} catch (Exception e) {
			throw new ManageGroupServiceException("Exception occurred in ManageGroupServiceImpl " + e.getMessage());
		}

	}

}
*/