package pe.com.itama.ws.clienteosi;

import java.util.List;

import pe.gob.mtpe.sunateo.ws.MtpeSunateoServiceService;
import pe.gob.mtpe.sunateo.ws.Notificacion;
import pe.gob.mtpe.sunateo.ws.SunateoService;
import pe.gob.mtpe.sunateo.ws.Transaccion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World Julio!" );
        MtpeSunateoServiceService m= new MtpeSunateoServiceService();
        SunateoService sunateoService=m.getPort(SunateoService.class);
        Transaccion tx=sunateoService.obtenerNotificacionesPendientes("WSOSI");
        System.out.println("sizeee:  "+tx.getNotificaciones().size());
        List<Notificacion> notificaciones=tx.getNotificaciones();
        for(Notificacion notificacion:notificaciones){
        	notificacion.getFormxml();
        }
        
    }
}
