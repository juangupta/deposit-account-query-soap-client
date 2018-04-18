
package com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v1 package. 
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

    private final static QName _SystemException_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0", "systemException");
    private final static QName _ConsultarDetalleExtendido_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0", "consultarDetalleExtendido");
    private final static QName _ConsultarDetalleExtendidoResponse_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0", "consultarDetalleExtendidoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.grupobancolombia.intf.producto.depositos.consultacuentadepositos.v1
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
     * Create an instance of {@link ConsultarDetalleExtendidoResponse }
     * 
     */
    public ConsultarDetalleExtendidoResponse createConsultarDetalleExtendidoResponse() {
        return new ConsultarDetalleExtendidoResponse();
    }

    /**
     * Create an instance of {@link ConsultarDetalleExtendido }
     * 
     */
    public ConsultarDetalleExtendido createConsultarDetalleExtendido() {
        return new ConsultarDetalleExtendido();
    }

    /**
     * Create an instance of {@link InformacionCuenta }
     * 
     */
    public InformacionCuenta createInformacionCuenta() {
        return new InformacionCuenta();
    }

    /**
     * Create an instance of {@link IdentificacionCliente }
     * 
     */
    public IdentificacionCliente createIdentificacionCliente() {
        return new IdentificacionCliente();
    }

    /**
     * Create an instance of {@link InformacionCuentaResponse }
     * 
     */
    public InformacionCuentaResponse createInformacionCuentaResponse() {
        return new InformacionCuentaResponse();
    }

    /**
     * Create an instance of {@link TitularResponse }
     * 
     */
    public TitularResponse createTitularResponse() {
        return new TitularResponse();
    }

    /**
     * Create an instance of {@link IdentificacionClienteResponse }
     * 
     */
    public IdentificacionClienteResponse createIdentificacionClienteResponse() {
        return new IdentificacionClienteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0", name = "systemException")
    public JAXBElement<SystemException> createSystemException(SystemException value) {
        return new JAXBElement<SystemException>(_SystemException_QNAME, SystemException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDetalleExtendido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0", name = "consultarDetalleExtendido")
    public JAXBElement<ConsultarDetalleExtendido> createConsultarDetalleExtendido(ConsultarDetalleExtendido value) {
        return new JAXBElement<ConsultarDetalleExtendido>(_ConsultarDetalleExtendido_QNAME, ConsultarDetalleExtendido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDetalleExtendidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Depositos/ConsultaCuentaDepositos/V1.0", name = "consultarDetalleExtendidoResponse")
    public JAXBElement<ConsultarDetalleExtendidoResponse> createConsultarDetalleExtendidoResponse(ConsultarDetalleExtendidoResponse value) {
        return new JAXBElement<ConsultarDetalleExtendidoResponse>(_ConsultarDetalleExtendidoResponse_QNAME, ConsultarDetalleExtendidoResponse.class, null, value);
    }

}
