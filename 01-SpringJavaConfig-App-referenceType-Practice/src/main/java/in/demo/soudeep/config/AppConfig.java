package in.demo.soudeep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.demo.soudeep.bean.Student;

@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	@Bean(name="stud")
	public Student stdObj() {
		System.out.println("AppConfig.stdObj():: creating the object...");
		Student student = new Student();
		student.setSid(93);
		student.setSname("Soudeep");
		student.setSage(21);
		student.setSaddress("IND");
		return student;
	}
}
