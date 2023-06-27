package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 11:38
 */
@Getter
@Setter
public class CostFlowListPayload extends PagePayload {

    /**
     * 单号类型
     */
    @JsonProperty("number_type")
    private String numberType;
    /**
     * 费用类型
     */
    @JsonProperty("types_of_fee")
    private String typesOfFee;
    /**
     * 流水类型
     */
    @JsonProperty("flow_type")
    private String flowType;
    /**
     * 订单号
     */
    @JsonProperty("order_number")
    private String orderNumber;
    /**
     * 账户编号
     */
    @JsonProperty("account_code")
    private String accountCode;
    /**
     * 业务类型
     */
    @JsonProperty("business_type")
    private Integer businessType;
    /**
     * 业务类型
     */
    @JsonProperty("charge_type")
    private Integer chargeType;
    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 发生开始时间
     */
    @JsonProperty("happen_start_time")
    private String happenStartTime;
    /**
     * 发生结束时间
     */
    @JsonProperty("happen_end_time")
    private String happenEndTime;
    /**
     * 下一页token
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    /**
     * 上一页token
     */
    @JsonProperty("prev_page_token")
    private String prevPageToken;

}
