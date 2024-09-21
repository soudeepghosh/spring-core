package in.demo.soudeep.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.demo.soudeep.bean.Printer;
import in.demo.soudeep.bean.WishMessageGenerator;


@Configuration
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	@Bean(name = "wmg1")
	@Scope("prototype")
	public WishMessageGenerator wmgObj1() {
		System.out.println("AppConfig.wmgObj() :: creating the object...");
		
		//Create a Target Object
		WishMessageGenerator generator = new WishMessageGenerator();
		
		//Create a Dependent Object
		LocalDateTime ldt = LocalDateTime.now();
		
		//Linking the Object using Setter style
		generator.setLdt(ldt);
		
		return generator;
	}
	
	@Bean(name = "wmg2")
	@Scope("prototype")
	public WishMessageGenerator wmgObj2() {
		System.out.println("AppConfig.wmgObj() :: creating the object...");
		
		//Create a Target Object
		WishMessageGenerator generator = new WishMessageGenerator();
		
		//Create a Dependent Object
		LocalDateTime ldt = LocalDateTime.now();
		
		//Linking the Object using Setter style
		generator.setLdt(ldt);
		
		return generator;
	}
	
	@Bean(name = "p1")
	public Printer getPrinterObj1() {
		return Printer.getInstance();
	}
	
	@Bean(name = "p2")
	public Printer getPrinterObj2() {
		return Printer.getInstance();
	}
}
