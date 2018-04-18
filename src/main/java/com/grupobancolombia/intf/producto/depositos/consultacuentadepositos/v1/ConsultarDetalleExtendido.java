
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarDetalleExtendido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarDetalleExtendido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionCuenta" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0}InformacionCuenta"/>
 *         &lt;element name="identificacionCliente" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0}IdentificacionCliente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarDetalleExtendido", propOrder = {
    "informacionCuenta",
    "identificacionCliente"
})
public class ConsultarDetalleExtendido {

    @XmlElement(required = true)
    protected InformacionCuenta informacionCuenta;
    protected IdentificacionCliente identificacionCliente;

    /**
     * Gets the value of the informacionCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionCuenta }
     *     
     */
    public InformacionCuenta getInformacionCuenta() {
        return informacionCuenta;
    }

    /**
     * Sets the value of the informacionCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionCuenta }
     *     
     */
    public void setInformacionCuenta(InformacionCuenta value) {
        this.informacionCuenta = value;
    }

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
