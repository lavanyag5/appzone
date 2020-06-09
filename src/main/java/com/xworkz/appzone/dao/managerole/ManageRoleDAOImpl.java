/*package com.xworkz.appzone.dao.managerole;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.appzone.dto.LoginDTO;
import com.xworkz.appzone.dto.ManageRoleDTO;
import com.xworkz.appzone.entity.LoginEntity;
import com.xworkz.appzone.exception.managerole.ManageRoleDAOException;

@Repository
public class ManageRoleDAOImpl implements ManageRoleDAO {

	@Autowired
	private SessionFactory factory;

	public static final Logger logger = LoggerFactory.getLogger(ManageRoleDAOImpl.class);

	@Override
	public void manageRoleDAO(ManageRoleDTO dto) throws ManageRoleDAOException {
		logger.info("manageRoleDAO() invoked");
		try {

			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			String sql1 = "from LoginEntity where userName=:unand groupName=:(select gid from CreateGroupEntity where group=:name)";
			Query query1 = session.createQuery(sql1);

			query1.setParameter("un", dto.getUserName());
			query1.setParameter("name", dto.getGroupName()); // doubt
			LoginEntity entity = (LoginEntity) query1.uniqueResult();
			if (entity != null) {
				String sql2 = "update LoginEntity set userType=:role where userName==:user and groupName=:gname";
				Query query2 = session.createQuery(sql2);
				query2.setParameter("role", dto.getRole());
				query2.setParameter("user", dto.getUserName());
				query2.setParameter("gname", dto.getGroupName());
				query2.executeUpdate();
				tx.commit();
			}
		} catch (Exception e) {
			throw new ManageRoleDAOException("Exception occurred in ManageRoleDAOImpl " + e.getMessage());
		}
	}
}
*/