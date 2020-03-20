package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyConfig;
import config.SAVE_TYPE;
import domain.User;
import service.UserService;
//TOOD: koristite anotaciju @Autowired za userService....



public class Main {

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		//kreirairati kontejner
		BeanFactory container = new AnnotationConfigApplicationContext(MyConfig.class);
		//iz kontejnera uzeti main objekat
		Main main = container.getBean("main", Main.class);
		
		//dohvatim user i posatavim vrednosti....
		User user1 = container.getBean("user", User.class);
		user1.setFirstname("Pera-1");
		user1.setLastname("Peric-1");
		user1.setUsername("pera");
		user1.setPassword("pera");
		System.out.println(user1);
		//pozvati metodu: void addUser(User user)
		main.userService.save(user1,SAVE_TYPE.ARRAY);
		
		
		User user2 = container.getBean("user", User.class);
		user2.setFirstname("Pera-2");
		user2.setLastname("Peric-2");
		user2.setUsername("pera");
		user2.setPassword("pera");
		System.out.println(user2);
		//pozvati metodu: void addUser(User user)
		main.userService.save(user1,SAVE_TYPE.LINKED_LIST);
		
		
		//pozovem metodu: void printUsers()
		main.userService.print();
	}
	
	
	
	

}
