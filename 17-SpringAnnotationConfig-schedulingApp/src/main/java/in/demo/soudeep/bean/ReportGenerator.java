package in.demo.soudeep.bean;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {
	
//	@Scheduled(initialDelay = 2000, fixedDelay = 3000) //fixedDelay
	@Scheduled(initialDelay = 2000, fixedRate = 3000) //fixedRate
	public void generateSalesReport() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Sales Report on :: "+ new Date());
	}
	
}
