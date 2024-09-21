package in.demo.soudeep.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "in.demo.soudeep")
@PropertySource("application.properties")
public class AppConfig {
	
	@Autowired
	private Environment environment;
	
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	@Bean(name="mysqlDs")
	public DataSource getMySqlDataSource() {
		System.out.println("Implementation Class is :: "+ environment.getClass().getName());
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("db.mysql.url"));
		dataSource.setUsername(environment.getProperty("db.mysql.username"));
		dataSource.setPassword(environment.getProperty("db.mysql.password"));
		return dataSource;
	}
	
	@Bean(name="postgreDs")
	public DataSource getPostgreDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("db.postgre.url"));
		dataSource.setUsername(environment.getProperty("db.postgre.username"));
		dataSource.setPassword(environment.getProperty("db.postgre.password"));
		return dataSource;
	}
	
}
