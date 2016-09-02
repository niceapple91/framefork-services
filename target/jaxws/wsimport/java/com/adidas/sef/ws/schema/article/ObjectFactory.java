
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.adidas.sef.ws.schema.article package. 
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

    private final static QName _GetArticleFullRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "getArticleFullRequest");
    private final static QName _DuplicateArticleResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "duplicateArticleResponse");
    private final static QName _ModelIds_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "modelIds");
    private final static QName _SpeciallUsageCons_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "speciallUsageCons");
    private final static QName _GetArticleByIdRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "getArticleByIdRequest");
    private final static QName _SellingRegionCodes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "sellingRegionCodes");
    private final static QName _GetArticleByIdResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "getArticleByIdResponse");
    private final static QName _CreateArticleResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "createArticleResponse");
    private final static QName _CarryOverArticleResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "carryOverArticleResponse");
    private final static QName _SpecialUsages_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "specialUsages");
    private final static QName _ReleaseArticleRequests_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "releaseArticleRequests");
    private final static QName _UpdateArticleRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "updateArticleRequest");
    private final static QName _CreateArticleRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "createArticleRequest");
    private final static QName _GetArticleFullResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "getArticleFullResponse");
    private final static QName _DeleteArticleResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "deleteArticleResponse");
    private final static QName _ReleaseArticleResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "releaseArticleResponse");
    private final static QName _GetArticleSubRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "getArticleSubRequest");
    private final static QName _DevTypes_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "devTypes");
    private final static QName _GetArticleModelRangeAttrsByIdResponses_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "getArticleModelRangeAttrsByIdResponses");
    private final static QName _UpdateArticleResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "updateArticleResponse");
    private final static QName _GetArticleModelRangeAttrsByIdRequest_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "getArticleModelRangeAttrsByIdRequest");
    private final static QName _GetArticleSubResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "getArticleSubResponse");
    private final static QName _CopyArticleResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "copyArticleResponse");
    private final static QName _ArticleRangeIds_QNAME = new QName("http://www.adidas.com/sef/ws/schema/article", "articleRangeIds");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adidas.sef.ws.schema.article
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarryOverArticleRequests }
     * 
     */
    public CarryOverArticleRequests createCarryOverArticleRequests() {
        return new CarryOverArticleRequests();
    }

    /**
     * Create an instance of {@link GetArticleModelRangeAttrsByIdRequest }
     * 
     */
    public GetArticleModelRangeAttrsByIdRequest createGetArticleModelRangeAttrsByIdRequest() {
        return new GetArticleModelRangeAttrsByIdRequest();
    }

    /**
     * Create an instance of {@link CopyArticleResponse }
     * 
     */
    public CopyArticleResponse createCopyArticleResponse() {
        return new CopyArticleResponse();
    }

    /**
     * Create an instance of {@link GetArticleRequest }
     * 
     */
    public GetArticleRequest createGetArticleRequest() {
        return new GetArticleRequest();
    }

    /**
     * Create an instance of {@link DeleteArticleRequests }
     * 
     */
    public DeleteArticleRequests createDeleteArticleRequests() {
        return new DeleteArticleRequests();
    }

    /**
     * Create an instance of {@link ArticleFullAttributeResponse }
     * 
     */
    public ArticleFullAttributeResponse createArticleFullAttributeResponse() {
        return new ArticleFullAttributeResponse();
    }

    /**
     * Create an instance of {@link SpecialUsageCustomers }
     * 
     */
    public SpecialUsageCustomers createSpecialUsageCustomers() {
        return new SpecialUsageCustomers();
    }

    /**
     * Create an instance of {@link ArticleRangeIds }
     * 
     */
    public ArticleRangeIds createArticleRangeIds() {
        return new ArticleRangeIds();
    }

    /**
     * Create an instance of {@link ReleaseArticleRequests }
     * 
     */
    public ReleaseArticleRequests createReleaseArticleRequests() {
        return new ReleaseArticleRequests();
    }

    /**
     * Create an instance of {@link ArticleAttrsResponse }
     * 
     */
    public ArticleAttrsResponse createArticleAttrsResponse() {
        return new ArticleAttrsResponse();
    }

    /**
     * Create an instance of {@link ReleaseArticleResponse }
     * 
     */
    public ReleaseArticleResponse createReleaseArticleResponse() {
        return new ReleaseArticleResponse();
    }

    /**
     * Create an instance of {@link CopyArticleRequests }
     * 
     */
    public CopyArticleRequests createCopyArticleRequests() {
        return new CopyArticleRequests();
    }

    /**
     * Create an instance of {@link CreateArticleRequest }
     * 
     */
    public CreateArticleRequest createCreateArticleRequest() {
        return new CreateArticleRequest();
    }

    /**
     * Create an instance of {@link UpdateArticleRequests }
     * 
     */
    public UpdateArticleRequests createUpdateArticleRequests() {
        return new UpdateArticleRequests();
    }

    /**
     * Create an instance of {@link GetArticleByIdRequest }
     * 
     */
    public GetArticleByIdRequest createGetArticleByIdRequest() {
        return new GetArticleByIdRequest();
    }

    /**
     * Create an instance of {@link ArticleSubSetResponse }
     * 
     */
    public ArticleSubSetResponse createArticleSubSetResponse() {
        return new ArticleSubSetResponse();
    }

    /**
     * Create an instance of {@link com.adidas.sef.ws.schema.article.DistributionChannels }
     * 
     */
    public com.adidas.sef.ws.schema.article.DistributionChannels createDistributionChannels() {
        return new com.adidas.sef.ws.schema.article.DistributionChannels();
    }

    /**
     * Create an instance of {@link ArticleSort }
     * 
     */
    public ArticleSort createArticleSort() {
        return new ArticleSort();
    }

    /**
     * Create an instance of {@link CreateArticleResponse }
     * 
     */
    public CreateArticleResponse createCreateArticleResponse() {
        return new CreateArticleResponse();
    }

    /**
     * Create an instance of {@link UpdateArticleResponse }
     * 
     */
    public UpdateArticleResponse createUpdateArticleResponse() {
        return new UpdateArticleResponse();
    }

    /**
     * Create an instance of {@link DeleteArticleResponse }
     * 
     */
    public DeleteArticleResponse createDeleteArticleResponse() {
        return new DeleteArticleResponse();
    }

    /**
     * Create an instance of {@link ArticleFullResponse }
     * 
     */
    public ArticleFullResponse createArticleFullResponse() {
        return new ArticleFullResponse();
    }

    /**
     * Create an instance of {@link DevelopmentTypeCodes }
     * 
     */
    public DevelopmentTypeCodes createDevelopmentTypeCodes() {
        return new DevelopmentTypeCodes();
    }

    /**
     * Create an instance of {@link GetArticleModelRangeAttrsResponse }
     * 
     */
    public GetArticleModelRangeAttrsResponse createGetArticleModelRangeAttrsResponse() {
        return new GetArticleModelRangeAttrsResponse();
    }

    /**
     * Create an instance of {@link GetTechArticleIdResponses }
     * 
     */
    public GetTechArticleIdResponses createGetTechArticleIdResponses() {
        return new GetTechArticleIdResponses();
    }

    /**
     * Create an instance of {@link ArticleSortCriteria }
     * 
     */
    public ArticleSortCriteria createArticleSortCriteria() {
        return new ArticleSortCriteria();
    }

    /**
     * Create an instance of {@link CarryOverArticleRequest }
     * 
     */
    public CarryOverArticleRequest createCarryOverArticleRequest() {
        return new CarryOverArticleRequest();
    }

    /**
     * Create an instance of {@link ArtDistributionChannels }
     * 
     */
    public ArtDistributionChannels createArtDistributionChannels() {
        return new ArtDistributionChannels();
    }

    /**
     * Create an instance of {@link ArticleRangeIdsWithRef.ArticleRangeId }
     * 
     */
    public ArticleRangeIdsWithRef.ArticleRangeId createArticleRangeIdsWithRefArticleRangeId() {
        return new ArticleRangeIdsWithRef.ArticleRangeId();
    }

    /**
     * Create an instance of {@link RequiredAttributes }
     * 
     */
    public RequiredAttributes createRequiredAttributes() {
        return new RequiredAttributes();
    }

    /**
     * Create an instance of {@link SpecialUsages }
     * 
     */
    public SpecialUsages createSpecialUsages() {
        return new SpecialUsages();
    }

    /**
     * Create an instance of {@link GetTechArticleIdRequest }
     * 
     */
    public GetTechArticleIdRequest createGetTechArticleIdRequest() {
        return new GetTechArticleIdRequest();
    }

    /**
     * Create an instance of {@link DuplicateArticleRequest }
     * 
     */
    public DuplicateArticleRequest createDuplicateArticleRequest() {
        return new DuplicateArticleRequest();
    }

    /**
     * Create an instance of {@link CreateArticleRequests }
     * 
     */
    public CreateArticleRequests createCreateArticleRequests() {
        return new CreateArticleRequests();
    }

    /**
     * Create an instance of {@link GetTechArticleIdRequests }
     * 
     */
    public GetTechArticleIdRequests createGetTechArticleIdRequests() {
        return new GetTechArticleIdRequests();
    }

    /**
     * Create an instance of {@link CopyArticleRequest }
     * 
     */
    public CopyArticleRequest createCopyArticleRequest() {
        return new CopyArticleRequest();
    }

    /**
     * Create an instance of {@link ArticleSubSet }
     * 
     */
    public ArticleSubSet createArticleSubSet() {
        return new ArticleSubSet();
    }

    /**
     * Create an instance of {@link com.adidas.sef.ws.schema.article.SellingRegionCodes }
     * 
     */
    public com.adidas.sef.ws.schema.article.SellingRegionCodes createSellingRegionCodes() {
        return new com.adidas.sef.ws.schema.article.SellingRegionCodes();
    }

    /**
     * Create an instance of {@link ArticleSeasons }
     * 
     */
    public ArticleSeasons createArticleSeasons() {
        return new ArticleSeasons();
    }

    /**
     * Create an instance of {@link GetArticleModelRangeAttrsByIdResponses }
     * 
     */
    public GetArticleModelRangeAttrsByIdResponses createGetArticleModelRangeAttrsByIdResponses() {
        return new GetArticleModelRangeAttrsByIdResponses();
    }

    /**
     * Create an instance of {@link ArticleModelRangeAttrNames }
     * 
     */
    public ArticleModelRangeAttrNames createArticleModelRangeAttrNames() {
        return new ArticleModelRangeAttrNames();
    }

    /**
     * Create an instance of {@link ModelIds }
     * 
     */
    public ModelIds createModelIds() {
        return new ModelIds();
    }

    /**
     * Create an instance of {@link UpdateArticleRequest }
     * 
     */
    public UpdateArticleRequest createUpdateArticleRequest() {
        return new UpdateArticleRequest();
    }

    /**
     * Create an instance of {@link CreateArticleRequest.DistributionChannels }
     * 
     */
    public CreateArticleRequest.DistributionChannels createCreateArticleRequestDistributionChannels() {
        return new CreateArticleRequest.DistributionChannels();
    }

    /**
     * Create an instance of {@link ArticleRangeIdsWithRef }
     * 
     */
    public ArticleRangeIdsWithRef createArticleRangeIdsWithRef() {
        return new ArticleRangeIdsWithRef();
    }

    /**
     * Create an instance of {@link CarryOverArticleResponse }
     * 
     */
    public CarryOverArticleResponse createCarryOverArticleResponse() {
        return new CarryOverArticleResponse();
    }

    /**
     * Create an instance of {@link CreateArticleRequest.SellingRegionCodes }
     * 
     */
    public CreateArticleRequest.SellingRegionCodes createCreateArticleRequestSellingRegionCodes() {
        return new CreateArticleRequest.SellingRegionCodes();
    }

    /**
     * Create an instance of {@link MultipleStrings }
     * 
     */
    public MultipleStrings createMultipleStrings() {
        return new MultipleStrings();
    }

    /**
     * Create an instance of {@link DuplicateArticleResponse }
     * 
     */
    public DuplicateArticleResponse createDuplicateArticleResponse() {
        return new DuplicateArticleResponse();
    }

    /**
     * Create an instance of {@link UpdateArticleNullAttrs }
     * 
     */
    public UpdateArticleNullAttrs createUpdateArticleNullAttrs() {
        return new UpdateArticleNullAttrs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "getArticleFullRequest")
    public JAXBElement<GetArticleRequest> createGetArticleFullRequest(GetArticleRequest value) {
        return new JAXBElement<GetArticleRequest>(_GetArticleFullRequest_QNAME, GetArticleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicateArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "duplicateArticleResponse")
    public JAXBElement<DuplicateArticleResponse> createDuplicateArticleResponse(DuplicateArticleResponse value) {
        return new JAXBElement<DuplicateArticleResponse>(_DuplicateArticleResponse_QNAME, DuplicateArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "modelIds")
    public JAXBElement<ModelIds> createModelIds(ModelIds value) {
        return new JAXBElement<ModelIds>(_ModelIds_QNAME, ModelIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialUsageCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "speciallUsageCons")
    public JAXBElement<SpecialUsageCustomers> createSpeciallUsageCons(SpecialUsageCustomers value) {
        return new JAXBElement<SpecialUsageCustomers>(_SpeciallUsageCons_QNAME, SpecialUsageCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "getArticleByIdRequest")
    public JAXBElement<GetArticleByIdRequest> createGetArticleByIdRequest(GetArticleByIdRequest value) {
        return new JAXBElement<GetArticleByIdRequest>(_GetArticleByIdRequest_QNAME, GetArticleByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.adidas.sef.ws.schema.article.SellingRegionCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "sellingRegionCodes")
    public JAXBElement<com.adidas.sef.ws.schema.article.SellingRegionCodes> createSellingRegionCodes(com.adidas.sef.ws.schema.article.SellingRegionCodes value) {
        return new JAXBElement<com.adidas.sef.ws.schema.article.SellingRegionCodes>(_SellingRegionCodes_QNAME, com.adidas.sef.ws.schema.article.SellingRegionCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleFullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "getArticleByIdResponse")
    public JAXBElement<ArticleFullResponse> createGetArticleByIdResponse(ArticleFullResponse value) {
        return new JAXBElement<ArticleFullResponse>(_GetArticleByIdResponse_QNAME, ArticleFullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "createArticleResponse")
    public JAXBElement<CreateArticleResponse> createCreateArticleResponse(CreateArticleResponse value) {
        return new JAXBElement<CreateArticleResponse>(_CreateArticleResponse_QNAME, CreateArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarryOverArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "carryOverArticleResponse")
    public JAXBElement<CarryOverArticleResponse> createCarryOverArticleResponse(CarryOverArticleResponse value) {
        return new JAXBElement<CarryOverArticleResponse>(_CarryOverArticleResponse_QNAME, CarryOverArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialUsages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "specialUsages")
    public JAXBElement<SpecialUsages> createSpecialUsages(SpecialUsages value) {
        return new JAXBElement<SpecialUsages>(_SpecialUsages_QNAME, SpecialUsages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseArticleRequests }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "releaseArticleRequests")
    public JAXBElement<ReleaseArticleRequests> createReleaseArticleRequests(ReleaseArticleRequests value) {
        return new JAXBElement<ReleaseArticleRequests>(_ReleaseArticleRequests_QNAME, ReleaseArticleRequests.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArticleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "updateArticleRequest")
    public JAXBElement<UpdateArticleRequest> createUpdateArticleRequest(UpdateArticleRequest value) {
        return new JAXBElement<UpdateArticleRequest>(_UpdateArticleRequest_QNAME, UpdateArticleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateArticleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "createArticleRequest")
    public JAXBElement<CreateArticleRequest> createCreateArticleRequest(CreateArticleRequest value) {
        return new JAXBElement<CreateArticleRequest>(_CreateArticleRequest_QNAME, CreateArticleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleFullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "getArticleFullResponse")
    public JAXBElement<ArticleFullResponse> createGetArticleFullResponse(ArticleFullResponse value) {
        return new JAXBElement<ArticleFullResponse>(_GetArticleFullResponse_QNAME, ArticleFullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "deleteArticleResponse")
    public JAXBElement<DeleteArticleResponse> createDeleteArticleResponse(DeleteArticleResponse value) {
        return new JAXBElement<DeleteArticleResponse>(_DeleteArticleResponse_QNAME, DeleteArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "releaseArticleResponse")
    public JAXBElement<ReleaseArticleResponse> createReleaseArticleResponse(ReleaseArticleResponse value) {
        return new JAXBElement<ReleaseArticleResponse>(_ReleaseArticleResponse_QNAME, ReleaseArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "getArticleSubRequest")
    public JAXBElement<GetArticleRequest> createGetArticleSubRequest(GetArticleRequest value) {
        return new JAXBElement<GetArticleRequest>(_GetArticleSubRequest_QNAME, GetArticleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevelopmentTypeCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "devTypes")
    public JAXBElement<DevelopmentTypeCodes> createDevTypes(DevelopmentTypeCodes value) {
        return new JAXBElement<DevelopmentTypeCodes>(_DevTypes_QNAME, DevelopmentTypeCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleModelRangeAttrsByIdResponses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "getArticleModelRangeAttrsByIdResponses")
    public JAXBElement<GetArticleModelRangeAttrsByIdResponses> createGetArticleModelRangeAttrsByIdResponses(GetArticleModelRangeAttrsByIdResponses value) {
        return new JAXBElement<GetArticleModelRangeAttrsByIdResponses>(_GetArticleModelRangeAttrsByIdResponses_QNAME, GetArticleModelRangeAttrsByIdResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "updateArticleResponse")
    public JAXBElement<UpdateArticleResponse> createUpdateArticleResponse(UpdateArticleResponse value) {
        return new JAXBElement<UpdateArticleResponse>(_UpdateArticleResponse_QNAME, UpdateArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleModelRangeAttrsByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "getArticleModelRangeAttrsByIdRequest")
    public JAXBElement<GetArticleModelRangeAttrsByIdRequest> createGetArticleModelRangeAttrsByIdRequest(GetArticleModelRangeAttrsByIdRequest value) {
        return new JAXBElement<GetArticleModelRangeAttrsByIdRequest>(_GetArticleModelRangeAttrsByIdRequest_QNAME, GetArticleModelRangeAttrsByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleSubSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "getArticleSubResponse")
    public JAXBElement<ArticleSubSetResponse> createGetArticleSubResponse(ArticleSubSetResponse value) {
        return new JAXBElement<ArticleSubSetResponse>(_GetArticleSubResponse_QNAME, ArticleSubSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "copyArticleResponse")
    public JAXBElement<CopyArticleResponse> createCopyArticleResponse(CopyArticleResponse value) {
        return new JAXBElement<CopyArticleResponse>(_CopyArticleResponse_QNAME, CopyArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleRangeIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/article", name = "articleRangeIds")
    public JAXBElement<ArticleRangeIds> createArticleRangeIds(ArticleRangeIds value) {
        return new JAXBElement<ArticleRangeIds>(_ArticleRangeIds_QNAME, ArticleRangeIds.class, null, value);
    }

}
