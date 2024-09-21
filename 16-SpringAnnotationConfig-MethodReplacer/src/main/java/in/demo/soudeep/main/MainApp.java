package in.demo.soudeep.main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.bean.Bank;
import in.demo.soudeep.config.AppConfig;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Bank bank = context.getBean("bank",Bank.class);
		double compoundInterest = bank.calculateCompoundInterest(10000, 3, 3);
		System.out.println(compoundInterest);
		
		((AbstractApplicationContext) context).close();
	}

}
