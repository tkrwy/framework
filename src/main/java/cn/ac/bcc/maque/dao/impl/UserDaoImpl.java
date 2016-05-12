package cn.ac.bcc.maque.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.ac.bcc.maque.dao.UserDao;
import cn.ac.bcc.maque.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
		
	private Session currentSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	@Override
	public User load(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public User get(String id) {
		return (User) currentSession().get(User.class,id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<User> findAll() {
		List<User> users = currentSession().createQuery("from User user").list();
		return users;
	}

	@Override
	public void persist(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public String save(User entity) {
		return (String) currentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		currentSession().delete(currentSession().get(User.class, id));
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	 
   

}
