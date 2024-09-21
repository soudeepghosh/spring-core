package in.demo.soudeep.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public interface ICricketer {
	@Lookup
	public abstract CricketBat getCricketBatObj();
	
	default public void fielding() {
		System.out.println("Cricketer is doing fielding...");
	}
	
	default public void bowling() {
		System.out.println("Cricketer is doing bowling...");
	}
	
	default public void wicketkeeping() {
		System.out.println("Cricketer is doing wicketkeeping...");
	}
	
	default public void batting() {
		System.out.println("Cricketer.batting() :: Cricketer is doing batting...");
		
		// Performing Dependency Lookup to get the CricketBat object
		CricketBat bat = getCricketBatObj();
		int runs = bat.scoreRuns();
		System.out.println("Cricketer is doing batting and his current score is :: " + runs);
	}
}
