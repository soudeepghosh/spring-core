package in.demo.soudeep.bean;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component(value = "bat")
public class CricketBat {
	static {
		System.out.println("CricketBat.class file is loading..");
	}

	public CricketBat() {
		System.out.println("CricketBat Object is created...");
	}
	
	// B.L
	public int scoreRuns() {
		System.out.println("CricketBat.scoreRuns() :: method invoked...");
		return new Random().nextInt(265);
	}
}
