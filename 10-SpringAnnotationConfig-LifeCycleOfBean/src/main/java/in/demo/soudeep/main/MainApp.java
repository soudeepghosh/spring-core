package in.demo.soudeep.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.beans.VoterVerifier;
import in.demo.soudeep.config.AppConfig;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		VoterVerifier bean = context.getBean("voter", VoterVerifier.class);
		String msg = bean.checkVotingEligibility();
		System.out.println(msg);
		((AbstractApplicationContext) context).close();
	}

}
