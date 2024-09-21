package in.demo.soudeep.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class FedEx implements ICourier {

	static {
		System.out.println("FedEx.class file is loading..()");
	}

	public FedEx() {
		System.out.println("FedEx:: Zero param constructor... " + this.hashCode());
	}
	@Override
	public String deliverOrder(Integer oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "FedEx []";
	}

}
