package service;

import config.SAVE_TYPE;
import domain.User;

public interface UserService {
	void save (User user,SAVE_TYPE st);

	void print();
}
