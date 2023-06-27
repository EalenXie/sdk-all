package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 17:10
 */
@Getter
@Setter
public class PlanOrderCreatePayload {

    /**
     * 发货仓库
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 目的仓类型
     */
    @JsonProperty("dest_warehouse_type")
    private Integer destWarehouseType;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 换标服务
     */
    @JsonProperty("is_change_label")
    private Integer isChangeLabel;
    /**
     * 换标要求
     */
    @JsonProperty("label_replacement_option")
    private Integer labelReplacementOption;
    /**
     * 贴标服务
     */
    @JsonProperty("is_stick_label")
    private Integer isStickLabel;
    /**
     * 商品明细
     */
    @JsonProperty("order_product_list")
    private List<PlanOrderProduct> orderProductList;
}
