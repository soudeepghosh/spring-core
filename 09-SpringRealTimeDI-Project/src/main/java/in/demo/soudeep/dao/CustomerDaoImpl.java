package in.demo.soudeep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.demo.soudeep.beans.CustomerBo;

@Component(value = "dao")
public final class CustomerDaoImpl implements ICustomerDao {

	private static final String SQL_INSERT_QUERY = "INSERT INTO customer(`cname`,`caddr`,`pamt`,`rate`,`time`,`si`) VALUES(?,?,?,?,?,?)";
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public int insert(CustomerBo customer) throws Exception {
		int rowAffected = 0;
		try(Connection connection = dataSource.getConnection()) {
			PreparedStatement prepareStatement = connection.prepareStatement(SQL_INSERT_QUERY);
			prepareStatement.setString(1, customer.getCname());
			prepareStatement.setString(2, customer.getCaddr());
			prepareStatement.setFloat(3, customer.getPamt());
			prepareStatement.setFloat(4, customer.getRate());
			prepareStatement.setFloat(5, customer.getTime());
			prepareStatement.setFloat(6, customer.getSi());
			rowAffected = prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return rowAffected;
	}

}
