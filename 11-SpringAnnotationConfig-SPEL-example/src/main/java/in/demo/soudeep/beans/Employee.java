package in.demo.soudeep.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Employee.class file is loading...");
	}

	public Employee() {
		System.out.println("Employee Object created :: Zero param...");
	}
	
	@Value("#{new java.util.Random().nextInt(100)}")
	private Integer id;
	
	@Value("${info.emp.name}")
	private String name;
	
	@Value("${info.emp.age}")
	private Float age;
	
	@Value("#{'${info.emp.friends}'.split(',')}")
	private List<String> friends;
	
	@Value("${info.emp.phonenumbers}")
	private Set<String> phoneNumbers;
	
	@Value("#{${info.emp.bankaccount}}")
	private Map<String, String> bankAccount;
	
	@Value("#{6<12 ? 7000 : 3000}")
	private Float salary;
	
	@Value("#{T(java.time.LocalDate).of(2003,03,07)}")		
	private LocalDate dob;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ",\nfriends=" + friends + ",\nphoneNumbers="
				+ phoneNumbers + ",\nbankAccount=" + bankAccount + ", \nsalary=" + salary + ", dob=" + dob + "]";
	}
	
}
