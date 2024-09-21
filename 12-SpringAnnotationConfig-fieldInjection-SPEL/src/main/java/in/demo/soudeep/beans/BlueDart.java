package in.demo.soudeep.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BlueDart implements ICourier {

	static {
		System.out.println("BlueDart.class file is loading..()");
	}

	public BlueDart() {
		System.out.println("DTDC:: Zero param constructor... " + this.hashCode());
	}
	
	@Override
	public String deliverOrder(Integer oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "BlueDart []";
	}

}
