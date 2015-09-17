package pe.com.itama.ws.clienteosi;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.gob.mtpe.sunateo.ws.proxy.INotificacionesPendientesProxy;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/java/configuration/applicationContextNotificacionWS.xml" })
public class NotificacionesPendientesProxyTest {

	@Autowired
	private  INotificacionesPendientesProxy notificacionesPendientesProxy;
	
	@Test
	public void testPrueba() throws IOException{
		notificacionesPendientesProxy.obtenerNotificacionesPendientes("WSOSI");
	}

}
