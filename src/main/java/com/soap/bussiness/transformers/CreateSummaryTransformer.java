package com.soap.bussiness.transformers;

/**
 * Created by Администратор on 04.09.2016.
 */

import com.adidas.sef.ws.schema.range.*;
import com.adidas.sef.ws.schema.common.*;
import com.soap.bussiness.dto.CreateSummary;

import java.util.ArrayList;
import java.util.List;

public class CreateSummaryTransformer {

    public CreateSummary create(CreateRangeReesponse createResponse){
        CreateSummary summary = new CreateSummary();
        summary.setSummaryMessage(createResponse.getSummary().getSummaryMessage());
        summary.setReferenceId(createResponse.getCreateRangeRespSummary().getSuccess().getReferenceId().getId());
        List<ErrorDetails> errorDetails = createResponse.getErrors().getError().getErrorDetails();
        List<String> errorMessages = new ArrayList();
        if (errorDetails != null && !errorDetails.isEmpty()) {
            for (ErrorDetails errorDetail : errorDetails) {
                errorMessages.add(errorDetail.getErrorMessage());
            }
        }
        summary.setErrorDetails(errorMessages);
    }
}
