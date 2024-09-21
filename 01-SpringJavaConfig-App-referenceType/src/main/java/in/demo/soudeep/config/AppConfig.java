package in.demo.soudeep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.demo.soudeep.bean.Employee;

@Configuration
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	@Bean(name = "emp")
	public Employee empObj() {
		System.out.println("AppConfig.empObj() :: creating the object...");
		
		// created object using zero param constructor
		Employee employee = new Employee();
		
		// injecting values through setters
		employee.setEid(93);
		employee.setEname("Bumrah");
		employee.setEage(30);
		employee.setEaddress("Gujrat");
		return employee;
	}
}
