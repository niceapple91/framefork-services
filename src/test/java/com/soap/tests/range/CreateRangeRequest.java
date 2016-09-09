package com.soap.tests.range;

import com.soap.bussiness.dto.CreateSummary;
import com.soap.bussiness.model.ModelRequestsConstructor;
import com.soap.bussiness.transformers.CreateSummaryTransformer;
import com.soap.bussinessLogic.ArticleCreationLogic;
import com.soap.bussinessLogic.ModelCreationLogic;
import com.soap.bussinessLogic.RangeCreationLogic;
import com.soap.client.ArticleWsClient;
import com.soap.client.ModelWsClient;
import com.soap.client.RangeWsClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateRangeRequest {

    private RangeWsClient cl;
    private ModelWsClient clModel;
    private ArticleWsClient clArticle;
    private CreateSummaryTransformer summaryTransformer;

    @BeforeMethod
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-cl-cxf.xml");
        cl = new RangeWsClient(context.getBean("range"));
        clModel = new ModelWsClient(context.getBean("model"));
        clArticle = new ArticleWsClient(context.getBean("article"));
        summaryTransformer = new CreateSummaryTransformer();
    }

    @Test
    public void creteRange(){
        RangeCreationLogic rangeLogic = new RangeCreationLogic();
        ModelCreationLogic modelLogic = new ModelCreationLogic();
        ArticleCreationLogic articleLogic = new ArticleCreationLogic();
        CreateSummary rangeCreateSummary = summaryTransformer.create(cl.createRanges(rangeLogic.createDefaultRange()));
        System.out.println(rangeCreateSummary.getSummaryMessage());
        CreateSummary modelCreateSummary = summaryTransformer.create(clModel.createModels(modelLogic.createTNModel(rangeCreateSummary.getReferenceId().get(0))));
        System.out.println(modelCreateSummary.getSummaryMessage());
        CreateSummary articleCreateSummary = summaryTransformer.create(clArticle.createArticles(articleLogic.createTNArticle(modelCreateSummary.getReferenceId().get(0))));
    }
}
