package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/30 15:11
 * @version 1.0
 */
@Getter
@Setter
public class AdvanceShipNotices {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * displayNumber
     */
    @JsonProperty("displayNumber")
    private String displayNumber;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * items
     */
    @JsonProperty("items")
    private List<Item> items;
    /**
     * handlingUnit
     */
    @JsonProperty("handlingUnit")
    private HandlingUnit handlingUnit;
    /**
     * labels
     */
    @JsonProperty("labels")
    private Label labels;
    /**
     * shipping
     */
    @JsonProperty("shipping")
    private Shipping shipping;
    /**
     * submittedAt
     */
    @JsonProperty("submittedAt")
    private String submittedAt;
}
