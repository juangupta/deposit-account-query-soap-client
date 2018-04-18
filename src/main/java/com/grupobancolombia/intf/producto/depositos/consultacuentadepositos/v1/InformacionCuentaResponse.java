
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InformacionCuentaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionCuentaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descripcionMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoOficina">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="permiteDebito">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="permiteCredito">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="moneda">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaApertura" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="diasInactivos">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="99999"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cuentaCancelada">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaCierre" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="titularResponse" type="{http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0}TitularResponse" minOccurs="0"/>
 *         &lt;element name="numeroCotitulares">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="relacionIdentificacion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="marcacionesDeCuenta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;minLength value="1"/>
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
@XmlType(name = "InformacionCuentaResponse", propOrder = {
    "codigoMensaje",
    "descripcionMensaje",
    "codigoOficina",
    "permiteDebito",
    "permiteCredito",
    "moneda",
    "fechaApertura",
    "diasInactivos",
    "cuentaCancelada",
    "fechaCierre",
    "titularResponse",
    "numeroCotitulares",
    "relacionIdentificacion",
    "marcacionesDeCuenta"
})
public class InformacionCuentaResponse {

    @XmlElement(required = true)
    protected String codigoMensaje;
    @XmlElement(required = true)
    protected String descripcionMensaje;
    @XmlElement(required = true)
    protected String codigoOficina;
    @XmlElement(required = true)
    protected String permiteDebito;
    @XmlElement(required = true)
    protected String permiteCredito;
    @XmlElement(required = true)
    protected String moneda;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaApertura;
    protected int diasInactivos;
    @XmlElement(required = true)
    protected String cuentaCancelada;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCierre;
    protected TitularResponse titularResponse;
    protected int numeroCotitulares;
    protected String relacionIdentificacion;
    @XmlElement(required = true)
    protected String marcacionesDeCuenta;

    /**
     * Gets the value of the codigoMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Sets the value of the codigoMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensaje(String value) {
        this.codigoMensaje = value;
    }

    /**
     * Gets the value of the descripcionMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Sets the value of the descripcionMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
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
     * Gets the value of the permiteDebito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteDebito() {
        return permiteDebito;
    }

    /**
     * Sets the value of the permiteDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteDebito(String value) {
        this.permiteDebito = value;
    }

    /**
     * Gets the value of the permiteCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteCredito() {
        return permiteCredito;
    }

    /**
     * Sets the value of the permiteCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteCredito(String value) {
        this.permiteCredito = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
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
     * Gets the value of the diasInactivos property.
     * 
     */
    public int getDiasInactivos() {
        return diasInactivos;
    }

    /**
     * Sets the value of the diasInactivos property.
     * 
     */
    public void setDiasInactivos(int value) {
        this.diasInactivos = value;
    }

    /**
     * Gets the value of the cuentaCancelada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaCancelada() {
        return cuentaCancelada;
    }

    /**
     * Sets the value of the cuentaCancelada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaCancelada(String value) {
        this.cuentaCancelada = value;
    }

    /**
     * Gets the value of the fechaCierre property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCierre() {
        return fechaCierre;
    }

    /**
     * Sets the value of the fechaCierre property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCierre(XMLGregorianCalendar value) {
        this.fechaCierre = value;
    }

    /**
     * Gets the value of the titularResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TitularResponse }
     *     
     */
    public TitularResponse getTitularResponse() {
        return titularResponse;
    }

    /**
     * Sets the value of the titularResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitularResponse }
     *     
     */
    public void setTitularResponse(TitularResponse value) {
        this.titularResponse = value;
    }

    /**
     * Gets the value of the numeroCotitulares property.
     * 
     */
    public int getNumeroCotitulares() {
        return numeroCotitulares;
    }

    /**
     * Sets the value of the numeroCotitulares property.
     * 
     */
    public void setNumeroCotitulares(int value) {
        this.numeroCotitulares = value;
    }

    /**
     * Gets the value of the relacionIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelacionIdentificacion() {
        return relacionIdentificacion;
    }

    /**
     * Sets the value of the relacionIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelacionIdentificacion(String value) {
        this.relacionIdentificacion = value;
    }

    /**
     * Gets the value of the marcacionesDeCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcacionesDeCuenta() {
        return marcacionesDeCuenta;
    }

    /**
     * Sets the value of the marcacionesDeCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcacionesDeCuenta(String value) {
        this.marcacionesDeCuenta = value;
    }

}
