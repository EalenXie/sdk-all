package io.github.ealenxie.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 仓库列表请求参数
 *
 * @author zhs
 * @since 2022年12月27日 0027 09 51
 */
@Getter
@Setter
public class WarehouseList {
    /**
     * 业务类型:F(订单履约)；S(自发服务)；T(转 运服务)；R(退件服务)
     */
    @JsonProperty("service_code")
    private String serviceCode;

    /**
     * 国家二字码
     */
    @JsonProperty("country")
    private String country;
}
