package in.demo.soudeep.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.bean.Flipkart;
import in.demo.soudeep.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(String beanName : beanDefinitionNames) {
			System.out.println(beanName);
		}
		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart);
		((AbstractApplicationContext) context).close();
		
	}

}
