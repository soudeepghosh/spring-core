package in.demo.soudeep.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.demo.soudeep.config.AppConfig;
import in.demo.soudeep.dao.EmployeeMySQLDaoImpl;
import in.demo.soudeep.dao.EmployeePostgreDaoImpl;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeMySQLDaoImpl empMysqlDao = context.getBean("mysqlDao", EmployeeMySQLDaoImpl.class);
		empMysqlDao.performDbOperation();
		System.out.println("\n***********************************\n");
		EmployeePostgreDaoImpl postgreDaoImpl = context.getBean("postgreDao", EmployeePostgreDaoImpl.class);
		postgreDaoImpl.performDbOperation();
		((AbstractApplicationContext) context).close();
	}

}
