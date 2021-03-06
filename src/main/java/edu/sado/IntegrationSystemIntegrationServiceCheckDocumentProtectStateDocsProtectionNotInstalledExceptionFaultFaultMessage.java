
package edu.sado;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebFault(name = "DocsProtectionNotInstalledException", targetNamespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions")
public class IntegrationSystemIntegrationServiceCheckDocumentProtectStateDocsProtectionNotInstalledExceptionFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private DocsProtectionNotInstalledException faultInfo;

    /**
     *
     * @param faultInfo
     * @param message
     */
    public IntegrationSystemIntegrationServiceCheckDocumentProtectStateDocsProtectionNotInstalledExceptionFaultFaultMessage(String message, DocsProtectionNotInstalledException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IntegrationSystemIntegrationServiceCheckDocumentProtectStateDocsProtectionNotInstalledExceptionFaultFaultMessage(String message, DocsProtectionNotInstalledException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: edu.sado.DocsProtectionNotInstalledException
     */
    public DocsProtectionNotInstalledException getFaultInfo() {
        return faultInfo;
    }

}
