package in.demo.soudeep.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FedEx implements ICourier {

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
