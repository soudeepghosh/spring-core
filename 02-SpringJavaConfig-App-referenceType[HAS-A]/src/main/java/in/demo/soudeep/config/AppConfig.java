package in.demo.soudeep.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.demo.soudeep.bean.WishMessageGenerator;


@Configuration
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	@Bean(name = "wmg")
	public WishMessageGenerator wmgObj() {
		System.out.println("AppConfig.wmgObj() :: creating the object...");
		
		//Create a Target Object
		WishMessageGenerator generator = new WishMessageGenerator();
		
		//Create a Dependent Object
		LocalDateTime ldt = LocalDateTime.now();
		
		//Linking the Object using Setter style
		generator.setLdt(ldt);
		
		return generator;
	}
}
