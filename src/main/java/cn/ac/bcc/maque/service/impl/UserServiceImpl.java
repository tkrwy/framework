package cn.ac.bcc.maque.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ac.bcc.maque.dao.UserDao;
import cn.ac.bcc.maque.model.User;
import cn.ac.bcc.maque.service.UserService;

@Service("userService") 
public class UserServiceImpl implements UserService {

	@Autowired  
	private UserDao userDao;  
	
	@Override
	public User load(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String id) {
		return userDao.get(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void persist(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public String save(User entity) {
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		userDao.delete(id);

	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

}
