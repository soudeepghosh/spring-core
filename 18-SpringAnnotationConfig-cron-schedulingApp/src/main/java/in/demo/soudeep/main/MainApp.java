package in.demo.soudeep.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.config.AppConfig;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Container started on :: "+ new Date());
		
//		((AbstractApplicationContext) context).close();
	}

}
