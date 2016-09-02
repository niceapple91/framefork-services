package com.soap.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Component;
import com.adidas.sef.ws.*;
import com.adidas.sef.ws.schema.model.*;

@Component
public class ModelWsClient {

    private JaxWsProxyFactoryBean factory;

    private ModelWs client;

    public ModelWsClient() {
    }

    public ModelWsClient(Object object){
        this.factory = (JaxWsProxyFactoryBean)object;
        client = (ModelWs) factory.create();
    }

     public GetModelsByIdResponses getModelsById(GetModelsByIdRequest request){
         try{
         return client.getModelsById(request);
         } catch(SystemExcellenceFaultMessage exception){
             exception.getFaultInfo();
         }
         return null;
     }

    public GetModelsWithFullAttrResponses getModelsWithFullAttr(GetModelsWithFullAttrRequest request){
        try{
            return client.getModelsWithFullAttr(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public GetModelRangeAttrsByIdResponses getModelRangeAttrsById(GetModelRangeAttrsByIdRequest request){
        try{
            return client.getModelRangeAttrsById(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public CopyModelResponse copyModels(CopyModelRequests request){
        try{
            return client.copyModels(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public GetModelsByRangeIdsResponse getModelsByRangeIds(GetModelsByRangeIdsRequest request){
        try{
            return client.getModelsByRangeIds(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public MoveModelResponse moveModels(MoveModelRequests request){
        try{
            return client.moveModels(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public CreateNewModelResponse createModels(CreateNewModels request){
        try{
            return client.createModels(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public DuplicateModelResponse duplicateModel(DuplicateModelRequest request){
        try{
            return client.duplicateModel(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public UpdateModelResponse updateModels(UpdateModelRequests request){
        try{
            return client.updateModels(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public GetModelsWithSubsetAttrResponses getModelsWithSubsetAttr(GetModelsWithSubsetAttrRequest request){
        try{
            return client.getModelsWithSubsetAttr(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public GetTechModelIdResponses getTechModelIds(GetTechModelIdRequests request){
        try{
            return client.getTechModelIds(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public ReleaseModelResponse releaseModels(ReleaseModelRequests request){
        try{
            return client.releaseModels(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public CarryOverModelResponse carryOverModels(CarryOverModelRequests request){
        try{
            return client.carryOverModels(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public DeleteModelResponse deleteModels(DeleteModelRequests request){
        try{
            return client.deleteModels(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

    public UpdateMarketingModelResponse updateMarketingModel(UpdateMarketingModelRequest request){
        try{
            return client.updateMarketingModel(request);
        } catch(SystemExcellenceFaultMessage exception){
            exception.getFaultInfo();
        }
        return null;
    }

}
