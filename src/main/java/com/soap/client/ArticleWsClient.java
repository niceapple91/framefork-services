package com.soap.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Component;
import com.adidas.sef.ws.*;
import com.adidas.sef.ws.schema.article.*;

@Component
public class ArticleWsClient {

    private JaxWsProxyFactoryBean factory;

    private ArticleWs client;

    public ArticleWsClient() {
    }

    public ArticleWsClient(Object object){
        this.factory = (JaxWsProxyFactoryBean)object;
        client = (ArticleWs) factory.create();
    }

    public ArticleFullResponse getArticlesById(GetArticleByIdRequest request){
        try{
            return client.getArticlesById(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public ArticleSubSetResponse getArticlesBySubSetAttr(GetArticleRequest request){
        try{
            return client.getArticlesBySubSetAttr(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public GetTechArticleIdResponses getTechArticleIds(GetTechArticleIdRequests request){
        try{
            return client.getTechArticleIds(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public ReleaseArticleResponse releaseArticles(ReleaseArticleRequests request){
        try{
            return client.releaseArticles(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public UpdateArticleResponse updateArticles(UpdateArticleRequests request){
        try{
            return client.updateArticles(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public CopyArticleResponse copyArticle(CopyArticleRequests request){
        try{
            return client.copyArticle(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public CreateArticleResponse createArticles(CreateArticleRequests request){
        try{
            return client.createArticles(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public DeleteArticleResponse deleteArticles(DeleteArticleRequests request){
        try{
            return client.deleteArticles(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public DuplicateArticleResponse duplicateArticle(DuplicateArticleRequest request){
        try{
            return client.duplicateArticle(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public CarryOverArticleResponse carryOverArticle(CarryOverArticleRequests request){
        try{
            return client.carryOverArticle(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public GetArticleModelRangeAttrsByIdResponses getArticleModelRangeAttrsById(GetArticleModelRangeAttrsByIdRequest request){
        try{
            return client.getArticleModelRangeAttrsById(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public ArticleFullResponse getArticlesByFullSetAttr(GetArticleRequest request){
        try{
            return client.getArticlesByFullSetAttr(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

}
