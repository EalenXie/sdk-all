package io.github.ealenxie.fop.grs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/27 15:13
 */
@Getter
@Setter
public class RmaInfoCreate {

    /**
     * 客户Id
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * 客户自定义的预报参考号，通常是客户的内部单号
     * <p>
     * 如：客户内部的rma或调拨单等单号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * GRS收货仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * GRS仓库提供的服务产品代码
     */
    @JsonProperty("services_product_code")
    private String servicesProductCode;

    /**
     * 客户退到grs收货仓库商品的物流跟踪单号
     */
    @JsonProperty("received_shipping_no")
    private String receivedShippingNo;

    /**
     * 客户退到grs收货仓库商品的重量
     * <p>
     * 单位：千克(Kg)，精确到3位小数
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * 客户备注
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 商品信息
     */
    @JsonProperty("lstsku")
    private List<RmaInfoSku> skus;
}
