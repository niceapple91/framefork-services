package com.soap.bussiness.article;

import java.util.List;
import java.util.Map;
import com.adidas.sef.ws.schema.article.*;

public class ArticleRequestConstructor {

    public CreateArticleRequests createCreateArticleRequest(Map<String,String> attributes, CreateArticleRequest articles){
        CreateArticleRequests request = new CreateArticleRequests();
        request.setUserName(attributes.get("username"));
        request.setBusinessProcess(attributes.get("businessProcess"));
        request.setConsumer(attributes.get("consumer"));
        request.getCreateArticleRequest().add(articles);
        setListModels(request, models);
        return request;
    }

}
