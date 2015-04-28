package pe.gob.mtpe.sunateo.ws.proxy;

import java.io.IOException;

import pe.gob.mtpe.sunateo.ws.ObtenerNotificacionesPendientes;
import pe.gob.mtpe.sunateo.ws.ObtenerNotificacionesPendientesResponse;


public interface INotificacionesPendientesProxy {

	
	public abstract ObtenerNotificacionesPendientesResponse obtenerNotificacionesPendientes(ObtenerNotificacionesPendientes obtenerNotificacionesPendientes) throws IOException ;

}