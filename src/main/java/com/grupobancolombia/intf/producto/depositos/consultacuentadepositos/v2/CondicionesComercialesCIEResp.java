
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CondicionesComercialesCIEResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondicionesComercialesCIEResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoMoneda">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoOficina">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="informacionTransaccion" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0}InformacionTransaccionResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicionesComercialesCIEResp", propOrder = {
    "codigoMoneda",
    "codigoOficina",
    "informacionTransaccion"
})
public class CondicionesComercialesCIEResp {

    @XmlElement(required = true)
    protected String codigoMoneda;
    @XmlElement(required = true)
    protected String codigoOficina;
    @XmlElement(required = true)
    protected InformacionTransaccionResp informacionTransaccion;

    /**
     * Gets the value of the codigoMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Sets the value of the codigoMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoneda(String value) {
        this.codigoMoneda = value;
    }

    /**
     * Gets the value of the codigoOficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOficina() {
        return codigoOficina;
    }

    /**
     * Sets the value of the codigoOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOficina(String value) {
        this.codigoOficina = value;
    }

    /**
     * Gets the value of the informacionTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionTransaccionResp }
     *     
     */
    public InformacionTransaccionResp getInformacionTransaccion() {
        return informacionTransaccion;
    }

    /**
     * Sets the value of the informacionTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionTransaccionResp }
     *     
     */
    public void setInformacionTransaccion(InformacionTransaccionResp value) {
        this.informacionTransaccion = value;
    }

}
