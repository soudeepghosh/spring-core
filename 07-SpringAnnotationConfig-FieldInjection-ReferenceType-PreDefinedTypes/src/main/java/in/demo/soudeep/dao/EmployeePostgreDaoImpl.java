package in.demo.soudeep.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "postgreDao")
public class EmployeePostgreDaoImpl implements IEmployeeDao {
	@Autowired
	private DataSource postgreDs;
	
	@Override
	public void performDbOperation() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = postgreDs.getConnection();
			if (connection != null) {
				statement = connection.createStatement();
			}
			if (statement != null) {
				resultSet = statement.executeQuery("SELECT * FROM player");
			}
			if(resultSet!=null) {
				System.out.println("==========================");
				System.out.println("DB Engine :: PostgreSQL");
				System.out.println("DB Name  :: Player");
				System.out.println("----------------------------------------------");
				System.out.println("ID\tNAME\tAGE\tTEAM");
				System.out.println("==========================");
				while(resultSet.next()) {
					System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t"
							+ resultSet.getString(3) + "\t" + resultSet.getString(4));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
