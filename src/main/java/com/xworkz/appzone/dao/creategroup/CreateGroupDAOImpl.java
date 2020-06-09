/*package com.xworkz.appzone.dao.creategroup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.appzone.entity.CreateGroupEntity;
import com.xworkz.appzone.exception.creategroup.CreateGroupDAOException;

@Repository
public class CreateGroupDAOImpl implements CreateGroupDAO {

	@Autowired
	private SessionFactory factory;

	public static final Logger logger = LoggerFactory.getLogger(CreateGroupDAOImpl.class);

	public CreateGroupDAOImpl() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	@Override
	public void createGroupDao(CreateGroupEntity entity) throws CreateGroupDAOException   {
		logger.info("CreateGroupDAOImpl-->  createGroupDao()-----invoked");
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();

			System.out.println("elements in entity" + entity);
			session.save(entity);
			tx.commit();
		} catch (Exception e) {
			logger.info("Exception occurred in CreateGroupDAOImpl" + e.getMessage());
			  throw new CreateGroupDAOException("Exception occurred in CreateGroupDAOImpl "+e.getMessage());
			
		}

	}

}
*/