
package pe.gob.mtpe.sunateo.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transaccion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="d_fec_trans" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="notificaciones" type="{http://ws.sunateo.mtpe.gob.pe/}notificacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="v_cod_entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v_cod_trans" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="v_estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v_notif_envio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v_notif_error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaccion", propOrder = {
    "dFecTrans",
    "notificaciones",
    "vCodEntidad",
    "vCodTrans",
    "vEstado",
    "vNotifEnvio",
    "vNotifError"
})
public class Transaccion {

    @XmlElement(name = "d_fec_trans")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFecTrans;
    @XmlElement(nillable = true)
    protected List<Notificacion> notificaciones;
    @XmlElement(name = "v_cod_entidad")
    protected String vCodEntidad;
    @XmlElement(name = "v_cod_trans")
    protected Integer vCodTrans;
    @XmlElement(name = "v_estado")
    protected String vEstado;
    @XmlElement(name = "v_notif_envio")
    protected String vNotifEnvio;
    @XmlElement(name = "v_notif_error")
    protected String vNotifError;

    /**
     * Gets the value of the dFecTrans property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDFecTrans() {
        return dFecTrans;
    }

    /**
     * Sets the value of the dFecTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDFecTrans(XMLGregorianCalendar value) {
        this.dFecTrans = value;
    }

    /**
     * Gets the value of the notificaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notificacion }
     * 
     * 
     */
    public List<Notificacion> getNotificaciones() {
        if (notificaciones == null) {
            notificaciones = new ArrayList<Notificacion>();
        }
        return this.notificaciones;
    }

    /**
     * Gets the value of the vCodEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCodEntidad() {
        return vCodEntidad;
    }

    /**
     * Sets the value of the vCodEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCodEntidad(String value) {
        this.vCodEntidad = value;
    }

    /**
     * Gets the value of the vCodTrans property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVCodTrans() {
        return vCodTrans;
    }

    /**
     * Sets the value of the vCodTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVCodTrans(Integer value) {
        this.vCodTrans = value;
    }

    /**
     * Gets the value of the vEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEstado() {
        return vEstado;
    }

    /**
     * Sets the value of the vEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEstado(String value) {
        this.vEstado = value;
    }

    /**
     * Gets the value of the vNotifEnvio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNotifEnvio() {
        return vNotifEnvio;
    }

    /**
     * Sets the value of the vNotifEnvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNotifEnvio(String value) {
        this.vNotifEnvio = value;
    }

    /**
     * Gets the value of the vNotifError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNotifError() {
        return vNotifError;
    }

    /**
     * Sets the value of the vNotifError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNotifError(String value) {
        this.vNotifError = value;
    }

}
