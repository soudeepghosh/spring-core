package in.demo.soudeep.main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.bean.ICricketer;
import in.demo.soudeep.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		// Working with bean created by IOC
		ICricketer cricketer = context.getBean(ICricketer.class);
		cricketer.fielding();
		cricketer.bowling();
		cricketer.wicketkeeping();
		cricketer.batting();
		System.out.println("===============================");
		System.out.println("Implementation class object is :: "+cricketer.getClass().getName());
		System.out.println("Parent class object is :: "+cricketer.getClass().getSuperclass());
		System.out.println("Method present in that class :: "+Arrays.toString(cricketer.getClass().getDeclaredMethods()));
		
		// close the container
		((AbstractApplicationContext) context).close();
	}

}
