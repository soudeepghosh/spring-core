package in.demo.soudeep.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.demo.soudeep")
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	@Bean(name = "ldt")
	public LocalDateTime ldtObj() {
		System.out.println("AppConfig.ldtObj() :: method called...");
		return LocalDateTime.now();
	}
	
}
