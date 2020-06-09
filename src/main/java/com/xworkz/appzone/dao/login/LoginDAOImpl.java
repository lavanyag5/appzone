package com.xworkz.appzone.dao.login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.appzone.entity.LoginEntity;
import com.xworkz.appzone.exception.login.LoginDAOException;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SessionFactory factory;

	private static final Logger logger = LoggerFactory.getLogger(LoginDAOImpl.class);

	public LoginDAOImpl() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	public LoginEntity loginDao(LoginEntity entity) throws LoginDAOException {
		logger.info("LoginDAOImpl--> loginDao() invoked " + entity);
		try (Session session = factory.openSession()) {
			String sql = "from LoginEntity where username=:un and password=:pass";
			Query query = session.createQuery(sql);
			query.setParameter("un", entity.getUsername());
			query.setParameter("pass", entity.getPassword());
			LoginEntity entityFromDb = (LoginEntity) query.uniqueResult();
			System.out.println(entityFromDb);
			return entityFromDb;
		} catch (Exception e) {
			throw new LoginDAOException("Exception occurred in LoginDAOImpl" + e.getMessage());
		}
	}

}
