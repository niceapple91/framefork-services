package com.soap.bussinessLogic;

import com.adidas.sef.ws.schema.model.*;
import com.soap.bussiness.dto.RequestHeader;
import com.soap.bussiness.model.ModelAttributesConstructor;
import com.soap.bussiness.model.ModelPropertyReader;
import com.soap.bussiness.model.ModelRequestsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class ModelCreationLogic {

    public CreateNewModels createTNModel(String rangePlanId){
        Map<String, Object> dataForRequest = new HashMap<>();
        ModelPropertyReader reader = new ModelPropertyReader();
        ModelAttributesConstructor attributes2Request = new ModelAttributesConstructor();
        ModelRequestsConstructor requestConstructor = new ModelRequestsConstructor();
        dataForRequest = reader.getModelProperty();
        List<CreateNewModels.CreateModel> models = new ArrayList<>();
        models.add(attributes2Request.createModel(dataForRequest, rangePlanId));
        return requestConstructor.createCreateModelRequest(RequestHeader.getRequestHeader(), models);

    }

}
