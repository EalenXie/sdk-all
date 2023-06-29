package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 13:02
 */
@Getter
@Setter
public class GetLogisticsProductList {

    /**
     * 运输方式：
     * <p>
     * 1 所有方式；
     * <p>
     * 2 国际快递；
     * <p>
     * 3 国际小包；
     * <p>
     * 4 专线；
     * <p>
     * 5 联邮通；
     * <p>
     * 6 其他；
     */
    @JsonProperty("transport_mode")
    private String transportMode;

    /**
     * 起运地-国家二字码。此查询条件暂不可用
     */
    @JsonProperty("source_country_code")
    private String sourceCountryCode;

    /**
     * 起始地-仓库代码。此查询条件暂不可用
     */
    @JsonProperty("source_warehouse_code")
    private String sourceWarehouseCode;

    /**
     * 目的地-国家二字码。此查询条件暂不可用
     */
    @JsonProperty("dest_country_code")
    private String destCountryCode;
}
