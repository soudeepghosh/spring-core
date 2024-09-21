package in.demo.soudeep.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.bean.Employee;
import in.demo.soudeep.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// ask the container to give the bean with the id as specified
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
		
		// close the container
		((AbstractApplicationContext) context).close();
	}

}
