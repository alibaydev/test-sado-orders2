
package edu.sado;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebFault(name = "DocumentOperationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions")
public class IntegrationSystemIntegrationServiceAddNotificationRecordDocumentOperationFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private DocumentOperationFault faultInfo;

    /**
     *
     * @param faultInfo
     * @param message
     */
    public IntegrationSystemIntegrationServiceAddNotificationRecordDocumentOperationFaultFaultFaultMessage(String message, DocumentOperationFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IntegrationSystemIntegrationServiceAddNotificationRecordDocumentOperationFaultFaultFaultMessage(String message, DocumentOperationFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: edu.sado.DocumentOperationFault
     */
    public DocumentOperationFault getFaultInfo() {
        return faultInfo;
    }

}
