package in.demo.soudeep.main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.beans.Flipkart;
import in.demo.soudeep.beans.ICourier;
import in.demo.soudeep.config.AppConfig;

public class MainApp {
	
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart);
		
		Flipkart f1 = context.getBean("flipkart", Flipkart.class);
		ICourier courier1 = f1.getCourier();
		System.out.println("courier :: "+courier1);
		System.out.println(f1);

		System.in.read();

		Flipkart f2 = context.getBean("flipkart", Flipkart.class);
		ICourier courier2 = f2.getCourier();
		System.out.println("Courier :: "+courier2);
		System.out.println(f2);
		((AbstractApplicationContext) context).close();
	}

}
