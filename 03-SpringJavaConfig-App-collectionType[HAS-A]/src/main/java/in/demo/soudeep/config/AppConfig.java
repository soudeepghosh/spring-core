package in.demo.soudeep.config;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		// Creating Dependent object
		List<String> list = List.of("Jasprit", "Rohit", "Tilak");
		Set<String> set = Set.of("1234567890", "0987456321");
		Map<String,String> map = Map.of("SBI", "33445566", "HDFC", "77889933");
		
		// Creating Target object
		Employee employee = new Employee(93, 19747f, list, set, map);
		
		return employee;
	}
}
