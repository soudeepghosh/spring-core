package in.demo.soudeep.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
	
	@Autowired
	@Qualifier(value = "ekart")
	private ICourier courier;
	
	static {
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart object is created...");
	}

	public String shopping(String[] items, float[] prices) {
		System.out.println("Flipkart.shopping()");
		float billAmount = 0.0f;
		for(float price: prices) {
			billAmount += price;
		}
		
//		String msg = courier.deliver(new Random().nextInt(9999));
		String msg = courier.deliver(Integer.parseInt( String.format("%04d", new Random().nextInt(10000)))); // Generating random 4digit orderid
		
		return "Products "+Arrays.toString(items)+" with prices "+ Arrays.toString(prices)+" having bill amount of "+billAmount+", with " + msg;
	}
}
