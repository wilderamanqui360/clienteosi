package pe.com.itama.ws.clienteosi;

import org.apache.log4j.Logger;

public class CustomerBoImpl implements CustomerBo {
	private static final Logger logger = Logger
			.getLogger(CustomerBo.class.getCanonicalName());

	public void addCustomer() {
		System.out.println("addCustomer() is running ");
		logger.info("addCustomer() is running ");
	}

	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue() is running ");
		logger.info("addCustomerReturnValue() is running");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		logger.info("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running, args : " + name);
		logger.info("addCustomerAround() is running, args : " + name
				);
	}
}