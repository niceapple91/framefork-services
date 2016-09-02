package com.soap.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Component;
import com.adidas.sef.ws.*;
import com.adidas.sef.ws.schema.range.*;

@Component
public class RangeWsClient {

    private JaxWsProxyFactoryBean factory;

    private RangeWs client;

    public RangeWsClient() {
    }

    public RangeWsClient(Object object){
        this.factory = (JaxWsProxyFactoryBean)object;
        client = (RangeWs) factory.create();
    }

    public GetRangesByIdResponses getRangesById(GetRangesByIdRequest request){
        try{
            return client.getRangesById(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public DeleteRangeOwnerResponse deleteRangesOwners(DeleteRangeOwnerRequests request){
        try{
            return client.deleteRangesOwners(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public GetTechRangeIdResponses getTechRangeIds(GetTechRangeIdRequests request){
        try{
            return client.getTechRangeIds(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public UpdateRangeResponse updateRanges(UpdateRangeRequests request){
        try{
            return client.updateRanges(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public CreateRangeResponse createRanges(CreateRangePlans request){
        try{
            return client.createRanges(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public DeleteRangeResponse deleteRanges(DeleteRangeRequests request){
        try{
            return client.deleteRanges(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public GetRangesWithSubsetAttrResponses getRangesWithSubsetAttr(GetRangesWithSubsetAttrRequest request){
        try{
            return client.getRangesWithSubsetAttr(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

}
