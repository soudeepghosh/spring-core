package in.demo.soudeep.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

//	@Autowired
//	@Qualifier(value = "DTDC")
	@Value("#{blueDart}")
	private ICourier courier;

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}
	
}
