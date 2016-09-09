package com.soap.bussiness.transformers;

/**
 * Created by Администратор on 04.09.2016.
 */

import com.adidas.sef.ws.schema.range.*;
import com.adidas.sef.ws.schema.model.*;
import com.adidas.sef.ws.schema.article.*;
import com.adidas.sef.ws.schema.common.*;
import com.adidas.sef.ws.schema.common.Error;
import com.soap.bussiness.dto.CreateSummary;

import java.util.ArrayList;
import java.util.List;

public class CreateSummaryTransformer {

    public CreateSummary create(CreateRangeResponse createResponse) {
        CreateSummary summary = new CreateSummary();
        summary.setSummaryMessage(createResponse.getSummary().getSummaryMessage());
        if (createResponse.getCreateRangeRespSummary() != null) {
            summary.setReferenceId(createResponse.getCreateRangeRespSummary().getSuccess().getReferenceId().getId());
        }
        if (createResponse.getErrors() != null) {
            List<Error> errors = createResponse.getErrors().getError();
            List<String> errorMessages = new ArrayList();
            if (errors != null && !errors.isEmpty()) {
                for (Error error : errors) {
                    List<ErrorDetails> errorDetails = error.getErrorDetails();
                    if (errorDetails != null && !errorDetails.isEmpty()) {
                        for (ErrorDetails errorDetail : errorDetails) {
                            errorMessages.add(errorDetail.getErrorMessage());
                        }
                    }
                }
                summary.setErrorDetails(errorMessages);
            }
        }
        return summary;
    }

    public CreateSummary create(CreateNewModelResponse createResponse) {
        CreateSummary summary = new CreateSummary();
        summary.setSummaryMessage(createResponse.getSummary().getSummaryMessage());
        if (createResponse.getCreateNewModelrespSummary() != null) {
            summary.setReferenceId(createResponse.getCreateNewModelrespSummary().getSuccess().getReferenceId().getId());
        }
        if (createResponse.getErrors() != null) {
            List<Error> errors = createResponse.getErrors().getError();
            List<String> errorMessages = new ArrayList();
            if (errors != null && !errors.isEmpty()) {
                for (Error error : errors) {
                    List<ErrorDetails> errorDetails = error.getErrorDetails();
                    if (errorDetails != null && !errorDetails.isEmpty()) {
                        for (ErrorDetails errorDetail : errorDetails) {
                            errorMessages.add(errorDetail.getErrorMessage());
                        }
                    }
                }
                summary.setErrorDetails(errorMessages);
            }
        }
        return summary;
    }

    public CreateSummary create(CreateArticleResponse createResponse) {
        CreateSummary summary = new CreateSummary();
        summary.setSummaryMessage(createResponse.getSummary().getSummaryMessage());
        if (createResponse.getCreateArticleRespSummary() != null) {
            summary.setReferenceId(createResponse.getCreateArticleRespSummary().getSuccess().getReferenceId().getId());
        }
        if (createResponse.getErrors() != null) {
            List<Error> errors = createResponse.getErrors().getError();
            List<String> errorMessages = new ArrayList();
            if (errors != null && !errors.isEmpty()) {
                for (Error error : errors) {
                    List<ErrorDetails> errorDetails = error.getErrorDetails();
                    if (errorDetails != null && !errorDetails.isEmpty()) {
                        for (ErrorDetails errorDetail : errorDetails) {
                            errorMessages.add(errorDetail.getErrorMessage());
                        }
                    }
                }
                summary.setErrorDetails(errorMessages);
            }
        }
        return summary;
    }
}
