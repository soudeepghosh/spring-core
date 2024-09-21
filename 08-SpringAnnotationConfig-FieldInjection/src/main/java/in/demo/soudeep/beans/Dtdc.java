package in.demo.soudeep.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dtdc implements ICourier {
	
	static {
		System.out.println("Dtdc.class file is loading..");
	}

	public Dtdc() {
		System.out.println("Dtdc object created...");
	}
	
	@Override
	public String deliver(Integer oid) {
		return "OrderId : "+oid + ", Delivering using DTDC";
	}

}
