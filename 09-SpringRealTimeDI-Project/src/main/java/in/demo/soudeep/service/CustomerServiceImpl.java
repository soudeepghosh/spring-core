package in.demo.soudeep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.demo.soudeep.beans.CustomerBo;
import in.demo.soudeep.beans.CustomerDto;
import in.demo.soudeep.dao.CustomerDaoImpl;

@Component(value = "service")
public final class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private CustomerDaoImpl dao;
	@Override
	public String calculateSimpleInterest(CustomerDto dto) throws Exception {
		// Simple Interest Calculation
		Float si = (dto.getPamt()*dto.getRate()*dto.getTime())/100;
		
		CustomerBo bo = new CustomerBo();
		bo.setCname(dto.getCname());
		bo.setCaddr(dto.getCaddr());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setSi(si);
		
		return dao.insert(bo)==1 ? "new user inserted with the interst amount" : "insertion failure";
	}

}
