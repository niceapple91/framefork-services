package com.soap.bussinessLogic;

import com.soap.bussiness.article.ArticlePropertyReader;
import com.soap.bussiness.article.ArticleRequestConstructor;
import com.soap.bussiness.article.ArticlesAttributesConstructor;
import com.soap.bussiness.dto.RequestHeader;
import com.soap.bussiness.model.ModelRequestsConstructor;
import com.adidas.sef.ws.schema.article.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.soap.bussiness.dto.RequestHeader.*;

public class ArticleCreationLogic {

    public CreateArticleRequests createTNArticle(String modelRangeId){
        Map<String, Object> dataForRequest = new HashMap<>();
        ArticlePropertyReader reader = new ArticlePropertyReader();
        ArticlesAttributesConstructor attributes2Request = new ArticlesAttributesConstructor();
        ArticleRequestConstructor requestConstructor = new ArticleRequestConstructor();
        dataForRequest = reader.getArticleProperty();
        return requestConstructor.createCreateArticleRequest(getRequestHeader(), attributes2Request.createArticle(dataForRequest, modelRangeId));

    }

}
