
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

    private final static QName _ObtenerNotificacionesPendientesResponse_QNAME = new QName("http://ws.sunateo.mtpe.gob.pe/", "obtenerNotificacionesPendientesResponse");
    private final static QName _ObtenerNotificacionesPendientes_QNAME = new QName("http://ws.sunateo.mtpe.gob.pe/", "obtenerNotificacionesPendientes");
    private final static QName _ConfirmarRecepcionMensajeResponse_QNAME = new QName("http://ws.sunateo.mtpe.gob.pe/", "confirmarRecepcionMensajeResponse");
    private final static QName _ConfirmarRecepcionMensaje_QNAME = new QName("http://ws.sunateo.mtpe.gob.pe/", "confirmarRecepcionMensaje");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.gob.mtpe.sunateo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfirmarRecepcionMensaje }
     * 
     */
    public ConfirmarRecepcionMensaje createConfirmarRecepcionMensaje() {
        return new ConfirmarRecepcionMensaje();
    }

    /**
     * Create an instance of {@link Transaccion }
     * 
     */
    public Transaccion createTransaccion() {
        return new Transaccion();
    }

    /**
     * Create an instance of {@link Notificacion }
     * 
     */
    public Notificacion createNotificacion() {
        return new Notificacion();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionesPendientesResponse }
     * 
     */
    public ObtenerNotificacionesPendientesResponse createObtenerNotificacionesPendientesResponse() {
        return new ObtenerNotificacionesPendientesResponse();
    }

    /**
     * Create an instance of {@link ConfirmarRecepcionMensajeResponse }
     * 
     */
    public ConfirmarRecepcionMensajeResponse createConfirmarRecepcionMensajeResponse() {
        return new ConfirmarRecepcionMensajeResponse();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionesPendientes }
     * 
     */
    public ObtenerNotificacionesPendientes createObtenerNotificacionesPendientes() {
        return new ObtenerNotificacionesPendientes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionesPendientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sunateo.mtpe.gob.pe/", name = "obtenerNotificacionesPendientesResponse")
    public JAXBElement<ObtenerNotificacionesPendientesResponse> createObtenerNotificacionesPendientesResponse(ObtenerNotificacionesPendientesResponse value) {
        return new JAXBElement<ObtenerNotificacionesPendientesResponse>(_ObtenerNotificacionesPendientesResponse_QNAME, ObtenerNotificacionesPendientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionesPendientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sunateo.mtpe.gob.pe/", name = "obtenerNotificacionesPendientes")
    public JAXBElement<ObtenerNotificacionesPendientes> createObtenerNotificacionesPendientes(ObtenerNotificacionesPendientes value) {
        return new JAXBElement<ObtenerNotificacionesPendientes>(_ObtenerNotificacionesPendientes_QNAME, ObtenerNotificacionesPendientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarRecepcionMensajeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sunateo.mtpe.gob.pe/", name = "confirmarRecepcionMensajeResponse")
    public JAXBElement<ConfirmarRecepcionMensajeResponse> createConfirmarRecepcionMensajeResponse(ConfirmarRecepcionMensajeResponse value) {
        return new JAXBElement<ConfirmarRecepcionMensajeResponse>(_ConfirmarRecepcionMensajeResponse_QNAME, ConfirmarRecepcionMensajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarRecepcionMensaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sunateo.mtpe.gob.pe/", name = "confirmarRecepcionMensaje")
    public JAXBElement<ConfirmarRecepcionMensaje> createConfirmarRecepcionMensaje(ConfirmarRecepcionMensaje value) {
        return new JAXBElement<ConfirmarRecepcionMensaje>(_ConfirmarRecepcionMensaje_QNAME, ConfirmarRecepcionMensaje.class, null, value);
    }

}
