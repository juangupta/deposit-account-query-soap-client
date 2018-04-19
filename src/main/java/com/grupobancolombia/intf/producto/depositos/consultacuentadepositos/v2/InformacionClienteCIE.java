
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionClienteCIE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionClienteCIE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionCliente" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}IdentificacionCliente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionClienteCIE", propOrder = {
    "identificacionCliente"
})
public class InformacionClienteCIE {

    protected IdentificacionCliente identificacionCliente;

    /**
     * Gets the value of the identificacionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionCliente }
     *     
     */
    public IdentificacionCliente getIdentificacionCliente() {
        return identificacionCliente;
    }

    /**
     * Sets the value of the identificacionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionCliente }
     *     
     */
    public void setIdentificacionCliente(IdentificacionCliente value) {
        this.identificacionCliente = value;
    }

}
