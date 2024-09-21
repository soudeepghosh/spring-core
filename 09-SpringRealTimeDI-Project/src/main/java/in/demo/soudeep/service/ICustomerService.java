package in.demo.soudeep.service;

import in.demo.soudeep.beans.CustomerDto;

public interface ICustomerService {
	public String calculateSimpleInterest(CustomerDto customer) throws Exception;
}
