
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.adidas.sef.ws.schema.model package. 
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

    private final static QName _DeleteModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "deleteModelResponse");
    private final static QName _GetModelsByRangeIdsRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsByRangeIdsRequest");
    private final static QName _GetModelsWithFullAttrResponses_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsWithFullAttrResponses");
    private final static QName _GenderCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "genderCodes");
    private final static QName _GetModelsByIdResponses_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsByIdResponses");
    private final static QName _ProductTypeCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "productTypeCodes");
    private final static QName _ReleaseModelRequests_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "releaseModelRequests");
    private final static QName _GetModelsWithFullAttrRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsWithFullAttrRequest");
    private final static QName _GetModelsByIdRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsByIdRequest");
    private final static QName _CopyModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "copyModelResponse");
    private final static QName _ModelRangeIds_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "modelRangeIds");
    private final static QName _GetModelsWithSubsetAttrRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsWithSubsetAttrRequest");
    private final static QName _SportsCategoryCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "sportsCategoryCodes");
    private final static QName _ProductGroupCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "productGroupCodes");
    private final static QName _CreateNewModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "createNewModelResponse");
    private final static QName _GetModelRangeAttrsByIdRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelRangeAttrsByIdRequest");
    private final static QName _AgeGroupCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "ageGroupCodes");
    private final static QName _GetModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelResponse");
    private final static QName _GetModelRangeAttrsByIdResponses_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelRangeAttrsByIdResponses");
    private final static QName _DevelopmentTypeCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "developmentTypeCodes");
    private final static QName _GetModelsByRangeIdsResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsByRangeIdsResponse");
    private final static QName _SalesLineCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "salesLineCodes");
    private final static QName _UpdateModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "updateModelResponse");
    private final static QName _CategoryMrktLineCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "categoryMrktLineCodes");
    private final static QName _DevLocationCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "devLocationCodes");
    private final static QName _GetModelsWithSubsetAttrResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsWithSubsetAttrResponse");
    private final static QName _GetModelsWithSubsetAttrResponses_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "getModelsWithSubsetAttrResponses");
    private final static QName _ReleaseModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "releaseModelResponse");
    private final static QName _CarryOverModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "carryOverModelResponse");
    private final static QName _DuplicateModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "duplicateModelResponse");
    private final static QName _CorporateMrktLineCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/model", "corporateMrktLineCodes");
    private final static QName _CopyModelRequestsUserRole_QNAME = new QName("", "userRole");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adidas.sef.ws.schema.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateModelNullAttrs }
     * 
     */
    public UpdateModelNullAttrs createUpdateModelNullAttrs() {
        return new UpdateModelNullAttrs();
    }

    /**
     * Create an instance of {@link ModelRangeIds }
     * 
     */
    public ModelRangeIds createModelRangeIds() {
        return new ModelRangeIds();
    }

    /**
     * Create an instance of {@link GetModelRangeAttrsByIdResponses }
     * 
     */
    public GetModelRangeAttrsByIdResponses createGetModelRangeAttrsByIdResponses() {
        return new GetModelRangeAttrsByIdResponses();
    }

    /**
     * Create an instance of {@link GetTechModelIdResponses }
     * 
     */
    public GetTechModelIdResponses createGetTechModelIdResponses() {
        return new GetTechModelIdResponses();
    }

    /**
     * Create an instance of {@link DevLocationCodes }
     * 
     */
    public DevLocationCodes createDevLocationCodes() {
        return new DevLocationCodes();
    }

    /**
     * Create an instance of {@link ModelSort }
     * 
     */
    public ModelSort createModelSort() {
        return new ModelSort();
    }

    /**
     * Create an instance of {@link GetModelsByIdRequest }
     * 
     */
    public GetModelsByIdRequest createGetModelsByIdRequest() {
        return new GetModelsByIdRequest();
    }

    /**
     * Create an instance of {@link CopyModelRequests }
     * 
     */
    public CopyModelRequests createCopyModelRequests() {
        return new CopyModelRequests();
    }

    /**
     * Create an instance of {@link GetTechModelIdRequest }
     * 
     */
    public GetTechModelIdRequest createGetTechModelIdRequest() {
        return new GetTechModelIdRequest();
    }

    /**
     * Create an instance of {@link RangePlanIds }
     * 
     */
    public RangePlanIds createRangePlanIds() {
        return new RangePlanIds();
    }

    /**
     * Create an instance of {@link GetModelsWithFullAttrRequest }
     * 
     */
    public GetModelsWithFullAttrRequest createGetModelsWithFullAttrRequest() {
        return new GetModelsWithFullAttrRequest();
    }

    /**
     * Create an instance of {@link GenderCodes }
     * 
     */
    public GenderCodes createGenderCodes() {
        return new GenderCodes();
    }

    /**
     * Create an instance of {@link CarryOverModelRequests.CarryOverModel }
     * 
     */
    public CarryOverModelRequests.CarryOverModel createCarryOverModelRequestsCarryOverModel() {
        return new CarryOverModelRequests.CarryOverModel();
    }

    /**
     * Create an instance of {@link CreateNewModelResponse }
     * 
     */
    public CreateNewModelResponse createCreateNewModelResponse() {
        return new CreateNewModelResponse();
    }

    /**
     * Create an instance of {@link GetModelsWithSubsetAttrResponse }
     * 
     */
    public GetModelsWithSubsetAttrResponse createGetModelsWithSubsetAttrResponse() {
        return new GetModelsWithSubsetAttrResponse();
    }

    /**
     * Create an instance of {@link CopyModelRequests.CopyModel }
     * 
     */
    public CopyModelRequests.CopyModel createCopyModelRequestsCopyModel() {
        return new CopyModelRequests.CopyModel();
    }

    /**
     * Create an instance of {@link DevelopmentTypeCodes }
     * 
     */
    public DevelopmentTypeCodes createDevelopmentTypeCodes() {
        return new DevelopmentTypeCodes();
    }

    /**
     * Create an instance of {@link CreateNewModels }
     * 
     */
    public CreateNewModels createCreateNewModels() {
        return new CreateNewModels();
    }

    /**
     * Create an instance of {@link GetModelRangeAttrsByIdRequest }
     * 
     */
    public GetModelRangeAttrsByIdRequest createGetModelRangeAttrsByIdRequest() {
        return new GetModelRangeAttrsByIdRequest();
    }

    /**
     * Create an instance of {@link UpdateModelResponse }
     * 
     */
    public UpdateModelResponse createUpdateModelResponse() {
        return new UpdateModelResponse();
    }

    /**
     * Create an instance of {@link UpdateModelRequests }
     * 
     */
    public UpdateModelRequests createUpdateModelRequests() {
        return new UpdateModelRequests();
    }

    /**
     * Create an instance of {@link RequiredAttributes }
     * 
     */
    public RequiredAttributes createRequiredAttributes() {
        return new RequiredAttributes();
    }

    /**
     * Create an instance of {@link ReleaseModelResponse }
     * 
     */
    public ReleaseModelResponse createReleaseModelResponse() {
        return new ReleaseModelResponse();
    }

    /**
     * Create an instance of {@link AgeGroupCodes }
     * 
     */
    public AgeGroupCodes createAgeGroupCodes() {
        return new AgeGroupCodes();
    }

    /**
     * Create an instance of {@link GetModelResponse }
     * 
     */
    public GetModelResponse createGetModelResponse() {
        return new GetModelResponse();
    }

    /**
     * Create an instance of {@link ModelSeasonIds }
     * 
     */
    public ModelSeasonIds createModelSeasonIds() {
        return new ModelSeasonIds();
    }

    /**
     * Create an instance of {@link CategoryMrktLineCodes }
     * 
     */
    public CategoryMrktLineCodes createCategoryMrktLineCodes() {
        return new CategoryMrktLineCodes();
    }

    /**
     * Create an instance of {@link GetModelsWithFullAttrResponses }
     * 
     */
    public GetModelsWithFullAttrResponses createGetModelsWithFullAttrResponses() {
        return new GetModelsWithFullAttrResponses();
    }

    /**
     * Create an instance of {@link SalesLineCodes }
     * 
     */
    public SalesLineCodes createSalesLineCodes() {
        return new SalesLineCodes();
    }

    /**
     * Create an instance of {@link UpdateMarketingModelRequest }
     * 
     */
    public UpdateMarketingModelRequest createUpdateMarketingModelRequest() {
        return new UpdateMarketingModelRequest();
    }

    /**
     * Create an instance of {@link CorporateMrktLineCodes }
     * 
     */
    public CorporateMrktLineCodes createCorporateMrktLineCodes() {
        return new CorporateMrktLineCodes();
    }

    /**
     * Create an instance of {@link ModelSortCriteria }
     * 
     */
    public ModelSortCriteria createModelSortCriteria() {
        return new ModelSortCriteria();
    }

    /**
     * Create an instance of {@link GetModelsByRangeIdsResponse }
     * 
     */
    public GetModelsByRangeIdsResponse createGetModelsByRangeIdsResponse() {
        return new GetModelsByRangeIdsResponse();
    }

    /**
     * Create an instance of {@link ModelRangeIdsWithRef }
     * 
     */
    public ModelRangeIdsWithRef createModelRangeIdsWithRef() {
        return new ModelRangeIdsWithRef();
    }

    /**
     * Create an instance of {@link MoveModelRequests }
     * 
     */
    public MoveModelRequests createMoveModelRequests() {
        return new MoveModelRequests();
    }

    /**
     * Create an instance of {@link GetModelsWithSubsetAttrRequest }
     * 
     */
    public GetModelsWithSubsetAttrRequest createGetModelsWithSubsetAttrRequest() {
        return new GetModelsWithSubsetAttrRequest();
    }

    /**
     * Create an instance of {@link DuplicateModelResponse }
     * 
     */
    public DuplicateModelResponse createDuplicateModelResponse() {
        return new DuplicateModelResponse();
    }

    /**
     * Create an instance of {@link DeleteModelRequests }
     * 
     */
    public DeleteModelRequests createDeleteModelRequests() {
        return new DeleteModelRequests();
    }

    /**
     * Create an instance of {@link UpdateModelRequest }
     * 
     */
    public UpdateModelRequest createUpdateModelRequest() {
        return new UpdateModelRequest();
    }

    /**
     * Create an instance of {@link DeleteModelResponse }
     * 
     */
    public DeleteModelResponse createDeleteModelResponse() {
        return new DeleteModelResponse();
    }

    /**
     * Create an instance of {@link CreateNewModels.CreateModel }
     * 
     */
    public CreateNewModels.CreateModel createCreateNewModelsCreateModel() {
        return new CreateNewModels.CreateModel();
    }

    /**
     * Create an instance of {@link GetModelRequest }
     * 
     */
    public GetModelRequest createGetModelRequest() {
        return new GetModelRequest();
    }

    /**
     * Create an instance of {@link CopyModelResponse }
     * 
     */
    public CopyModelResponse createCopyModelResponse() {
        return new CopyModelResponse();
    }

    /**
     * Create an instance of {@link GetTechModelIdRequests }
     * 
     */
    public GetTechModelIdRequests createGetTechModelIdRequests() {
        return new GetTechModelIdRequests();
    }

    /**
     * Create an instance of {@link GetModelsWithSubsetAttrResponses }
     * 
     */
    public GetModelsWithSubsetAttrResponses createGetModelsWithSubsetAttrResponses() {
        return new GetModelsWithSubsetAttrResponses();
    }

    /**
     * Create an instance of {@link MacroModel }
     * 
     */
    public MacroModel createMacroModel() {
        return new MacroModel();
    }

    /**
     * Create an instance of {@link ProductGroupCodes }
     * 
     */
    public ProductGroupCodes createProductGroupCodes() {
        return new ProductGroupCodes();
    }

    /**
     * Create an instance of {@link GetModelsByRangeIdsRequest }
     * 
     */
    public GetModelsByRangeIdsRequest createGetModelsByRangeIdsRequest() {
        return new GetModelsByRangeIdsRequest();
    }

    /**
     * Create an instance of {@link CarryOverModelRequests }
     * 
     */
    public CarryOverModelRequests createCarryOverModelRequests() {
        return new CarryOverModelRequests();
    }

    /**
     * Create an instance of {@link ModelRangeIdsWithRef.ModelRangeId }
     * 
     */
    public ModelRangeIdsWithRef.ModelRangeId createModelRangeIdsWithRefModelRangeId() {
        return new ModelRangeIdsWithRef.ModelRangeId();
    }

    /**
     * Create an instance of {@link MoveModelResponse }
     * 
     */
    public MoveModelResponse createMoveModelResponse() {
        return new MoveModelResponse();
    }

    /**
     * Create an instance of {@link GetModelsByIdResponses }
     * 
     */
    public GetModelsByIdResponses createGetModelsByIdResponses() {
        return new GetModelsByIdResponses();
    }

    /**
     * Create an instance of {@link ReleaseModelRequests }
     * 
     */
    public ReleaseModelRequests createReleaseModelRequests() {
        return new ReleaseModelRequests();
    }

    /**
     * Create an instance of {@link ProductTypeCodes }
     * 
     */
    public ProductTypeCodes createProductTypeCodes() {
        return new ProductTypeCodes();
    }

    /**
     * Create an instance of {@link GetModelRangeAttrsResponse }
     * 
     */
    public GetModelRangeAttrsResponse createGetModelRangeAttrsResponse() {
        return new GetModelRangeAttrsResponse();
    }

    /**
     * Create an instance of {@link ModelRangeAttrNames }
     * 
     */
    public ModelRangeAttrNames createModelRangeAttrNames() {
        return new ModelRangeAttrNames();
    }

    /**
     * Create an instance of {@link CarryOverModelResponse }
     * 
     */
    public CarryOverModelResponse createCarryOverModelResponse() {
        return new CarryOverModelResponse();
    }

    /**
     * Create an instance of {@link DuplicateModelRequest }
     * 
     */
    public DuplicateModelRequest createDuplicateModelRequest() {
        return new DuplicateModelRequest();
    }

    /**
     * Create an instance of {@link SportsCategoryCodes }
     * 
     */
    public SportsCategoryCodes createSportsCategoryCodes() {
        return new SportsCategoryCodes();
    }

    /**
     * Create an instance of {@link UpdateMarketingModelResponse }
     * 
     */
    public UpdateMarketingModelResponse createUpdateMarketingModelResponse() {
        return new UpdateMarketingModelResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "deleteModelResponse")
    public JAXBElement<DeleteModelResponse> createDeleteModelResponse(DeleteModelResponse value) {
        return new JAXBElement<DeleteModelResponse>(_DeleteModelResponse_QNAME, DeleteModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsByRangeIdsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsByRangeIdsRequest")
    public JAXBElement<GetModelsByRangeIdsRequest> createGetModelsByRangeIdsRequest(GetModelsByRangeIdsRequest value) {
        return new JAXBElement<GetModelsByRangeIdsRequest>(_GetModelsByRangeIdsRequest_QNAME, GetModelsByRangeIdsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsWithFullAttrResponses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsWithFullAttrResponses")
    public JAXBElement<GetModelsWithFullAttrResponses> createGetModelsWithFullAttrResponses(GetModelsWithFullAttrResponses value) {
        return new JAXBElement<GetModelsWithFullAttrResponses>(_GetModelsWithFullAttrResponses_QNAME, GetModelsWithFullAttrResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "genderCodes")
    public JAXBElement<GenderCodes> createGenderCodes(GenderCodes value) {
        return new JAXBElement<GenderCodes>(_GenderCodes_QNAME, GenderCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsByIdResponses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsByIdResponses")
    public JAXBElement<GetModelsByIdResponses> createGetModelsByIdResponses(GetModelsByIdResponses value) {
        return new JAXBElement<GetModelsByIdResponses>(_GetModelsByIdResponses_QNAME, GetModelsByIdResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductTypeCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "productTypeCodes")
    public JAXBElement<ProductTypeCodes> createProductTypeCodes(ProductTypeCodes value) {
        return new JAXBElement<ProductTypeCodes>(_ProductTypeCodes_QNAME, ProductTypeCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseModelRequests }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "releaseModelRequests")
    public JAXBElement<ReleaseModelRequests> createReleaseModelRequests(ReleaseModelRequests value) {
        return new JAXBElement<ReleaseModelRequests>(_ReleaseModelRequests_QNAME, ReleaseModelRequests.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsWithFullAttrRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsWithFullAttrRequest")
    public JAXBElement<GetModelsWithFullAttrRequest> createGetModelsWithFullAttrRequest(GetModelsWithFullAttrRequest value) {
        return new JAXBElement<GetModelsWithFullAttrRequest>(_GetModelsWithFullAttrRequest_QNAME, GetModelsWithFullAttrRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsByIdRequest")
    public JAXBElement<GetModelsByIdRequest> createGetModelsByIdRequest(GetModelsByIdRequest value) {
        return new JAXBElement<GetModelsByIdRequest>(_GetModelsByIdRequest_QNAME, GetModelsByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "copyModelResponse")
    public JAXBElement<CopyModelResponse> createCopyModelResponse(CopyModelResponse value) {
        return new JAXBElement<CopyModelResponse>(_CopyModelResponse_QNAME, CopyModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelRangeIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "modelRangeIds")
    public JAXBElement<ModelRangeIds> createModelRangeIds(ModelRangeIds value) {
        return new JAXBElement<ModelRangeIds>(_ModelRangeIds_QNAME, ModelRangeIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsWithSubsetAttrRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsWithSubsetAttrRequest")
    public JAXBElement<GetModelsWithSubsetAttrRequest> createGetModelsWithSubsetAttrRequest(GetModelsWithSubsetAttrRequest value) {
        return new JAXBElement<GetModelsWithSubsetAttrRequest>(_GetModelsWithSubsetAttrRequest_QNAME, GetModelsWithSubsetAttrRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SportsCategoryCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "sportsCategoryCodes")
    public JAXBElement<SportsCategoryCodes> createSportsCategoryCodes(SportsCategoryCodes value) {
        return new JAXBElement<SportsCategoryCodes>(_SportsCategoryCodes_QNAME, SportsCategoryCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroupCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "productGroupCodes")
    public JAXBElement<ProductGroupCodes> createProductGroupCodes(ProductGroupCodes value) {
        return new JAXBElement<ProductGroupCodes>(_ProductGroupCodes_QNAME, ProductGroupCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "createNewModelResponse")
    public JAXBElement<CreateNewModelResponse> createCreateNewModelResponse(CreateNewModelResponse value) {
        return new JAXBElement<CreateNewModelResponse>(_CreateNewModelResponse_QNAME, CreateNewModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelRangeAttrsByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelRangeAttrsByIdRequest")
    public JAXBElement<GetModelRangeAttrsByIdRequest> createGetModelRangeAttrsByIdRequest(GetModelRangeAttrsByIdRequest value) {
        return new JAXBElement<GetModelRangeAttrsByIdRequest>(_GetModelRangeAttrsByIdRequest_QNAME, GetModelRangeAttrsByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGroupCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "ageGroupCodes")
    public JAXBElement<AgeGroupCodes> createAgeGroupCodes(AgeGroupCodes value) {
        return new JAXBElement<AgeGroupCodes>(_AgeGroupCodes_QNAME, AgeGroupCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelResponse")
    public JAXBElement<GetModelResponse> createGetModelResponse(GetModelResponse value) {
        return new JAXBElement<GetModelResponse>(_GetModelResponse_QNAME, GetModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelRangeAttrsByIdResponses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelRangeAttrsByIdResponses")
    public JAXBElement<GetModelRangeAttrsByIdResponses> createGetModelRangeAttrsByIdResponses(GetModelRangeAttrsByIdResponses value) {
        return new JAXBElement<GetModelRangeAttrsByIdResponses>(_GetModelRangeAttrsByIdResponses_QNAME, GetModelRangeAttrsByIdResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevelopmentTypeCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "developmentTypeCodes")
    public JAXBElement<DevelopmentTypeCodes> createDevelopmentTypeCodes(DevelopmentTypeCodes value) {
        return new JAXBElement<DevelopmentTypeCodes>(_DevelopmentTypeCodes_QNAME, DevelopmentTypeCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsByRangeIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsByRangeIdsResponse")
    public JAXBElement<GetModelsByRangeIdsResponse> createGetModelsByRangeIdsResponse(GetModelsByRangeIdsResponse value) {
        return new JAXBElement<GetModelsByRangeIdsResponse>(_GetModelsByRangeIdsResponse_QNAME, GetModelsByRangeIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesLineCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "salesLineCodes")
    public JAXBElement<SalesLineCodes> createSalesLineCodes(SalesLineCodes value) {
        return new JAXBElement<SalesLineCodes>(_SalesLineCodes_QNAME, SalesLineCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "updateModelResponse")
    public JAXBElement<UpdateModelResponse> createUpdateModelResponse(UpdateModelResponse value) {
        return new JAXBElement<UpdateModelResponse>(_UpdateModelResponse_QNAME, UpdateModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryMrktLineCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "categoryMrktLineCodes")
    public JAXBElement<CategoryMrktLineCodes> createCategoryMrktLineCodes(CategoryMrktLineCodes value) {
        return new JAXBElement<CategoryMrktLineCodes>(_CategoryMrktLineCodes_QNAME, CategoryMrktLineCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevLocationCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "devLocationCodes")
    public JAXBElement<DevLocationCodes> createDevLocationCodes(DevLocationCodes value) {
        return new JAXBElement<DevLocationCodes>(_DevLocationCodes_QNAME, DevLocationCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsWithSubsetAttrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsWithSubsetAttrResponse")
    public JAXBElement<GetModelsWithSubsetAttrResponse> createGetModelsWithSubsetAttrResponse(GetModelsWithSubsetAttrResponse value) {
        return new JAXBElement<GetModelsWithSubsetAttrResponse>(_GetModelsWithSubsetAttrResponse_QNAME, GetModelsWithSubsetAttrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsWithSubsetAttrResponses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "getModelsWithSubsetAttrResponses")
    public JAXBElement<GetModelsWithSubsetAttrResponses> createGetModelsWithSubsetAttrResponses(GetModelsWithSubsetAttrResponses value) {
        return new JAXBElement<GetModelsWithSubsetAttrResponses>(_GetModelsWithSubsetAttrResponses_QNAME, GetModelsWithSubsetAttrResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "releaseModelResponse")
    public JAXBElement<ReleaseModelResponse> createReleaseModelResponse(ReleaseModelResponse value) {
        return new JAXBElement<ReleaseModelResponse>(_ReleaseModelResponse_QNAME, ReleaseModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarryOverModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "carryOverModelResponse")
    public JAXBElement<CarryOverModelResponse> createCarryOverModelResponse(CarryOverModelResponse value) {
        return new JAXBElement<CarryOverModelResponse>(_CarryOverModelResponse_QNAME, CarryOverModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicateModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "duplicateModelResponse")
    public JAXBElement<DuplicateModelResponse> createDuplicateModelResponse(DuplicateModelResponse value) {
        return new JAXBElement<DuplicateModelResponse>(_DuplicateModelResponse_QNAME, DuplicateModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorporateMrktLineCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/model", name = "corporateMrktLineCodes")
    public JAXBElement<CorporateMrktLineCodes> createCorporateMrktLineCodes(CorporateMrktLineCodes value) {
        return new JAXBElement<CorporateMrktLineCodes>(_CorporateMrktLineCodes_QNAME, CorporateMrktLineCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userRole", scope = CopyModelRequests.class)
    public JAXBElement<String> createCopyModelRequestsUserRole(String value) {
        return new JAXBElement<String>(_CopyModelRequestsUserRole_QNAME, String.class, CopyModelRequests.class, value);
    }

}
