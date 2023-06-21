package io.github.ealenxie.fop.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * fop获取渠道请求参数
 */
@Setter
@Getter
public class LogisticsProductList {
    /**
     * 服务代码  4PX服务代码，可选值：F(订单履约)
     */
    @JsonProperty("service_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serviceCode = "F";

    /**
     * 产品分类代码。可选值：first(头程);warehouse(仓内);end(尾程)。
     * <p>
     * <p>
     * *注：如果产品分类是first(头程)产品，则source_position_code(起始地仓库代码)为仓库代码,dest_position_code(目的地仓库代码)为仓库代码。起始地和目的地必填,其它参数为空。
     * <p>
     * 如果产品分类是warehouse(仓内产品)，则只需要source_position_code(起始地仓库代码)为仓库代码。起始地仓库代码必填,其它参数为空。
     * <p>
     * 如果产品分类是end(尾程)产品，则source_position_code(起始地)为仓库代码,其它参数可为空
     */
    @JsonProperty("category_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String categoryCode = "end";

    /**
     * 起始地仓库代码
     */
    @JsonProperty("source_position_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sourcePositionCode;

    /**
     * 目的地仓库代码
     */
    @JsonProperty("dest_position_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String destPositionCode;

    /**
     * 目的地-国家二字码
     */
    @JsonProperty("dest_country_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String destCountryCode;

    /**
     * 目的地-省名称
     */
    @JsonProperty("dest_state_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String destStateName;

    /**
     * 目的地-市名称
     */
    @JsonProperty("dest_city_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String destCityName;

    /**
     * 目的地-邮编
     */
    @JsonProperty("dest_post_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String destPostCode;
}
