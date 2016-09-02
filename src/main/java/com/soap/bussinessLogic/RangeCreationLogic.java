package com.soap.bussinessLogic;

import com.soap.bussiness.range.RangeAttributesConstructor;
import com.soap.bussiness.range.RangePropertyReader;
import com.soap.bussiness.range.RangeRequestsConstructor;
import com.soap.bussiness.range.productmanager.ProductManagerConstructor;
import com.adidas.sef.ws.schema.range.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RangeCreationLogic {

    public CreateRangePlans createDefaultRange(){
        Map<String, Object> dataForRequest = new HashMap<>();
        RangePropertyReader reader = new RangePropertyReader();
        ProductManagerConstructor managers = new ProductManagerConstructor();
        RangeAttributesConstructor attributes2Request = new RangeAttributesConstructor();
        RangeRequestsConstructor requestConstructor = new RangeRequestsConstructor();
        dataForRequest = reader.getRangeProperty();
        dataForRequest.put("productManagers",managers.getProductManager());
        List<CreateRangeRequest> ranges = new ArrayList<>();
        ranges.add(attributes2Request.createRange(dataForRequest));
        return requestConstructor.createCreateRangeRequest(reader.getRequestHeader(), ranges);

    }

}
