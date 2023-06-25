package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 12:26
 */

@Getter
@Setter
public class ShippingMethod {
    /**
     * 物流产品编码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 物流产品中文名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 物流产品英文名称
     */
    @JsonProperty("name_en")
    private String nameEn;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 物流产品类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 是否支持签名服务
     */
    @JsonProperty("is_signature")
    private Integer isSignature;
    /**
     * 服务商代码
     */
    @JsonProperty("sp_code")
    private String spCode;
    /**
     * 是否支持地址校验
     */
    @JsonProperty("address_validation_enabled")
    private Integer addressValidationEnabled;
    /**
     * 是否指定到货时间
     */
    @JsonProperty("is_specify_arrival_time")
    private Integer isSpecifyArrivalTime;
    /**
     * 支持的到货时间段
     */
    @JsonProperty("delivery_time_list")
    private List<String> deliveryTimeList;
    /**
     * 是否卡派渠道
     */
    @JsonProperty("is_truck")
    private Integer isTruck;
    /**
     * 业务类型
     */
    @JsonProperty("sm_business_type")
    private Integer smBusinessType;
}
