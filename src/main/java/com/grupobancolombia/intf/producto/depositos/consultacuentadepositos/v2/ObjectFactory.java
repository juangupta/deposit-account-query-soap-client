
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SystemException_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0", "systemException");
    private final static QName _ConsultarInformacionExtendidaCuenta_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0", "consultarInformacionExtendidaCuenta");
    private final static QName _ConsultarInformacionExtendidaCuentaResponse_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0", "consultarInformacionExtendidaCuentaResponse");
    private final static QName _ConsultaCuentaDepositosBusinessException_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0", "consultaCuentaDepositosBusinessException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SystemException }
     * 
     */
    public SystemException createSystemException() {
        return new SystemException();
    }

    /**
     * Create an instance of {@link ConsultarInformacionExtendidaCuenta }
     * 
     */
    public ConsultarInformacionExtendidaCuenta createConsultarInformacionExtendidaCuenta() {
        return new ConsultarInformacionExtendidaCuenta();
    }

    /**
     * Create an instance of {@link ConsultarInformacionExtendidaCuentaResponse }
     * 
     */
    public ConsultarInformacionExtendidaCuentaResponse createConsultarInformacionExtendidaCuentaResponse() {
        return new ConsultarInformacionExtendidaCuentaResponse();
    }

    /**
     * Create an instance of {@link ConsultaCuentaDepositosBusinessException }
     * 
     */
    public ConsultaCuentaDepositosBusinessException createConsultaCuentaDepositosBusinessException() {
        return new ConsultaCuentaDepositosBusinessException();
    }

    /**
     * Create an instance of {@link InformacionCuentaCIE }
     * 
     */
    public InformacionCuentaCIE createInformacionCuentaCIE() {
        return new InformacionCuentaCIE();
    }

    /**
     * Create an instance of {@link CondicionesComercialesCIEResp }
     * 
     */
    public CondicionesComercialesCIEResp createCondicionesComercialesCIEResp() {
        return new CondicionesComercialesCIEResp();
    }

    /**
     * Create an instance of {@link InformacionClienteCIEResp }
     * 
     */
    public InformacionClienteCIEResp createInformacionClienteCIEResp() {
        return new InformacionClienteCIEResp();
    }

    /**
     * Create an instance of {@link InformacionClienteCIE }
     * 
     */
    public InformacionClienteCIE createInformacionClienteCIE() {
        return new InformacionClienteCIE();
    }

    /**
     * Create an instance of {@link InformacionTransaccionResp }
     * 
     */
    public InformacionTransaccionResp createInformacionTransaccionResp() {
        return new InformacionTransaccionResp();
    }

    /**
     * Create an instance of {@link IdentificacionCliente }
     * 
     */
    public IdentificacionCliente createIdentificacionCliente() {
        return new IdentificacionCliente();
    }

    /**
     * Create an instance of {@link IdentificacionTitularCIEResp }
     * 
     */
    public IdentificacionTitularCIEResp createIdentificacionTitularCIEResp() {
        return new IdentificacionTitularCIEResp();
    }

    /**
     * Create an instance of {@link InformacionTransaccion }
     * 
     */
    public InformacionTransaccion createInformacionTransaccion() {
        return new InformacionTransaccion();
    }

    /**
     * Create an instance of {@link CondicionesComercialesCIE }
     * 
     */
    public CondicionesComercialesCIE createCondicionesComercialesCIE() {
        return new CondicionesComercialesCIE();
    }

    /**
     * Create an instance of {@link InformacionCuentaCIEResp }
     * 
     */
    public InformacionCuentaCIEResp createInformacionCuentaCIEResp() {
        return new InformacionCuentaCIEResp();
    }

    /**
     * Create an instance of {@link RelacionClienteCIEResp }
     * 
     */
    public RelacionClienteCIEResp createRelacionClienteCIEResp() {
        return new RelacionClienteCIEResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0", name = "systemException")
    public JAXBElement<SystemException> createSystemException(SystemException value) {
        return new JAXBElement<SystemException>(_SystemException_QNAME, SystemException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarInformacionExtendidaCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0", name = "consultarInformacionExtendidaCuenta")
    public JAXBElement<ConsultarInformacionExtendidaCuenta> createConsultarInformacionExtendidaCuenta(ConsultarInformacionExtendidaCuenta value) {
        return new JAXBElement<ConsultarInformacionExtendidaCuenta>(_ConsultarInformacionExtendidaCuenta_QNAME, ConsultarInformacionExtendidaCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarInformacionExtendidaCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0", name = "consultarInformacionExtendidaCuentaResponse")
    public JAXBElement<ConsultarInformacionExtendidaCuentaResponse> createConsultarInformacionExtendidaCuentaResponse(ConsultarInformacionExtendidaCuentaResponse value) {
        return new JAXBElement<ConsultarInformacionExtendidaCuentaResponse>(_ConsultarInformacionExtendidaCuentaResponse_QNAME, ConsultarInformacionExtendidaCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCuentaDepositosBusinessException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V2.0", name = "consultaCuentaDepositosBusinessException")
    public JAXBElement<ConsultaCuentaDepositosBusinessException> createConsultaCuentaDepositosBusinessException(ConsultaCuentaDepositosBusinessException value) {
        return new JAXBElement<ConsultaCuentaDepositosBusinessException>(_ConsultaCuentaDepositosBusinessException_QNAME, ConsultaCuentaDepositosBusinessException.class, null, value);
    }

}
