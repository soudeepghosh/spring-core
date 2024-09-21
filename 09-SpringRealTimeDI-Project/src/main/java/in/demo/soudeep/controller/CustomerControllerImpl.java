package in.demo.soudeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.demo.soudeep.beans.CustomerDto;
import in.demo.soudeep.beans.CustomerVo;
import in.demo.soudeep.service.CustomerServiceImpl;

@Component(value = "controller")
public final class CustomerControllerImpl implements ICustomerController {
	@Autowired
	private CustomerServiceImpl service;
	@Override
	public String processCustomer(CustomerVo vo) throws Exception {
		CustomerDto dto = new CustomerDto();
		dto.setCname(vo.getCname());
		dto.setCaddr(vo.getCaddr());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		return service.calculateSimpleInterest(dto);
	}

}
