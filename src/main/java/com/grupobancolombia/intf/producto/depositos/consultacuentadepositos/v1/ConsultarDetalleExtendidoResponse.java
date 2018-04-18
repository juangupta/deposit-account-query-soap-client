
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarDetalleExtendidoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarDetalleExtendidoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionCuentaResponse" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0}InformacionCuentaResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarDetalleExtendidoResponse", propOrder = {
    "informacionCuentaResponse"
})
public class ConsultarDetalleExtendidoResponse {

    protected InformacionCuentaResponse informacionCuentaResponse;

    /**
     * Gets the value of the informacionCuentaResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionCuentaResponse }
     *     
     */
    public InformacionCuentaResponse getInformacionCuentaResponse() {
        return informacionCuentaResponse;
    }

    /**
     * Sets the value of the informacionCuentaResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionCuentaResponse }
     *     
     */
    public void setInformacionCuentaResponse(InformacionCuentaResponse value) {
        this.informacionCuentaResponse = value;
    }

}
