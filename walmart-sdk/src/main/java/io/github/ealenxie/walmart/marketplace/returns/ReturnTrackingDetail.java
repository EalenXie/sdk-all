package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.NameValuePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class ReturnTrackingDetail {
    /**
     * sequenceNo
     */
    @JsonProperty("sequenceNo")
    private Integer sequenceNo;
    /**
     * eventTag
     */
    @JsonProperty("eventTag")
    private String eventTag;
    /**
     * eventDescription
     */
    @JsonProperty("eventDescription")
    private String eventDescription;
    /**
     * eventTime
     */
    @JsonProperty("eventTime")
    private String eventTime;
    /**
     * references
     */
    @JsonProperty("references")
    private List<NameValuePayload> references;
}
