package in.demo.soudeep.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.beans.Employee;
import in.demo.soudeep.config.AppConfig;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
		((AbstractApplicationContext) context).close();
	}

}
