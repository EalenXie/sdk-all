package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/10/8 16:04
 */
@Getter
@Setter
public class ConsignmentPackage {
    /**
     * 委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 长，单位CM
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 宽, 单位CM
     */
    @JsonProperty("width")
    private Integer width;

    /**
     * 高, 单位cm
     */
    @JsonProperty("height")
    private Integer height;

    /**
     * 包装类型
     */
    @JsonProperty("package_type")
    private String packageType;

    /**
     * 包裹重，单位kg
     */
    @JsonProperty("package_weight")
    private Double packageWeight;

    /**
     * 装船重量
     */
    @JsonProperty("shipped_weight")
    private Double shippedWeight;

    /**
     * 包裹编号
     */
    @JsonProperty("parcel_no")
    private String parcelNo;

    /**
     * ？
     */
    @JsonProperty("subor_no")
    private String suborNo;

    /**
     * sku信息
     */
    @JsonProperty("skus")
    private List<SkuIdCodePayload> skus;
}
