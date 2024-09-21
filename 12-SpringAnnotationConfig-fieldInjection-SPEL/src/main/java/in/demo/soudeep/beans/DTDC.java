package in.demo.soudeep.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //(value = "courier")
@Scope("prototype")
public class DTDC implements ICourier {

	static {
		System.out.println("DTDC.class file is loading..()");
	}

	public DTDC() {
		System.out.println("DTDC:: Zero param constructor... " + this.hashCode());
	}
	
	@Override
	public String deliverOrder(Integer oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "DTDC []";
	}

}
