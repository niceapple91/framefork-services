package com.soap.bussiness.range.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateRangeResponse {

    @XmlElement
    protected Summary summary;
    protected RespSummary createRangeRespSummary;
    protected Errors errors;

}
