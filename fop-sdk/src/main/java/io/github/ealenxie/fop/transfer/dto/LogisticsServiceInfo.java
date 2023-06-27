package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 19:47
 * <p>
 * 物流服务信息
 */
@Getter
@Setter
public class LogisticsServiceInfo {
    /**
     * 单独报关（
     * <p>
     * 否：N ;单独报关且退税：YRR ;单独报关不退税：YNR）
     * <p>
     * 默认值：N
     */
    @JsonProperty("customsService")
    private String customsService;

    /**
     * 末端服务商单号（如果客户可以提供）
     */
    @JsonProperty("deliveryCompanyBarcode")
    private String deliveryCompanyBarcode;

    /**
     * 指定末端服务商代码
     */
    @JsonProperty("deliveryCompanyCode")
    private String deliveryCompanyCode;

    /**
     * 面单URL（如果客户可以提供）
     */
    @JsonProperty("deliveryLabelUrl")
    private String deliveryLabelUrl;

    /**
     * 物流产品代码
     */
    @JsonProperty("logisticsProductCode")
    private String logisticsProductCode;

    /**
     * 签名服务（Y/N)；
     * <p>
     * 默认值：N
     */
    @JsonProperty("signatureService")
    private String signatureService;

    /**
     * 增值服务清单List
     */
    @JsonProperty("valueAddedServicesList")
    private List<ValueAddedService> valueAddedServiceList;

}
