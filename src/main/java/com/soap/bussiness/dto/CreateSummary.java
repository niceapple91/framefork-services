package com.soap.bussiness.dto;

import java.util.List;

/**
 * Created by Администратор on 04.09.2016.
 */
public class CreateSummary {

    public String getSummaryMessage() {
        return summaryMessage;
    }

    public void setSummaryMessage(String summaryMessage) {
        this.summaryMessage = summaryMessage;
    }

    public List<String> getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(List<String> referenceId) {
        this.referenceId = referenceId;
    }

    public List<String> getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(List<String> errorDetails) {
        this.errorDetails = errorDetails;
    }

    private String summaryMessage;
    private List<String> referenceId;
    private List<String>errorDetails;



}
