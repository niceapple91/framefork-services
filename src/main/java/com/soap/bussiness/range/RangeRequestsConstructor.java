package com.soap.bussiness.range;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import com.adidas.sef.ws.schema.range.*;

public class   RangeRequestsConstructor {

            public CreateRangePlans createCreateRangeRequest(Map<String,String> attributes, List<CreateRangeRequest> ranges){
                CreateRangePlans request = new CreateRangePlans();
                request.setUserName(attributes.get("username"));
                request.setBusinessProcess(attributes.get("businessProcess"));
                request.setConsumer(attributes.get("consumer"));
                setListRanges(request, ranges);
                return request;
            }

            private CreateRangePlans setListRanges(CreateRangePlans request, List<CreateRangeRequest> rangesForCreation){
                Class clazz = request.getClass();
                Field f;
                try {
                    f = clazz.getDeclaredField("createRangeRequest");
                    f.setAccessible(true);
                    f.set(request, rangesForCreation);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return request;
            }

}
