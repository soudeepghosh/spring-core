package in.demo.soudeep.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "in.demo.soudeep")
@ImportResource(locations = "in/demo/soudeep/cfgs/applicationContext.xml")
public class AppConfig {
	
}
