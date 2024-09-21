package in.demo.soudeep.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class WishMessageGenerator {

	
	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object created using zero param...");
	}
	
	// HAS-A[Inbuilt type]
	@Autowired
	private LocalDateTime date;
	
	// Method
	public String wishMessage(String username) {
		
		System.out.println("WishMessageGenerator.wishMessage()");
		
		int hour = date.getHour();
		String msg = "";
		if(hour<12) {
			msg += "Good Morning";
		} else if(hour<16) {
			msg += "Good Afternooon";
		} else if(hour<20) {
			msg += "Good Evening";
		} else {
			msg += "Good Night";
		}
		return msg + " :: " + username;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	
	
}
