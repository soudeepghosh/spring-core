package in.demo.soudeep.beans;

import org.springframework.stereotype.Component;

@Component
public class Ekart implements ICourier {

	static {
		System.out.println("Ekart.class file is loading..");
	}

	public Ekart() {
		System.out.println("Ekart object created...");
	}
	
	@Override
	public String deliver(Integer oid) {
		return  "OrderId : "+oid + ", Delivering using Ekart";
	}

}
