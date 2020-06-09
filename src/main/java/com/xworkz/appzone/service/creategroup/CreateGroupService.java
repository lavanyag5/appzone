package com.xworkz.appzone.service.creategroup;

import com.xworkz.appzone.dto.CreateGroupDTO;
import com.xworkz.appzone.exception.creategroup.CreateGroupServiceException;

public interface CreateGroupService {

	public void createGroupService(CreateGroupDTO dto) throws CreateGroupServiceException;

}
