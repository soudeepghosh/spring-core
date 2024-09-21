package in.demo.soudeep.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

	static {
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart object is created..." + this.hashCode());
	}

//	@Autowired
//	@Qualifier(value = "DTDC")
	@Value("#{blueDart}")
	private ICourier courier;

	public ICourier getCourier() {
		courier = getICourierObj();
		return courier;
	}

	
	
	// LMI technique :: Lookup Method Injection
	@Lookup(value = "fedEx")
	public ICourier getICourierObj() {
		return null;
	}

	@Override
	public String toString() {
		return "Flipkart "+this.hashCode()+"[courier=" + courier.hashCode() + "]";
	}
	
}
