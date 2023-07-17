package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 10:44
 */
@Getter
@Setter
public class ReturnOrderVoidResult {
    /**
     * organizationId
     */
    @JsonProperty("organizationId")
    private String organizationId;
    /**
     * createdby
     */
    @JsonProperty("createdby")
    private String createdby;
    /**
     * created
     */
    @JsonProperty("created")
    private String created;
    /**
     * updatedby
     */
    @JsonProperty("updatedby")
    private String updatedby;
    /**
     * updated
     */
    @JsonProperty("updated")
    private String updated;
    /**
     * isActive
     */
    @JsonProperty("isActive")
    private String isActive;
    /**
     * isDelete
     */
    @JsonProperty("isDelete")
    private String isDelete;
    /**
     * returnGoodsOrder
     */
    @JsonProperty("returnGoodsOrder")
    private String returnGoodsOrder;
    /**
     * result
     */
    @JsonProperty("result")
    private String result;
    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
}
