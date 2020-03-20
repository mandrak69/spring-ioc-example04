package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import dao.UserDao;
import dao.impl.UserArrayListDao;
import dao.impl.UserLinkedListDao;
import domain.User;
import main.Main;
import service.UserService;
import service.impl.UserServiceImpl;

//TODO: chnage use component scan

@Configuration
@ComponentScan({"dao.impl","service","domain"})

public class MyConfig {
	@Bean (name = "main")
	public Main getMain() {
		return new Main();
	}
	
	
	
}
