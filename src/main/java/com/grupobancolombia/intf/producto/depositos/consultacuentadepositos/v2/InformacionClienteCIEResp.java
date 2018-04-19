
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionClienteCIEResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionClienteCIEResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relacionCliente" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}RelacionClienteCIEResp"/>
 *         &lt;element name="identificacionTitular" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}IdentificacionTitularCIEResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionClienteCIEResp", propOrder = {
    "relacionCliente",
    "identificacionTitular"
})
public class InformacionClienteCIEResp {

    @XmlElement(required = true)
    protected RelacionClienteCIEResp relacionCliente;
    @XmlElement(required = true)
    protected IdentificacionTitularCIEResp identificacionTitular;

    /**
     * Gets the value of the relacionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link RelacionClienteCIEResp }
     *     
     */
    public RelacionClienteCIEResp getRelacionCliente() {
        return relacionCliente;
    }

    /**
     * Sets the value of the relacionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelacionClienteCIEResp }
     *     
     */
    public void setRelacionCliente(RelacionClienteCIEResp value) {
        this.relacionCliente = value;
    }

    /**
     * Gets the value of the identificacionTitular property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionTitularCIEResp }
     *     
     */
    public IdentificacionTitularCIEResp getIdentificacionTitular() {
        return identificacionTitular;
    }

    /**
     * Sets the value of the identificacionTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionTitularCIEResp }
     *     
     */
    public void setIdentificacionTitular(IdentificacionTitularCIEResp value) {
        this.identificacionTitular = value;
    }

}
