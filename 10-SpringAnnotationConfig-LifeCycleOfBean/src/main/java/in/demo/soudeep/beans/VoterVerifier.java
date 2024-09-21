package in.demo.soudeep.beans;

import java.time.LocalDate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "voter")
@PropertySource("application.properties")
public class VoterVerifier {
	
	@Value("${info.voter.name}")
	private String name;
	
	@Value("${info.voter.age}")
	private Integer age;
	private LocalDate date;
	
	static {
		System.out.println("VoterVerifier.class file is loading...");
	}

	public VoterVerifier() {
		System.out.println("VoterVerifier :: Object instantiated...");
	}
	
	//Initialization method
	@PostConstruct
	public void myInit() {
		System.out.println("Initialization :: VoterVerfier.myInit()");
		
		date = LocalDate.now();
		
		if(name == null || age < 0) {
			throw new IllegalArgumentException("invalid inputs are provided for name and age properties");
		}
	}
	
	//B.L.
	public String checkVotingEligibility() {
		if (age >= 18)
			return "Mr/Mrs/Miss :: " + name + " u r eligible for voting , your age "+age+" y on Date :: " + date;
		else
			return "Mr/Mrs/Miss :: " + name + "u r not eligible for voting wait " + (18 - age)
					+ " years to cast your vote. Date :: " + date;
	}
	
	//Destruction method
	@PreDestroy
	public void myDestroy() {
		System.out.println("Destruction :: VoterVerfier.myDestory()");
		// nullifying the values of instance variables
		name = null;
		age = null;
		date = null;
	}
}
