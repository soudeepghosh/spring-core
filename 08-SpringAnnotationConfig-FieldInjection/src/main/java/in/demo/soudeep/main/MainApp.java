package in.demo.soudeep.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.beans.Flipkart;
import in.demo.soudeep.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		String orderStatus = flipkart.shopping(new String[]{"Lenovo Ideapad S340","Realme Narzo 60 5G", "Firebolt Crusader"}, new float[]{63500.0f,14999.0f,1110.0f});
		System.out.println(orderStatus);
		((AbstractApplicationContext) context).close();
	}

}
