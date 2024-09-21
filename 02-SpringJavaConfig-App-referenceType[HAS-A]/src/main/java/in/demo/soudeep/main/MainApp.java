package in.demo.soudeep.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.bean.WishMessageGenerator;
import in.demo.soudeep.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator wmg = context.getBean("wmg", WishMessageGenerator.class);
		String status = wmg.wishMessage("Dravid");
		System.out.println(status);
		
		// close the container
		((AbstractApplicationContext) context).close();
	}

}
