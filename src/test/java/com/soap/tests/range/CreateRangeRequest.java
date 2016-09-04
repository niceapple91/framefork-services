package com.soap.tests.range;

import com.soap.bussinessLogic.RangeCreationLogic;
import com.soap.client.RangeWsClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateRangeRequest {

    RangeWsClient cl;

    @BeforeMethod
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-cl-cxf.xml");
        cl = new RangeWsClient(context.getBean("range"));
    }

    @Test
    public void creteRange(){
        RangeCreationLogic rangeLogic = new RangeCreationLogic();
        System.out.println((cl.createRanges(rangeLogic.createDefaultRange()).getSummary().getSummaryMessage()));

    }
}
