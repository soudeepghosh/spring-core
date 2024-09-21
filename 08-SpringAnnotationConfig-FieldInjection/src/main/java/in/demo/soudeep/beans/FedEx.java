package in.demo.soudeep.beans;

import org.springframework.stereotype.Component;

@Component
public class FedEx implements ICourier {

	static {
		System.out.println("FedEx.class file is loading..");
	}

	public FedEx() {
		System.out.println("FedEx object created...");
	}
	
	@Override
	public String deliver(Integer oid) {
		return  "OrderId : "+oid + ", Delivering using FedEx";
	}

}