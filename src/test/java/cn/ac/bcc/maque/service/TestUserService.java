package cn.ac.bcc.maque.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.ac.bcc.maque.model.User;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-hibernate.xml"})  
public class TestUserService {
	private static final Logger LOGGER = Logger  
            .getLogger(TestUserService.class);  
  
    @Autowired  
    private UserService userService;  
    
    @Test
    public void save(){
    	User user = new User();
    	user.setId(UUID.randomUUID().toString());
    	user.setName("ada");
    	user.setSignupDate(new Date());
    	String id = userService.save(user);
    	LOGGER.info(JSON.toJSON(id));
    }
    
    @Test
    public void findAll(){
    	List<User> users = userService.findAll();
    	for(User u:users){
    			LOGGER.info(u.getId()+"\t"+u.getName()+"\t"+u.getSignupDate());
    	}
    }
}
