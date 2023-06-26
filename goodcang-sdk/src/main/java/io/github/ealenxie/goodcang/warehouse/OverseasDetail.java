package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 10:23
 */
@Getter
@Setter
public class OverseasDetail {
    /**
     * 箱号
     */
    @JsonProperty("box_no")
    private Integer boxNo;
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 箱号
     */
    @JsonProperty("fba_product_code")
    private String fbaProductCode;
    /**
     * 尾程预报数量
     */
    @JsonProperty("overseas_pre_count")
    private Integer overseasPreCount;
    /**
     * 海外端上架数量
     */
    @JsonProperty("overseas_shelves_count")
    private Integer overseasShelvesCount;
    /**
     * 箱唛参考号
     */
    @JsonProperty("reference_box_no")
    private String referenceBoxNo;
    /**
     * 序列号
     */
    @JsonProperty("sn_list")
    private List<SnPayload> snList;
}
