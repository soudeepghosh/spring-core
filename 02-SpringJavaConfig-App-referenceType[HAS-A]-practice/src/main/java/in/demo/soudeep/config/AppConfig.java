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
		System.out.println("AppConfig Object is created :: Zero Param Constructor...");
	}
	
	@Bean(name="wmg")
	public WishMessageGenerator wmgObj() {
		System.out.println("AppConfig.wmgObj():: method called...");
		
//		// Create a Target object
//		WishMessageGenerator wmg = new WishMessageGenerator();
//		
//		// Create a Dependent Object
//		LocalDateTime ldt = LocalDateTime.now();
//		// setting value through setter
//		wmg.setLdt(ldt);
		
		WishMessageGenerator wmg = new WishMessageGenerator(LocalDateTime.now());
		
		return wmg;
	}
}
