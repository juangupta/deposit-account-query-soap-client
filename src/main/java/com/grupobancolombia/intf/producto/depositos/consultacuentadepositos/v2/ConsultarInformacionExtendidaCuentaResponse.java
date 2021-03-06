
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarInformacionExtendidaCuentaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarInformacionExtendidaCuentaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionCuenta" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}InformacionCuentaCIEResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionExtendidaCuentaResponse", propOrder = {
    "informacionCuenta"
})
public class ConsultarInformacionExtendidaCuentaResponse {

    @XmlElement(required = true)
    protected InformacionCuentaCIEResp informacionCuenta;

    /**
     * Gets the value of the informacionCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionCuentaCIEResp }
     *     
     */
    public InformacionCuentaCIEResp getInformacionCuenta() {
        return informacionCuenta;
    }

    /**
     * Sets the value of the informacionCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionCuentaCIEResp }
     *     
     */
    public void setInformacionCuenta(InformacionCuentaCIEResp value) {
        this.informacionCuenta = value;
    }

}
