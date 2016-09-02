package com.soap.bussiness.range.dto;

import javax.xml.bind.annotation.XmlElement;

public class RespSummary {

    public Success getSuccess() {
        return success;
    }

    public void setSuccess(Success success) {
        this.success = success;
    }

    @XmlElement
    protected Success success;
}
