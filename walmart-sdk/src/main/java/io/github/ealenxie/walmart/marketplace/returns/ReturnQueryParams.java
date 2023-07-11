package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 10:06
 * @version 1.0
 */
@Getter
@Setter
public class ReturnQueryParams {
    /**
     * returnOrderId
     */
    @JsonProperty("returnOrderId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String returnOrderId;
    /**
     * customerOrderId
     */
    @JsonProperty("customerOrderId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String customerOrderId;
    /**
     * status
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    /**
     * replacementInfo
     */
    @JsonProperty("replacementInfo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String replacementInfo;
    /**
     * returnType
     */
    @JsonProperty("returnType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String returnType;
    /**
     * returnCreationStartDate
     */
    @JsonProperty("returnCreationStartDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String returnCreationStartDate;
    /**
     * returnCreationEndDate
     */
    @JsonProperty("returnCreationEndDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String returnCreationEndDate;
    /**
     * returnLastModifiedStartDate
     */
    @JsonProperty("returnLastModifiedStartDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String returnLastModifiedStartDate;
    /**
     * returnLastModifiedEndDate
     */
    @JsonProperty("returnLastModifiedEndDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String returnLastModifiedEndDate;
    /**
     * limit
     */
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;
}
