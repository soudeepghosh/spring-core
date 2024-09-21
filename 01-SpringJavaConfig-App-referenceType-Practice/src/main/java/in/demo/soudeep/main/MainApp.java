package in.demo.soudeep.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.bean.Student;
import in.demo.soudeep.config.AppConfig;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = context.getBean("stud", Student.class);
		
		System.out.println(student);
		
		((AbstractApplicationContext) context).close();
	}
}
