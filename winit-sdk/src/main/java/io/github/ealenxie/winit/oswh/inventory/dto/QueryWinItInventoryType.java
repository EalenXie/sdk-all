package io.github.ealenxie.winit.oswh.inventory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 10:19
 * @version 1.0
 */
@Getter
@Setter
public class QueryWinItInventoryType {
    /**
     * 仓库编码, 示例：美西仓：US0001
     */
    @JsonProperty("warehouseCodes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCodes;
    /**
     * 业务用途类型，枚举值：2B,2C,为空默认2C，
     */
    @JsonProperty("serviceType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serviceType;
    /**
     * 商品编码
     */
    @JsonProperty("merchandiseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseCode;
    /**
     * 商品条码
     */
    @JsonProperty("merchandiseSerno")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseSerno;
    /**
     * 供应渠道
     */
    @JsonProperty("provideChannel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String provideChannel;
    /**
     * 商品等级，为空默认良品
     * 枚举值：GOOD,DEFECTIVE
     * GOOD:良品
     * DEFECTIVE:不良品
     */
    @JsonProperty("merchandiseGrade")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseGrade;
    /**
     * 销售渠道
     */
    @JsonProperty("salesChannel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String salesChannel;
    /**
     * 组织
     */
    @JsonProperty("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String organization;
    /**
     * 库存变更开始时间 格式 2020-01-01 00:00:00
     */
    @JsonProperty("startTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String startTime;
    /**
     * 库存变更结束时间 格式 2020-01-01 00:00:00
     */
    @JsonProperty("endTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String endTime;

    @JsonProperty("pageVo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageDTO pageVo;
}
