package in.demo.soudeep.bean;

import java.time.LocalDateTime;

//UserDefined type
public class WishMessageGenerator {
	
		static {
			System.out.println("WishMessageGenerator.class file is loading...");
		}
		
		public WishMessageGenerator() {
			System.out.println("WishMessageGenerator object is created using Zero Param Constructor...");
		}
		
		public WishMessageGenerator(LocalDateTime ldt) {
			System.out.println("WishMessageGenerator object is created using Parameterized Constructor...");
			this.ldt = ldt;
			System.out.println("Value injected through Parameterized Constructor...");
		}
		
		// HAS-A [Inbuilt type]	
		private LocalDateTime ldt;
		
		public LocalDateTime getLdt() {
			return ldt;
		}

		public void setLdt(LocalDateTime ldt) {
			System.out.println("Value injected through setter...");
			this.ldt = ldt;
		}
		

		@Override
		public String toString() {
			return "WishMessageGenerator [ldt=" + ldt + "]";
		}

		// Method
		public String wishMessage(String user) {
			int hour = ldt.getHour();
			String msg = "";
			
			if(hour<12) {
				msg += "Good Morning";
			} else if(hour<16) {
				msg += "Good Afternoon";
			} else if(hour<20){
				msg += "Good Evening";
			} else {
				msg += "Good Night";
			}
			
			return msg + " :: " + user;
		}
}
