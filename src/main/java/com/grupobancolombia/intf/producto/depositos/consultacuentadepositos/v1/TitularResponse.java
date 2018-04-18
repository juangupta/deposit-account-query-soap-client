
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitularResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitularResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocumentoTitular">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroDocumentoTitular">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="0"/>
 *               &lt;totalDigits value="60"/>
 *               &lt;minExclusive value="1"/>
 *               &lt;maxExclusive value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nombreDelTitular">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="150"/>
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
@XmlType(name = "TitularResponse", propOrder = {
    "tipoDocumentoTitular",
    "numeroDocumentoTitular",
    "nombreDelTitular"
})
public class TitularResponse {

    @XmlElement(required = true)
    protected String tipoDocumentoTitular;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal numeroDocumentoTitular;
    @XmlElement(required = true)
    protected String nombreDelTitular;

    /**
     * Gets the value of the tipoDocumentoTitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoTitular() {
        return tipoDocumentoTitular;
    }

    /**
     * Sets the value of the tipoDocumentoTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoTitular(String value) {
        this.tipoDocumentoTitular = value;
    }

    /**
     * Gets the value of the numeroDocumentoTitular property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroDocumentoTitular() {
        return numeroDocumentoTitular;
    }

    /**
     * Sets the value of the numeroDocumentoTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroDocumentoTitular(BigDecimal value) {
        this.numeroDocumentoTitular = value;
    }

    /**
     * Gets the value of the nombreDelTitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDelTitular() {
        return nombreDelTitular;
    }

    /**
     * Sets the value of the nombreDelTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDelTitular(String value) {
        this.nombreDelTitular = value;
    }

}
