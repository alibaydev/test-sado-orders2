
package edu.sado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the edu.sado package.
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _SearchException_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "SearchException");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _FolderOperationFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "FolderOperationFault");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _DocsProtectionNotInstalledException_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "DocsProtectionNotInstalledException");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _FileOperationFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "FileOperationFault");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _MethodException_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "MethodException");
    private final static QName _SecurityException_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "SecurityException");
    private final static QName _DocumentOperationFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "DocumentOperationFault");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ObjectNotFoundException_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "ObjectNotFoundException");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _SecurityExceptionMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", "Message");
    private final static QName _DocumentNumberDate_QNAME = new QName("http://www.infpres.com/IEDMS", "date");
    private final static QName _QualifiedValueProperties_QNAME = new QName("http://www.infpres.com/IEDMS", "Properties");
    private final static QName _CorrespondentCorrespondentType_QNAME = new QName("http://www.infpres.com/IEDMS", "CorrespondentType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.sado
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LinkedDocument }
     *
     */
    public LinkedDocument createLinkedDocument() {
        return new LinkedDocument();
    }

    /**
     * Create an instance of {@link Communication }
     *
     */
    public Communication createCommunication() {
        return new Communication();
    }

    /**
     * Create an instance of {@link DocumentClause }
     *
     */
    public DocumentClause createDocumentClause() {
        return new DocumentClause();
    }

    /**
     * Create an instance of {@link MessageAcknowledgment }
     *
     */
    public MessageAcknowledgment createMessageAcknowledgment() {
        return new MessageAcknowledgment();
    }

    /**
     * Create an instance of {@link MessageAcknowledgment.HashCodes }
     *
     */
    public MessageAcknowledgment.HashCodes createMessageAcknowledgmentHashCodes() {
        return new MessageAcknowledgment.HashCodes();
    }

    /**
     * Create an instance of {@link CheckAccessForOperationResponse }
     *
     */
    public CheckAccessForOperationResponse createCheckAccessForOperationResponse() {
        return new CheckAccessForOperationResponse();
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     *
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link DocumentItem }
     *
     */
    public DocumentItem createDocumentItem() {
        return new DocumentItem();
    }

    /**
     * Create an instance of {@link GetResolution }
     *
     */
    public GetResolution createGetResolution() {
        return new GetResolution();
    }

    /**
     * Create an instance of {@link TestResponse }
     *
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link GetSearchResultResponse }
     *
     */
    public GetSearchResultResponse createGetSearchResultResponse() {
        return new GetSearchResultResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGuid }
     *
     */
    public ArrayOfGuid createArrayOfGuid() {
        return new ArrayOfGuid();
    }

    /**
     * Create an instance of {@link GetFileSignatures }
     *
     */
    public GetFileSignatures createGetFileSignatures() {
        return new GetFileSignatures();
    }

    /**
     * Create an instance of {@link ChangeDocumentStateResponse }
     *
     */
    public ChangeDocumentStateResponse createChangeDocumentStateResponse() {
        return new ChangeDocumentStateResponse();
    }

    /**
     * Create an instance of {@link GetCounterpartyCompany }
     *
     */
    public GetCounterpartyCompany createGetCounterpartyCompany() {
        return new GetCounterpartyCompany();
    }

    /**
     * Create an instance of {@link AddFileToDocumentResponse }
     *
     */
    public AddFileToDocumentResponse createAddFileToDocumentResponse() {
        return new AddFileToDocumentResponse();
    }

    /**
     * Create an instance of {@link ExecuteMethodResponse }
     *
     */
    public ExecuteMethodResponse createExecuteMethodResponse() {
        return new ExecuteMethodResponse();
    }

    /**
     * Create an instance of {@link CheckAccessForOperation }
     *
     */
    public CheckAccessForOperation createCheckAccessForOperation() {
        return new CheckAccessForOperation();
    }

    /**
     * Create an instance of {@link AddSignatureToFileResponse }
     *
     */
    public AddSignatureToFileResponse createAddSignatureToFileResponse() {
        return new AddSignatureToFileResponse();
    }

    /**
     * Create an instance of {@link GetDocumentInfo }
     *
     */
    public GetDocumentInfo createGetDocumentInfo() {
        return new GetDocumentInfo();
    }

    /**
     * Create an instance of {@link GetResolutionResponse }
     *
     */
    public GetResolutionResponse createGetResolutionResponse() {
        return new GetResolutionResponse();
    }

    /**
     * Create an instance of {@link ExecuteMethod }
     *
     */
    public ExecuteMethod createExecuteMethod() {
        return new ExecuteMethod();
    }

    /**
     * Create an instance of {@link ArrayOfMethodArgument }
     *
     */
    public ArrayOfMethodArgument createArrayOfMethodArgument() {
        return new ArrayOfMethodArgument();
    }

    /**
     * Create an instance of {@link GetSearchResult }
     *
     */
    public GetSearchResult createGetSearchResult() {
        return new GetSearchResult();
    }

    /**
     * Create an instance of {@link SearchQuery }
     *
     */
    public SearchQuery createSearchQuery() {
        return new SearchQuery();
    }

    /**
     * Create an instance of {@link Test }
     *
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link ExecuteReaderMethod }
     *
     */
    public ExecuteReaderMethod createExecuteReaderMethod() {
        return new ExecuteReaderMethod();
    }

    /**
     * Create an instance of {@link CreateDocumentResponse }
     *
     */
    public CreateDocumentResponse createCreateDocumentResponse() {
        return new CreateDocumentResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     *
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link AddresseeExt }
     *
     */
    public AddresseeExt createAddresseeExt() {
        return new AddresseeExt();
    }

    /**
     * Create an instance of {@link CreateCardFileResponse }
     *
     */
    public CreateCardFileResponse createCreateCardFileResponse() {
        return new CreateCardFileResponse();
    }

    /**
     * Create an instance of {@link UpdateFilesInDocumentResponse }
     *
     */
    public UpdateFilesInDocumentResponse createUpdateFilesInDocumentResponse() {
        return new UpdateFilesInDocumentResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationId }
     *
     */
    public GetOrganizationId createGetOrganizationId() {
        return new GetOrganizationId();
    }

    /**
     * Create an instance of {@link UpdateFilesInDocument }
     *
     */
    public UpdateFilesInDocument createUpdateFilesInDocument() {
        return new UpdateFilesInDocument();
    }

    /**
     * Create an instance of {@link FilesItem }
     *
     */
    public FilesItem createFilesItem() {
        return new FilesItem();
    }

    /**
     * Create an instance of {@link AddFilesToDocument }
     *
     */
    public AddFilesToDocument createAddFilesToDocument() {
        return new AddFilesToDocument();
    }

    /**
     * Create an instance of {@link UpdateTask }
     *
     */
    public UpdateTask createUpdateTask() {
        return new UpdateTask();
    }

    /**
     * Create an instance of {@link ExecuteReportResponse }
     *
     */
    public ExecuteReportResponse createExecuteReportResponse() {
        return new ExecuteReportResponse();
    }

    /**
     * Create an instance of {@link AddCommentToDocument }
     *
     */
    public AddCommentToDocument createAddCommentToDocument() {
        return new AddCommentToDocument();
    }

    /**
     * Create an instance of {@link Comment }
     *
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link GetDocumentFile }
     *
     */
    public GetDocumentFile createGetDocumentFile() {
        return new GetDocumentFile();
    }

    /**
     * Create an instance of {@link GetDocumentInfoResponse }
     *
     */
    public GetDocumentInfoResponse createGetDocumentInfoResponse() {
        return new GetDocumentInfoResponse();
    }

    /**
     * Create an instance of {@link StartApprovalCycle }
     *
     */
    public StartApprovalCycle createStartApprovalCycle() {
        return new StartApprovalCycle();
    }

    /**
     * Create an instance of {@link StartApprovalCycleParams }
     *
     */
    public StartApprovalCycleParams createStartApprovalCycleParams() {
        return new StartApprovalCycleParams();
    }

    /**
     * Create an instance of {@link AddNotificationRecord }
     *
     */
    public AddNotificationRecord createAddNotificationRecord() {
        return new AddNotificationRecord();
    }

    /**
     * Create an instance of {@link NotificationItem }
     *
     */
    public NotificationItem createNotificationItem() {
        return new NotificationItem();
    }

    /**
     * Create an instance of {@link AddSignatureToCardFile }
     *
     */
    public AddSignatureToCardFile createAddSignatureToCardFile() {
        return new AddSignatureToCardFile();
    }

    /**
     * Create an instance of {@link FileSignature }
     *
     */
    public FileSignature createFileSignature() {
        return new FileSignature();
    }

    /**
     * Create an instance of {@link UpdateDocument }
     *
     */
    public UpdateDocument createUpdateDocument() {
        return new UpdateDocument();
    }

    /**
     * Create an instance of {@link AddFilesToDocumentResponse }
     *
     */
    public AddFilesToDocumentResponse createAddFilesToDocumentResponse() {
        return new AddFilesToDocumentResponse();
    }

    /**
     * Create an instance of {@link FindEmployeesResponse }
     *
     */
    public FindEmployeesResponse createFindEmployeesResponse() {
        return new FindEmployeesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAddresseeExt }
     *
     */
    public ArrayOfAddresseeExt createArrayOfAddresseeExt() {
        return new ArrayOfAddresseeExt();
    }

    /**
     * Create an instance of {@link CreateLinkExResponse }
     *
     */
    public CreateLinkExResponse createCreateLinkExResponse() {
        return new CreateLinkExResponse();
    }

    /**
     * Create an instance of {@link UpdateFileInDocument }
     *
     */
    public UpdateFileInDocument createUpdateFileInDocument() {
        return new UpdateFileInDocument();
    }

    /**
     * Create an instance of {@link FileItem }
     *
     */
    public FileItem createFileItem() {
        return new FileItem();
    }

    /**
     * Create an instance of {@link CreateTask }
     *
     */
    public CreateTask createCreateTask() {
        return new CreateTask();
    }

    /**
     * Create an instance of {@link GetCounterpartyEmployee }
     *
     */
    public GetCounterpartyEmployee createGetCounterpartyEmployee() {
        return new GetCounterpartyEmployee();
    }

    /**
     * Create an instance of {@link GetCounterpartyEmployeeResponse }
     *
     */
    public GetCounterpartyEmployeeResponse createGetCounterpartyEmployeeResponse() {
        return new GetCounterpartyEmployeeResponse();
    }

    /**
     * Create an instance of {@link Employee }
     *
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link GetOrganizationIdResponse }
     *
     */
    public GetOrganizationIdResponse createGetOrganizationIdResponse() {
        return new GetOrganizationIdResponse();
    }

    /**
     * Create an instance of {@link AddFileToDocumentEx }
     *
     */
    public AddFileToDocumentEx createAddFileToDocumentEx() {
        return new AddFileToDocumentEx();
    }

    /**
     * Create an instance of {@link ExecuteReaderMethodResponse }
     *
     */
    public ExecuteReaderMethodResponse createExecuteReaderMethodResponse() {
        return new ExecuteReaderMethodResponse();
    }

    /**
     * Create an instance of {@link AddSignatureToCardFileResponse }
     *
     */
    public AddSignatureToCardFileResponse createAddSignatureToCardFileResponse() {
        return new AddSignatureToCardFileResponse();
    }

    /**
     * Create an instance of {@link UpdateNotificationStatus }
     *
     */
    public UpdateNotificationStatus createUpdateNotificationStatus() {
        return new UpdateNotificationStatus();
    }

    /**
     * Create an instance of {@link AddNotificationRecordResponse }
     *
     */
    public AddNotificationRecordResponse createAddNotificationRecordResponse() {
        return new AddNotificationRecordResponse();
    }

    /**
     * Create an instance of {@link StartApprovalCycleResponse }
     *
     */
    public StartApprovalCycleResponse createStartApprovalCycleResponse() {
        return new StartApprovalCycleResponse();
    }

    /**
     * Create an instance of {@link GetFileFromCardFile }
     *
     */
    public GetFileFromCardFile createGetFileFromCardFile() {
        return new GetFileFromCardFile();
    }

    /**
     * Create an instance of {@link GetFileFromCardFileResponse }
     *
     */
    public GetFileFromCardFileResponse createGetFileFromCardFileResponse() {
        return new GetFileFromCardFileResponse();
    }

    /**
     * Create an instance of {@link AddSignatureToFile }
     *
     */
    public AddSignatureToFile createAddSignatureToFile() {
        return new AddSignatureToFile();
    }

    /**
     * Create an instance of {@link UpdateDocumentResponse }
     *
     */
    public UpdateDocumentResponse createUpdateDocumentResponse() {
        return new UpdateDocumentResponse();
    }

    /**
     * Create an instance of {@link UpdateTaskResponse }
     *
     */
    public UpdateTaskResponse createUpdateTaskResponse() {
        return new UpdateTaskResponse();
    }

    /**
     * Create an instance of {@link ExecuteMethodById }
     *
     */
    public ExecuteMethodById createExecuteMethodById() {
        return new ExecuteMethodById();
    }

    /**
     * Create an instance of {@link GetAccessOperationsResponse }
     *
     */
    public GetAccessOperationsResponse createGetAccessOperationsResponse() {
        return new GetAccessOperationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOperation }
     *
     */
    public ArrayOfOperation createArrayOfOperation() {
        return new ArrayOfOperation();
    }

    /**
     * Create an instance of {@link CreateApplicationLogRecord }
     *
     */
    public CreateApplicationLogRecord createCreateApplicationLogRecord() {
        return new CreateApplicationLogRecord();
    }

    /**
     * Create an instance of {@link GetDocumentFiles }
     *
     */
    public GetDocumentFiles createGetDocumentFiles() {
        return new GetDocumentFiles();
    }

    /**
     * Create an instance of {@link GetViewData }
     *
     */
    public GetViewData createGetViewData() {
        return new GetViewData();
    }

    /**
     * Create an instance of {@link CheckDocumentProtectState }
     *
     */
    public CheckDocumentProtectState createCheckDocumentProtectState() {
        return new CheckDocumentProtectState();
    }

    /**
     * Create an instance of {@link CreateApprovalCycle }
     *
     */
    public CreateApprovalCycle createCreateApprovalCycle() {
        return new CreateApprovalCycle();
    }

    /**
     * Create an instance of {@link CreateApprovalCycleParams }
     *
     */
    public CreateApprovalCycleParams createCreateApprovalCycleParams() {
        return new CreateApprovalCycleParams();
    }

    /**
     * Create an instance of {@link FindOrganisationsResponse }
     *
     */
    public FindOrganisationsResponse createFindOrganisationsResponse() {
        return new FindOrganisationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfQualifiedValue }
     *
     */
    public ArrayOfQualifiedValue createArrayOfQualifiedValue() {
        return new ArrayOfQualifiedValue();
    }

    /**
     * Create an instance of {@link CheckDocumentProtectStateResponse }
     *
     */
    public CheckDocumentProtectStateResponse createCheckDocumentProtectStateResponse() {
        return new CheckDocumentProtectStateResponse();
    }

    /**
     * Create an instance of {@link CreateApplicationLogRecordResponse }
     *
     */
    public CreateApplicationLogRecordResponse createCreateApplicationLogRecordResponse() {
        return new CreateApplicationLogRecordResponse();
    }

    /**
     * Create an instance of {@link CreateLinkEx }
     *
     */
    public CreateLinkEx createCreateLinkEx() {
        return new CreateLinkEx();
    }

    /**
     * Create an instance of {@link GetDocument }
     *
     */
    public GetDocument createGetDocument() {
        return new GetDocument();
    }

    /**
     * Create an instance of {@link GetFolderContent }
     *
     */
    public GetFolderContent createGetFolderContent() {
        return new GetFolderContent();
    }

    /**
     * Create an instance of {@link CreateApprovalCycleResponse }
     *
     */
    public CreateApprovalCycleResponse createCreateApprovalCycleResponse() {
        return new CreateApprovalCycleResponse();
    }

    /**
     * Create an instance of {@link CreateCardFile }
     *
     */
    public CreateCardFile createCreateCardFile() {
        return new CreateCardFile();
    }

    /**
     * Create an instance of {@link GetFolderContentResponse }
     *
     */
    public GetFolderContentResponse createGetFolderContentResponse() {
        return new GetFolderContentResponse();
    }

    /**
     * Create an instance of {@link GetCounterpartyCompanyResponse }
     *
     */
    public GetCounterpartyCompanyResponse createGetCounterpartyCompanyResponse() {
        return new GetCounterpartyCompanyResponse();
    }

    /**
     * Create an instance of {@link Company }
     *
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link CreateLink }
     *
     */
    public CreateLink createCreateLink() {
        return new CreateLink();
    }

    /**
     * Create an instance of {@link AddFileToDocumentExResponse }
     *
     */
    public AddFileToDocumentExResponse createAddFileToDocumentExResponse() {
        return new AddFileToDocumentExResponse();
    }

    /**
     * Create an instance of {@link FindOrganisations }
     *
     */
    public FindOrganisations createFindOrganisations() {
        return new FindOrganisations();
    }

    /**
     * Create an instance of {@link OrganisationQuery }
     *
     */
    public OrganisationQuery createOrganisationQuery() {
        return new OrganisationQuery();
    }

    /**
     * Create an instance of {@link GetEmployee }
     *
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link ChangeDocumentState }
     *
     */
    public ChangeDocumentState createChangeDocumentState() {
        return new ChangeDocumentState();
    }

    /**
     * Create an instance of {@link ExecuteReport }
     *
     */
    public ExecuteReport createExecuteReport() {
        return new ExecuteReport();
    }

    /**
     * Create an instance of {@link GetTask }
     *
     */
    public GetTask createGetTask() {
        return new GetTask();
    }

    /**
     * Create an instance of {@link UpdateFileInDocumentResponse }
     *
     */
    public UpdateFileInDocumentResponse createUpdateFileInDocumentResponse() {
        return new UpdateFileInDocumentResponse();
    }

    /**
     * Create an instance of {@link GetViewDataResponse }
     *
     */
    public GetViewDataResponse createGetViewDataResponse() {
        return new GetViewDataResponse();
    }

    /**
     * Create an instance of {@link GetTaskResponse }
     *
     */
    public GetTaskResponse createGetTaskResponse() {
        return new GetTaskResponse();
    }

    /**
     * Create an instance of {@link UpdateNotificationStatusResponse }
     *
     */
    public UpdateNotificationStatusResponse createUpdateNotificationStatusResponse() {
        return new UpdateNotificationStatusResponse();
    }

    /**
     * Create an instance of {@link CreateTaskResponse }
     *
     */
    public CreateTaskResponse createCreateTaskResponse() {
        return new CreateTaskResponse();
    }

    /**
     * Create an instance of {@link GetDocumentFileResponse }
     *
     */
    public GetDocumentFileResponse createGetDocumentFileResponse() {
        return new GetDocumentFileResponse();
    }

    /**
     * Create an instance of {@link AddFileToDocument }
     *
     */
    public AddFileToDocument createAddFileToDocument() {
        return new AddFileToDocument();
    }

    /**
     * Create an instance of {@link CreateLinkResponse }
     *
     */
    public CreateLinkResponse createCreateLinkResponse() {
        return new CreateLinkResponse();
    }

    /**
     * Create an instance of {@link AddCommentToDocumentResponse }
     *
     */
    public AddCommentToDocumentResponse createAddCommentToDocumentResponse() {
        return new AddCommentToDocumentResponse();
    }

    /**
     * Create an instance of {@link ExecuteMethodByIdResponse }
     *
     */
    public ExecuteMethodByIdResponse createExecuteMethodByIdResponse() {
        return new ExecuteMethodByIdResponse();
    }

    /**
     * Create an instance of {@link GetDocumentFilesResponse }
     *
     */
    public GetDocumentFilesResponse createGetDocumentFilesResponse() {
        return new GetDocumentFilesResponse();
    }

    /**
     * Create an instance of {@link CreateDocument }
     *
     */
    public CreateDocument createCreateDocument() {
        return new CreateDocument();
    }

    /**
     * Create an instance of {@link GetAccessOperations }
     *
     */
    public GetAccessOperations createGetAccessOperations() {
        return new GetAccessOperations();
    }

    /**
     * Create an instance of {@link GetFileSignaturesResponse }
     *
     */
    public GetFileSignaturesResponse createGetFileSignaturesResponse() {
        return new GetFileSignaturesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFileSignature }
     *
     */
    public ArrayOfFileSignature createArrayOfFileSignature() {
        return new ArrayOfFileSignature();
    }

    /**
     * Create an instance of {@link FindEmployees }
     *
     */
    public FindEmployees createFindEmployees() {
        return new FindEmployees();
    }

    /**
     * Create an instance of {@link EmployeeQuery }
     *
     */
    public EmployeeQuery createEmployeeQuery() {
        return new EmployeeQuery();
    }

    /**
     * Create an instance of {@link EmployeeRef }
     *
     */
    public EmployeeRef createEmployeeRef() {
        return new EmployeeRef();
    }

    /**
     * Create an instance of {@link ApproverParams }
     *
     */
    public ApproverParams createApproverParams() {
        return new ApproverParams();
    }

    /**
     * Create an instance of {@link Operation }
     *
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link ArrayOfFileItem }
     *
     */
    public ArrayOfFileItem createArrayOfFileItem() {
        return new ArrayOfFileItem();
    }

    /**
     * Create an instance of {@link ArrayOfSearchParameter }
     *
     */
    public ArrayOfSearchParameter createArrayOfSearchParameter() {
        return new ArrayOfSearchParameter();
    }

    /**
     * Create an instance of {@link SearchParameter }
     *
     */
    public SearchParameter createSearchParameter() {
        return new SearchParameter();
    }

    /**
     * Create an instance of {@link AddressRef }
     *
     */
    public AddressRef createAddressRef() {
        return new AddressRef();
    }

    /**
     * Create an instance of {@link MethodArgument }
     *
     */
    public MethodArgument createMethodArgument() {
        return new MethodArgument();
    }

    /**
     * Create an instance of {@link ArrayOfApproverParams }
     *
     */
    public ArrayOfApproverParams createArrayOfApproverParams() {
        return new ArrayOfApproverParams();
    }

    /**
     * Create an instance of {@link ParamsList }
     *
     */
    public ParamsList createParamsList() {
        return new ParamsList();
    }

    /**
     * Create an instance of {@link ServiceItem }
     *
     */
    public ServiceItem createServiceItem() {
        return new ServiceItem();
    }

    /**
     * Create an instance of {@link CompanyRef }
     *
     */
    public CompanyRef createCompanyRef() {
        return new CompanyRef();
    }

    /**
     * Create an instance of {@link QualifiedValue }
     *
     */
    public QualifiedValue createQualifiedValue() {
        return new QualifiedValue();
    }

    /**
     * Create an instance of {@link Task }
     *
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link ArrayOfAddressee }
     *
     */
    public ArrayOfAddressee createArrayOfAddressee() {
        return new ArrayOfAddressee();
    }

    /**
     * Create an instance of {@link Address }
     *
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link DocumentNumber }
     *
     */
    public DocumentNumber createDocumentNumber() {
        return new DocumentNumber();
    }

    /**
     * Create an instance of {@link ArrayOfCategory }
     *
     */
    public ArrayOfCategory createArrayOfCategory() {
        return new ArrayOfCategory();
    }

    /**
     * Create an instance of {@link ArrayOfReport }
     *
     */
    public ArrayOfReport createArrayOfReport() {
        return new ArrayOfReport();
    }

    /**
     * Create an instance of {@link CitizenRequestDocument }
     *
     */
    public CitizenRequestDocument createCitizenRequestDocument() {
        return new CitizenRequestDocument();
    }

    /**
     * Create an instance of {@link Result }
     *
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link ArrayOfNotificationRow1 }
     *
     */
    public ArrayOfNotificationRow1 createArrayOfNotificationRow1() {
        return new ArrayOfNotificationRow1();
    }

    /**
     * Create an instance of {@link Enclosure }
     *
     */
    public Enclosure createEnclosure() {
        return new Enclosure();
    }

    /**
     * Create an instance of {@link ArrayOfNotificationRow }
     *
     */
    public ArrayOfNotificationRow createArrayOfNotificationRow() {
        return new ArrayOfNotificationRow();
    }

    /**
     * Create an instance of {@link ArrayOfComment }
     *
     */
    public ArrayOfComment createArrayOfComment() {
        return new ArrayOfComment();
    }

    /**
     * Create an instance of {@link ArrayOfCorrespondent }
     *
     */
    public ArrayOfCorrespondent createArrayOfCorrespondent() {
        return new ArrayOfCorrespondent();
    }

    /**
     * Create an instance of {@link Approver }
     *
     */
    public Approver createApprover() {
        return new Approver();
    }

    /**
     * Create an instance of {@link ArrayOfNotificationReference }
     *
     */
    public ArrayOfNotificationReference createArrayOfNotificationReference() {
        return new ArrayOfNotificationReference();
    }

    /**
     * Create an instance of {@link ArrayOfExecutor }
     *
     */
    public ArrayOfExecutor createArrayOfExecutor() {
        return new ArrayOfExecutor();
    }

    /**
     * Create an instance of {@link ArrayOfEnclosure }
     *
     */
    public ArrayOfEnclosure createArrayOfEnclosure() {
        return new ArrayOfEnclosure();
    }

    /**
     * Create an instance of {@link Employee2 }
     *
     */
    public Employee2 createEmployee2() {
        return new Employee2();
    }

    /**
     * Create an instance of {@link ArrayOfProperty }
     *
     */
    public ArrayOfProperty createArrayOfProperty() {
        return new ArrayOfProperty();
    }

    /**
     * Create an instance of {@link Addressee }
     *
     */
    public Addressee createAddressee() {
        return new Addressee();
    }

    /**
     * Create an instance of {@link Anyone }
     *
     */
    public Anyone createAnyone() {
        return new Anyone();
    }

    /**
     * Create an instance of {@link Part }
     *
     */
    public Part createPart() {
        return new Part();
    }

    /**
     * Create an instance of {@link Signatory }
     *
     */
    public Signatory createSignatory() {
        return new Signatory();
    }

    /**
     * Create an instance of {@link Applicant }
     *
     */
    public Applicant createApplicant() {
        return new Applicant();
    }

    /**
     * Create an instance of {@link Resolution }
     *
     */
    public Resolution createResolution() {
        return new Resolution();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     *
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
    }

    /**
     * Create an instance of {@link Category }
     *
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link ArrayOfAnyone }
     *
     */
    public ArrayOfAnyone createArrayOfAnyone() {
        return new ArrayOfAnyone();
    }

    /**
     * Create an instance of {@link edu.sado.Document }
     *
     */
    public edu.sado.Document createDocument() {
        return new edu.sado.Document();
    }

    /**
     * Create an instance of {@link DeliveryDestination }
     *
     */
    public DeliveryDestination createDeliveryDestination() {
        return new DeliveryDestination();
    }

    /**
     * Create an instance of {@link ArrayOfLinkedDocument }
     *
     */
    public ArrayOfLinkedDocument createArrayOfLinkedDocument() {
        return new ArrayOfLinkedDocument();
    }

    /**
     * Create an instance of {@link ArrayOfSignatory }
     *
     */
    public ArrayOfSignatory createArrayOfSignatory() {
        return new ArrayOfSignatory();
    }

    /**
     * Create an instance of {@link Executor }
     *
     */
    public Executor createExecutor() {
        return new Executor();
    }

    /**
     * Create an instance of {@link ArrayOfTheme }
     *
     */
    public ArrayOfTheme createArrayOfTheme() {
        return new ArrayOfTheme();
    }

    /**
     * Create an instance of {@link AssociatedFile }
     *
     */
    public AssociatedFile createAssociatedFile() {
        return new AssociatedFile();
    }

    /**
     * Create an instance of {@link NotificationRow }
     *
     */
    public NotificationRow createNotificationRow() {
        return new NotificationRow();
    }

    /**
     * Create an instance of {@link ArrayOfAddressee1 }
     *
     */
    public ArrayOfAddressee1 createArrayOfAddressee1() {
        return new ArrayOfAddressee1();
    }

    /**
     * Create an instance of {@link Property }
     *
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Comment2 }
     *
     */
    public Comment2 createComment2() {
        return new Comment2();
    }

    /**
     * Create an instance of {@link ArrayOfResult }
     *
     */
    public ArrayOfResult createArrayOfResult() {
        return new ArrayOfResult();
    }

    /**
     * Create an instance of {@link Report }
     *
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link AddresseeList }
     *
     */
    public AddresseeList createAddresseeList() {
        return new AddresseeList();
    }

    /**
     * Create an instance of {@link ArrayOfPart }
     *
     */
    public ArrayOfPart createArrayOfPart() {
        return new ArrayOfPart();
    }

    /**
     * Create an instance of {@link NotificationReference }
     *
     */
    public NotificationReference createNotificationReference() {
        return new NotificationReference();
    }

    /**
     * Create an instance of {@link Theme }
     *
     */
    public Theme createTheme() {
        return new Theme();
    }

    /**
     * Create an instance of {@link Correspondent }
     *
     */
    public Correspondent createCorrespondent() {
        return new Correspondent();
    }

    /**
     * Create an instance of {@link DocumentReference }
     *
     */
    public DocumentReference createDocumentReference() {
        return new DocumentReference();
    }

    /**
     * Create an instance of {@link CommunicationPartner }
     *
     */
    public CommunicationPartner createCommunicationPartner() {
        return new CommunicationPartner();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentClause }
     *
     */
    public ArrayOfDocumentClause createArrayOfDocumentClause() {
        return new ArrayOfDocumentClause();
    }

    /**
     * Create an instance of {@link ArrayOfApprover }
     *
     */
    public ArrayOfApprover createArrayOfApprover() {
        return new ArrayOfApprover();
    }

    /**
     * Create an instance of {@link FolderOperationFault }
     *
     */
    public FolderOperationFault createFolderOperationFault() {
        return new FolderOperationFault();
    }

    /**
     * Create an instance of {@link ObjectNotFoundException }
     *
     */
    public ObjectNotFoundException createObjectNotFoundException() {
        return new ObjectNotFoundException();
    }

    /**
     * Create an instance of {@link SearchException }
     *
     */
    public SearchException createSearchException() {
        return new SearchException();
    }

    /**
     * Create an instance of {@link FileOperationFault }
     *
     */
    public FileOperationFault createFileOperationFault() {
        return new FileOperationFault();
    }

    /**
     * Create an instance of {@link SecurityException }
     *
     */
    public SecurityException createSecurityException() {
        return new SecurityException();
    }

    /**
     * Create an instance of {@link DocumentOperationFault }
     *
     */
    public DocumentOperationFault createDocumentOperationFault() {
        return new DocumentOperationFault();
    }

    /**
     * Create an instance of {@link MethodException }
     *
     */
    public MethodException createMethodException() {
        return new MethodException();
    }

    /**
     * Create an instance of {@link DocsProtectionNotInstalledException }
     *
     */
    public DocsProtectionNotInstalledException createDocsProtectionNotInstalledException() {
        return new DocsProtectionNotInstalledException();
    }

    /**
     * Create an instance of {@link LinkedDocument.Document }
     *
     */
    public LinkedDocument.Document createLinkedDocumentDocument() {
        return new LinkedDocument.Document();
    }

    /**
     * Create an instance of {@link Communication.Header }
     *
     */
    public Communication.Header createCommunicationHeader() {
        return new Communication.Header();
    }

    /**
     * Create an instance of {@link Communication.Files }
     *
     */
    public Communication.Files createCommunicationFiles() {
        return new Communication.Files();
    }

    /**
     * Create an instance of {@link Communication.DeliveryIndex }
     *
     */
    public Communication.DeliveryIndex createCommunicationDeliveryIndex() {
        return new Communication.DeliveryIndex();
    }

    /**
     * Create an instance of {@link DocumentClause.Parcipants }
     *
     */
    public DocumentClause.Parcipants createDocumentClauseParcipants() {
        return new DocumentClause.Parcipants();
    }

    /**
     * Create an instance of {@link MessageAcknowledgment.HashCodes.Item }
     *
     */
    public MessageAcknowledgment.HashCodes.Item createMessageAcknowledgmentHashCodesItem() {
        return new MessageAcknowledgment.HashCodes.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "SearchException")
    public JAXBElement<SearchException> createSearchException(SearchException value) {
        return new JAXBElement<SearchException>(_SearchException_QNAME, SearchException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderOperationFault }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "FolderOperationFault")
    public JAXBElement<FolderOperationFault> createFolderOperationFault(FolderOperationFault value) {
        return new JAXBElement<FolderOperationFault>(_FolderOperationFault_QNAME, FolderOperationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocsProtectionNotInstalledException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "DocsProtectionNotInstalledException")
    public JAXBElement<DocsProtectionNotInstalledException> createDocsProtectionNotInstalledException(DocsProtectionNotInstalledException value) {
        return new JAXBElement<DocsProtectionNotInstalledException>(_DocsProtectionNotInstalledException_QNAME, DocsProtectionNotInstalledException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileOperationFault }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "FileOperationFault")
    public JAXBElement<FileOperationFault> createFileOperationFault(FileOperationFault value) {
        return new JAXBElement<FileOperationFault>(_FileOperationFault_QNAME, FileOperationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MethodException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "MethodException")
    public JAXBElement<MethodException> createMethodException(MethodException value) {
        return new JAXBElement<MethodException>(_MethodException_QNAME, MethodException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "SecurityException")
    public JAXBElement<SecurityException> createSecurityException(SecurityException value) {
        return new JAXBElement<SecurityException>(_SecurityException_QNAME, SecurityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentOperationFault }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "DocumentOperationFault")
    public JAXBElement<DocumentOperationFault> createDocumentOperationFault(DocumentOperationFault value) {
        return new JAXBElement<DocumentOperationFault>(_DocumentOperationFault_QNAME, DocumentOperationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectNotFoundException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "ObjectNotFoundException")
    public JAXBElement<ObjectNotFoundException> createObjectNotFoundException(ObjectNotFoundException value) {
        return new JAXBElement<ObjectNotFoundException>(_ObjectNotFoundException_QNAME, ObjectNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "Message", scope = SecurityException.class)
    public JAXBElement<String> createSecurityExceptionMessage(String value) {
        return new JAXBElement<String>(_SecurityExceptionMessage_QNAME, String.class, SecurityException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.infpres.com/IEDMS", name = "date", scope = DocumentNumber.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentNumberDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentNumberDate_QNAME, XMLGregorianCalendar.class, DocumentNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "Message", scope = SearchException.class)
    public JAXBElement<String> createSearchExceptionMessage(String value) {
        return new JAXBElement<String>(_SecurityExceptionMessage_QNAME, String.class, SearchException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "Message", scope = ObjectNotFoundException.class)
    public JAXBElement<String> createObjectNotFoundExceptionMessage(String value) {
        return new JAXBElement<String>(_SecurityExceptionMessage_QNAME, String.class, ObjectNotFoundException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProperty }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.infpres.com/IEDMS", name = "Properties", scope = QualifiedValue.class)
    public JAXBElement<ArrayOfProperty> createQualifiedValueProperties(ArrayOfProperty value) {
        return new JAXBElement<ArrayOfProperty>(_QualifiedValueProperties_QNAME, ArrayOfProperty.class, QualifiedValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "Message", scope = DocumentOperationFault.class)
    public JAXBElement<String> createDocumentOperationFaultMessage(String value) {
        return new JAXBElement<String>(_SecurityExceptionMessage_QNAME, String.class, DocumentOperationFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "Message", scope = MethodException.class)
    public JAXBElement<String> createMethodExceptionMessage(String value) {
        return new JAXBElement<String>(_SecurityExceptionMessage_QNAME, String.class, MethodException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "Message", scope = FolderOperationFault.class)
    public JAXBElement<String> createFolderOperationFaultMessage(String value) {
        return new JAXBElement<String>(_SecurityExceptionMessage_QNAME, String.class, FolderOperationFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "Message", scope = DocsProtectionNotInstalledException.class)
    public JAXBElement<String> createDocsProtectionNotInstalledExceptionMessage(String value) {
        return new JAXBElement<String>(_SecurityExceptionMessage_QNAME, String.class, DocsProtectionNotInstalledException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/IntegrationSystem.Exceptions", name = "Message", scope = FileOperationFault.class)
    public JAXBElement<String> createFileOperationFaultMessage(String value) {
        return new JAXBElement<String>(_SecurityExceptionMessage_QNAME, String.class, FileOperationFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondentType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.infpres.com/IEDMS", name = "CorrespondentType", scope = Correspondent.class)
    public JAXBElement<CorrespondentType> createCorrespondentCorrespondentType(CorrespondentType value) {
        return new JAXBElement<CorrespondentType>(_CorrespondentCorrespondentType_QNAME, CorrespondentType.class, Correspondent.class, value);
    }

}
