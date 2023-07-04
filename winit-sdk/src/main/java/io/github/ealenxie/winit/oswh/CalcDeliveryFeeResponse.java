package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/20 16:49
 * @version 1.0
 */
@Getter
@Setter
public class CalcDeliveryFeeResponse {

    /**
     * 派送方式编码
     */
    @JsonProperty("deliveryWayCode")
    private String deliveryWayCode;
    /**
     * 币种
     */
    @JsonProperty("ISOCode")
    private String iSOCode;
    /**
     * 派送方式名称
     */
    @JsonProperty("deliveryWay")
    private String deliveryWay;
    /**
     * 派送时效天数
     */
    @JsonProperty("logisticsTime")
    private Double logisticsTime;
    /**
     * 总费用，加上增值费用的总费用
     */
    @JsonProperty("totalFeeUSD")
    private Double totalFeeUSD;
    /**
     * 出库方式
     */
    @JsonProperty("outboundMethod")
    private String outboundMethod;
    /**
     * 托盘数
     */
    @JsonProperty("palletNum")
    private Double palletNum;
    /**
     * 费用列表
     */
    @JsonProperty("FeeList")
    private List<Fee> feeList;
    /**
     * 增值费用列表
     */
    @JsonProperty("VASFeeList")
    private List<VASFee> vASFeeList;
    /**
     * 打包信息
     */
    @JsonProperty("packageInfo")
    private PackageInfo packageInfo;
}
