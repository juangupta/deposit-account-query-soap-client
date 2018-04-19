
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InformacionTransaccionResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionTransaccionResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoCuenta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroCuenta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cuentaPermiteDebitos">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cuentaPermiteCreditos">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaApertura">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroDiasInactividad" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="indicadorCuentaCancelada">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaCancelacionCuenta" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="marcasCuenta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionTransaccionResp", propOrder = {
    "tipoCuenta",
    "numeroCuenta",
    "cuentaPermiteDebitos",
    "cuentaPermiteCreditos",
    "fechaApertura",
    "numeroDiasInactividad",
    "indicadorCuentaCancelada",
    "fechaCancelacionCuenta",
    "marcasCuenta"
})
public class InformacionTransaccionResp {

    @XmlElement(required = true)
    protected String tipoCuenta;
    @XmlElement(required = true)
    protected String numeroCuenta;
    @XmlElement(required = true)
    protected String cuentaPermiteDebitos;
    @XmlElement(required = true)
    protected String cuentaPermiteCreditos;
    @XmlElement(required = true)
    protected XMLGregorianCalendar fechaApertura;
    @XmlElement(required = true)
    protected BigInteger numeroDiasInactividad;
    @XmlElement(required = true)
    protected String indicadorCuentaCancelada;
    protected XMLGregorianCalendar fechaCancelacionCuenta;
    @XmlElement(required = true)
    protected String marcasCuenta;

    /**
     * Gets the value of the tipoCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

    /**
     * Gets the value of the numeroCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets the value of the numeroCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Gets the value of the cuentaPermiteDebitos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaPermiteDebitos() {
        return cuentaPermiteDebitos;
    }

    /**
     * Sets the value of the cuentaPermiteDebitos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaPermiteDebitos(String value) {
        this.cuentaPermiteDebitos = value;
    }

    /**
     * Gets the value of the cuentaPermiteCreditos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaPermiteCreditos() {
        return cuentaPermiteCreditos;
    }

    /**
     * Sets the value of the cuentaPermiteCreditos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaPermiteCreditos(String value) {
        this.cuentaPermiteCreditos = value;
    }

    /**
     * Gets the value of the fechaApertura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Sets the value of the fechaApertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaApertura(XMLGregorianCalendar value) {
        this.fechaApertura = value;
    }

    /**
     * Gets the value of the numeroDiasInactividad property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroDiasInactividad() {
        return numeroDiasInactividad;
    }

    /**
     * Sets the value of the numeroDiasInactividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroDiasInactividad(BigInteger value) {
        this.numeroDiasInactividad = value;
    }

    /**
     * Gets the value of the indicadorCuentaCancelada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorCuentaCancelada() {
        return indicadorCuentaCancelada;
    }

    /**
     * Sets the value of the indicadorCuentaCancelada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorCuentaCancelada(String value) {
        this.indicadorCuentaCancelada = value;
    }

    /**
     * Gets the value of the fechaCancelacionCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCancelacionCuenta() {
        return fechaCancelacionCuenta;
    }

    /**
     * Sets the value of the fechaCancelacionCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCancelacionCuenta(XMLGregorianCalendar value) {
        this.fechaCancelacionCuenta = value;
    }

    /**
     * Gets the value of the marcasCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcasCuenta() {
        return marcasCuenta;
    }

    /**
     * Sets the value of the marcasCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcasCuenta(String value) {
        this.marcasCuenta = value;
    }

}
