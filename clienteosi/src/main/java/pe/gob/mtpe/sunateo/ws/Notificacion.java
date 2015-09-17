
package pe.gob.mtpe.sunateo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notificacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formxml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v_cod_notif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificacion", propOrder = {
    "formxml",
    "vCodNotif"
})
public class Notificacion {

    protected String formxml;
    @XmlElement(name = "v_cod_notif")
    protected String vCodNotif;

    /**
     * Gets the value of the formxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormxml() {
        return formxml;
    }

    /**
     * Sets the value of the formxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormxml(String value) {
        this.formxml = value;
    }

    /**
     * Gets the value of the vCodNotif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCodNotif() {
        return vCodNotif;
    }

    /**
     * Sets the value of the vCodNotif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCodNotif(String value) {
        this.vCodNotif = value;
    }

}
