
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
@WebServiceClient(name = "MtpeSunateoServiceService", targetNamespace = "http://ws.sunateo.mtpe.gob.pe/", wsdlLocation = "http://appweb.trabajo.gob.pe/sunateows/MtpeSunateoService?wsdl")
public class MtpeSunateoServiceService
    extends Service
{

    private final static URL MTPESUNATEOSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(pe.gob.mtpe.sunateo.ws.MtpeSunateoServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = pe.gob.mtpe.sunateo.ws.MtpeSunateoServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://appweb.trabajo.gob.pe/sunateows/MtpeSunateoService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://appweb.trabajo.gob.pe/sunateows/MtpeSunateoService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MTPESUNATEOSERVICESERVICE_WSDL_LOCATION = url;
    }

    public MtpeSunateoServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MtpeSunateoServiceService() {
        super(MTPESUNATEOSERVICESERVICE_WSDL_LOCATION, new QName("http://ws.sunateo.mtpe.gob.pe/", "MtpeSunateoServiceService"));
    }

    /**
     * 
     * @return
     *     returns SunateoService
     */
    @WebEndpoint(name = "MtpeSunateoServicePort")
    public SunateoService getMtpeSunateoServicePort() {
        return super.getPort(new QName("http://ws.sunateo.mtpe.gob.pe/", "MtpeSunateoServicePort"), SunateoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SunateoService
     */
    @WebEndpoint(name = "MtpeSunateoServicePort")
    public SunateoService getMtpeSunateoServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.sunateo.mtpe.gob.pe/", "MtpeSunateoServicePort"), SunateoService.class, features);
    }

}