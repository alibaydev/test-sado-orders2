
package edu.sado;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "IntegrationService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://10.20.181.203:8080/?wsdl")
public class IntegrationService
    extends Service
{

    private final static URL INTEGRATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException INTEGRATIONSERVICE_EXCEPTION;
    private final static QName INTEGRATIONSERVICE_QNAME = new QName("http://tempuri.org/", "IntegrationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.20.181.203:8080/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INTEGRATIONSERVICE_WSDL_LOCATION = url;
        INTEGRATIONSERVICE_EXCEPTION = e;
    }

    public IntegrationService() {
        super(__getWsdlLocation(), INTEGRATIONSERVICE_QNAME);
    }

    public IntegrationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INTEGRATIONSERVICE_QNAME, features);
    }

    public IntegrationService(URL wsdlLocation) {
        super(wsdlLocation, INTEGRATIONSERVICE_QNAME);
    }

    public IntegrationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INTEGRATIONSERVICE_QNAME, features);
    }

    public IntegrationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IntegrationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IntegrationSystemIntegrationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IntegrationSystem_IntegrationService")
    public IntegrationSystemIntegrationService getBasicHttpBindingIntegrationSystemIntegrationService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IntegrationSystem_IntegrationService"), IntegrationSystemIntegrationService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IntegrationSystemIntegrationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IntegrationSystem_IntegrationService")
    public IntegrationSystemIntegrationService getBasicHttpBindingIntegrationSystemIntegrationService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IntegrationSystem_IntegrationService"), IntegrationSystemIntegrationService.class, features);
    }

    /**
     *
     * @return
     *     returns IntegrationSystemIntegrationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IntegrationSystem_IntegrationService1")
    public IntegrationSystemIntegrationService getBasicHttpBindingIntegrationSystemIntegrationService1() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IntegrationSystem_IntegrationService1"), IntegrationSystemIntegrationService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IntegrationSystemIntegrationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IntegrationSystem_IntegrationService1")
    public IntegrationSystemIntegrationService getBasicHttpBindingIntegrationSystemIntegrationService1(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IntegrationSystem_IntegrationService1"), IntegrationSystemIntegrationService.class, features);
    }

    /**
     *
     * @return
     *     returns IntegrationSystemIntegrationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IntegrationSystem_IntegrationService2")
    public IntegrationSystemIntegrationService getBasicHttpBindingIntegrationSystemIntegrationService2() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IntegrationSystem_IntegrationService2"), IntegrationSystemIntegrationService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IntegrationSystemIntegrationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IntegrationSystem_IntegrationService2")
    public IntegrationSystemIntegrationService getBasicHttpBindingIntegrationSystemIntegrationService2(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IntegrationSystem_IntegrationService2"), IntegrationSystemIntegrationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INTEGRATIONSERVICE_EXCEPTION!= null) {
            throw INTEGRATIONSERVICE_EXCEPTION;
        }
        return INTEGRATIONSERVICE_WSDL_LOCATION;
    }

}
