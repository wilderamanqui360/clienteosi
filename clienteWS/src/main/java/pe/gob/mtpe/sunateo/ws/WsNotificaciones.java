
package pe.gob.mtpe.sunateo.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "WsNotificaciones", targetNamespace = "http://ws.sunateo.mtpe.gob.pe", wsdlLocation = "http://localhost:8080/sunateo_ws/services/WsNotificaciones?wsdl")
public class WsNotificaciones
    extends Service
{

    private final static URL WSNOTIFICACIONES_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(pe.gob.mtpe.sunateo.ws.WsNotificaciones.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = pe.gob.mtpe.sunateo.ws.WsNotificaciones.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/sunateo_ws/services/WsNotificaciones?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/sunateo_ws/services/WsNotificaciones?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WSNOTIFICACIONES_WSDL_LOCATION = url;
    }

    public WsNotificaciones(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsNotificaciones() {
        super(WSNOTIFICACIONES_WSDL_LOCATION, new QName("http://ws.sunateo.mtpe.gob.pe", "WsNotificaciones"));
    }

    /**
     * 
     * @return
     *     returns WsNotificacionesPortType
     */
    @WebEndpoint(name = "WsNotificacionesHttpSoap11Endpoint")
    public WsNotificacionesPortType getWsNotificacionesHttpSoap11Endpoint() {
        return super.getPort(new QName("http://ws.sunateo.mtpe.gob.pe", "WsNotificacionesHttpSoap11Endpoint"), WsNotificacionesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsNotificacionesPortType
     */
    @WebEndpoint(name = "WsNotificacionesHttpSoap11Endpoint")
    public WsNotificacionesPortType getWsNotificacionesHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.sunateo.mtpe.gob.pe", "WsNotificacionesHttpSoap11Endpoint"), WsNotificacionesPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns WsNotificacionesPortType
     */
    @WebEndpoint(name = "WsNotificacionesHttpSoap12Endpoint")
    public WsNotificacionesPortType getWsNotificacionesHttpSoap12Endpoint() {
        return super.getPort(new QName("http://ws.sunateo.mtpe.gob.pe", "WsNotificacionesHttpSoap12Endpoint"), WsNotificacionesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsNotificacionesPortType
     */
    @WebEndpoint(name = "WsNotificacionesHttpSoap12Endpoint")
    public WsNotificacionesPortType getWsNotificacionesHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.sunateo.mtpe.gob.pe", "WsNotificacionesHttpSoap12Endpoint"), WsNotificacionesPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns WsNotificacionesPortType
     */
    @WebEndpoint(name = "WsNotificacionesHttpEndpoint")
    public WsNotificacionesPortType getWsNotificacionesHttpEndpoint() {
        return super.getPort(new QName("http://ws.sunateo.mtpe.gob.pe", "WsNotificacionesHttpEndpoint"), WsNotificacionesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsNotificacionesPortType
     */
    @WebEndpoint(name = "WsNotificacionesHttpEndpoint")
    public WsNotificacionesPortType getWsNotificacionesHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.sunateo.mtpe.gob.pe", "WsNotificacionesHttpEndpoint"), WsNotificacionesPortType.class, features);
    }

}
