package com.xworkz.appzone.service.creategroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.appzone.dao.creategroup.CreateGroupDAO;
import com.xworkz.appzone.dto.CreateGroupDTO;
import com.xworkz.appzone.entity.CreateGroupEntity;
import com.xworkz.appzone.exception.creategroup.CreateGroupServiceException;
@Service
public class CreateGroupServiceImpl implements CreateGroupService {
@Autowired
	private CreateGroupDAO dao;
	public static final Logger logger = LoggerFactory.getLogger(CreateGroupServiceImpl.class);

	public CreateGroupServiceImpl() {
		logger.info(this.getClass().getSimpleName() + "\t created");
	}

	@Override
	public void createGroupService(CreateGroupDTO dto) throws CreateGroupServiceException {
		logger.info(" CreateGroupServiceImpl-->  createGroupService()-----invoked ");
		try {
			CreateGroupEntity entity = new CreateGroupEntity();
			BeanUtils.copyProperties(dto,entity);
			dao.createGroupDao(entity);
		} catch (Exception e) {
			logger.info("Exception occured in CreateGroupServiceImpl" + e.getMessage());
		}
}
