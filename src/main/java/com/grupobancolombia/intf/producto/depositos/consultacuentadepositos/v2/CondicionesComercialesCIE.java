
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CondicionesComercialesCIE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondicionesComercialesCIE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionTransaccion" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}InformacionTransaccion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicionesComercialesCIE", propOrder = {
    "informacionTransaccion"
})
public class CondicionesComercialesCIE {

    @XmlElement(required = true)
    protected InformacionTransaccion informacionTransaccion;

    /**
     * Gets the value of the informacionTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionTransaccion }
     *     
     */
    public InformacionTransaccion getInformacionTransaccion() {
        return informacionTransaccion;
    }

    /**
     * Sets the value of the informacionTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionTransaccion }
     *     
     */
    public void setInformacionTransaccion(InformacionTransaccion value) {
        this.informacionTransaccion = value;
    }

}
