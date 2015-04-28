
package pe.gob.mtpe.sunateo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.gob.mtpe.sunateo.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerNotificacionesPendientesResponseReturn_QNAME = new QName("http://ws.sunateo.mtpe.gob.pe", "return");
    private final static QName _ConfirmarRecepcionMensajeErrores_QNAME = new QName("http://ws.sunateo.mtpe.gob.pe", "errores");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.gob.mtpe.sunateo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerNotificacionesPendientesResponse }
     * 
     */
    public ObtenerNotificacionesPendientesResponse createObtenerNotificacionesPendientesResponse() {
        return new ObtenerNotificacionesPendientesResponse();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionesPendientes }
     * 
     */
    public ObtenerNotificacionesPendientes createObtenerNotificacionesPendientes() {
        return new ObtenerNotificacionesPendientes();
    }

    /**
     * Create an instance of {@link ConfirmarRecepcionMensaje }
     * 
     */
    public ConfirmarRecepcionMensaje createConfirmarRecepcionMensaje() {
        return new ConfirmarRecepcionMensaje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sunateo.mtpe.gob.pe", name = "return", scope = ObtenerNotificacionesPendientesResponse.class)
    public JAXBElement<byte[]> createObtenerNotificacionesPendientesResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_ObtenerNotificacionesPendientesResponseReturn_QNAME, byte[].class, ObtenerNotificacionesPendientesResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sunateo.mtpe.gob.pe", name = "errores", scope = ConfirmarRecepcionMensaje.class)
    public JAXBElement<String> createConfirmarRecepcionMensajeErrores(String value) {
        return new JAXBElement<String>(_ConfirmarRecepcionMensajeErrores_QNAME, String.class, ConfirmarRecepcionMensaje.class, value);
    }

}
