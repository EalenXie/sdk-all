package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class LogisticsServiceInfo {
    /**
     * 物流产品代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;

    /**
     * 单独报关（Y：单独报关；N：不单独报关）
     * <p>
     * 默认值：N
     */
    @JsonProperty("customs_service")
    private String customsService;

    /**
     * 签名服务（Y/N)；
     * <p>
     * 默认值：N
     */
    @JsonProperty("signature_service")
    private String signatureService;

    /**
     * 其他服务
     */
    @JsonProperty("value_added_services")
    private String valueAddedServices;
}
