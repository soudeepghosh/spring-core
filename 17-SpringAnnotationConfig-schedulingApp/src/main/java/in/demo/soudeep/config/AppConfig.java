package in.demo.soudeep.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "in.demo.soudeep")
@EnableScheduling
public class AppConfig {
	
}
