package in.demo.soudeep.main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.beans.Flipkart;
import in.demo.soudeep.config.AppConfig;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart);
		
		((AbstractApplicationContext) context).close();
	}

}
