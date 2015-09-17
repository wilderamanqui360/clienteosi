package pe.com.itama.ws.clienteosi;

import static org.junit.Assert.*;

import org.apache.log4j.MDC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/java/configuration/applicationContextNotificacionWS.xml" })
public class PruebaAspectos {
	
	@Autowired
	CustomerBo customerBo;

	@Test
	public void test() {
		MDC.put("USERNAME", "user::");
		customerBo.addCustomer();
	}

}
