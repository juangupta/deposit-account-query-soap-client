
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionCuentaCIE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionCuentaCIE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condicionesComerciales" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}CondicionesComercialesCIE"/>
 *         &lt;element name="informacionCliente" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}InformacionClienteCIE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionCuentaCIE", propOrder = {
    "condicionesComerciales",
    "informacionCliente"
})
public class InformacionCuentaCIE {

    @XmlElement(required = true)
    protected CondicionesComercialesCIE condicionesComerciales;
    protected InformacionClienteCIE informacionCliente;

    /**
     * Gets the value of the condicionesComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link CondicionesComercialesCIE }
     *     
     */
    public CondicionesComercialesCIE getCondicionesComerciales() {
        return condicionesComerciales;
    }

    /**
     * Sets the value of the condicionesComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondicionesComercialesCIE }
     *     
     */
    public void setCondicionesComerciales(CondicionesComercialesCIE value) {
        this.condicionesComerciales = value;
    }

    /**
     * Gets the value of the informacionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionClienteCIE }
     *     
     */
    public InformacionClienteCIE getInformacionCliente() {
        return informacionCliente;
    }

    /**
     * Sets the value of the informacionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionClienteCIE }
     *     
     */
    public void setInformacionCliente(InformacionClienteCIE value) {
        this.informacionCliente = value;
    }

}
