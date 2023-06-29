package io.github.ealenxie.fop.pds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:47
 * <p>
 * 物流服务信息
 */
@Getter
@Setter
public class LogisticsServiceInfo {
    /**
     * 物流产品code（四方格小件：4PX-GRID）
     */
    @JsonProperty("logisticsServiceCode")
    private String logisticsServiceCode;

    /**
     * 签名服务（Y/N)；
     * <p>
     * 默认值：N
     */
    @JsonProperty("signatureService")
    private String signatureService;
}
