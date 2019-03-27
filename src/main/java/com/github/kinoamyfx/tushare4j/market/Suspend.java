package com.github.kinoamyfx.tushare4j.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Suspend {

    @JsonProperty("ts_code")
    private String tsCode;

    @JsonProperty("suspend_date")
    private String suspendDate;

    @JsonProperty("resume_date")
    private String resumeDate;

    @JsonProperty("ann_date")
    private String annDate;

    @JsonProperty("suspend_reason")
    private String suspendReason;


    @JsonProperty("reason_type")
    private String reasonType;
}
