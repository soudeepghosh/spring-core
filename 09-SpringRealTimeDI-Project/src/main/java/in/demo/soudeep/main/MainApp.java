package in.demo.soudeep.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.beans.CustomerVo;
import in.demo.soudeep.config.AppConfig;
import in.demo.soudeep.controller.CustomerControllerImpl;
import in.demo.soudeep.controller.ICustomerController;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Reading inputs from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the customerName :: ");
		String name = scanner.next();

		System.out.print("Enter the customerAddress :: ");
		String address = scanner.next();

		System.out.print("Enter the Principal Amount :: ");
		String pamt = scanner.next();

		System.out.print("Enter the rate of interest :: ");
		String rate = scanner.next();

		System.out.print("Enter the time period (in year) :: ");
		String time = scanner.next();
		
		try {
			
			CustomerVo customer = new CustomerVo();
			customer.setCname(name);
			customer.setCaddr(address);
			customer.setPamt(pamt);
			customer.setRate(rate);
			customer.setTime(time);
			
			ICustomerController controller = context.getBean("controller", CustomerControllerImpl.class);
			String msg = controller.processCustomer(customer);
			System.out.println(msg);
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some internal problem occured ---> Try again :: " + e.getMessage());
		}
		
		((AbstractApplicationContext) context).close();
		scanner.close();
	}

}
