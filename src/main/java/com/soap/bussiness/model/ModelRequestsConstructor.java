package com.soap.bussiness.model;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import com.adidas.sef.ws.schema.model.*;

/**
 * Created by Администратор on 04.09.2016.
 */
public class ModelRequestsConstructor {

    public CreateNewModels createCreateModelRequest(Map<String,String> attributes, List<CreateNewModels.CreateModel> models){
        CreateNewModels request = new CreateNewModels();
        request.setUserName(attributes.get("username"));
        request.setBusinessProcess(attributes.get("businessProcess"));
        request.setConsumer(attributes.get("consumer"));
        setListModels(request, models);
        return request;
    }

    private CreateNewModels setListModels(CreateNewModels request, List<CreateNewModels.CreateModel> modelsForCreation){
        Class clazz = request.getClass();
        Field f;
        try {
            f = clazz.getDeclaredField("createModel");
            f.setAccessible(true);
            f.set(request, modelsForCreation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return request;
    }

}
