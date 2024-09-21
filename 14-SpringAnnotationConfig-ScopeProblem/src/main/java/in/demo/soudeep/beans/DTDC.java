package in.demo.soudeep.beans;

import org.springframework.stereotype.Component;

@Component //(value = "courier")
public class DTDC implements ICourier {

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
