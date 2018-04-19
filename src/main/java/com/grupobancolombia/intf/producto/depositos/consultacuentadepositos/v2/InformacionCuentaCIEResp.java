
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionCuentaCIEResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionCuentaCIEResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condicionesComerciales" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}CondicionesComercialesCIEResp"/>
 *         &lt;element name="informacionCliente" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}InformacionClienteCIEResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionCuentaCIEResp", propOrder = {
    "condicionesComerciales",
    "informacionCliente"
})
public class InformacionCuentaCIEResp {

    @XmlElement(required = true)
    protected CondicionesComercialesCIEResp condicionesComerciales;
    @XmlElement(required = true)
    protected InformacionClienteCIEResp informacionCliente;

    /**
     * Gets the value of the condicionesComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link CondicionesComercialesCIEResp }
     *     
     */
    public CondicionesComercialesCIEResp getCondicionesComerciales() {
        return condicionesComerciales;
    }

    /**
     * Sets the value of the condicionesComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondicionesComercialesCIEResp }
     *     
     */
    public void setCondicionesComerciales(CondicionesComercialesCIEResp value) {
        this.condicionesComerciales = value;
    }

    /**
     * Gets the value of the informacionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionClienteCIEResp }
     *     
     */
    public InformacionClienteCIEResp getInformacionCliente() {
        return informacionCliente;
    }

    /**
     * Sets the value of the informacionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionClienteCIEResp }
     *     
     */
    public void setInformacionCliente(InformacionClienteCIEResp value) {
        this.informacionCliente = value;
    }

}
