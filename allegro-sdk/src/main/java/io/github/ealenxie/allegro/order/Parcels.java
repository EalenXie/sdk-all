package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:21
 * @version 1.0
 */
@Getter
@Setter
public class Parcels {
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * waybill
     */
    @JsonProperty("waybill")
    private String waybill;
    /**
     * carrierId
     */
    @JsonProperty("carrierId")
    private String carrierId;
    /**
     * sender
     */
    @JsonProperty("sender")
    private Sender sender;
}
