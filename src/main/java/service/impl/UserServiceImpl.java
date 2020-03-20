package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import config.SAVE_TYPE;
import dao.UserDao;
import domain.User;
import service.UserService;
@Component (value = "userService")

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userArrayListDao;
	@Autowired
	private UserDao userLinkedListDao;
	
	public UserServiceImpl() {
		
	}
	public void save(User user, SAVE_TYPE st) {
		if(st.equals(SAVE_TYPE.ARRAY)) {
			userArrayListDao.save(user);
			
		}
		else if(st.equals(SAVE_TYPE.ARRAY)) {
			userLinkedListDao.save(user);
		}
		
	}

	public void print() {
		userArrayListDao.print();
	}
	
	
}
