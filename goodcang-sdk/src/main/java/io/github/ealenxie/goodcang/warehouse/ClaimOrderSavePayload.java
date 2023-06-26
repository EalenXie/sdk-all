package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 16:10
 */
@Getter
@Setter
public class ClaimOrderSavePayload {

    /**
     * 退件参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 退货服务类型
     */
    @JsonProperty("service_type")
    private Integer serviceType;
    /**
     * 认领单号
     */
    @JsonProperty("claim_code")
    private String claimCode;
    /**
     * 商品列表
     */
    @JsonProperty("product_list")
    private List<ClaimOrderProduct> productList;
}
