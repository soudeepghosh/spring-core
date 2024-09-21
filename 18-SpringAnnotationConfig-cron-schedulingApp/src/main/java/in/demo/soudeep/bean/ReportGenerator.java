package in.demo.soudeep.bean;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {
	@Scheduled(cron = "0/7 * * * * *")
	public void generateSalesReport() {
		System.out.println("Sales Report on :: "+ new Date());
	}
	
}
