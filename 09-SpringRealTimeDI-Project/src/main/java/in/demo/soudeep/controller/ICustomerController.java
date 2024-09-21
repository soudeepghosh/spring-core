package in.demo.soudeep.controller;

import in.demo.soudeep.beans.CustomerVo;

public interface ICustomerController {
	public String processCustomer(CustomerVo customer) throws Exception;
}
