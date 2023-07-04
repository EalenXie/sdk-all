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
public class VASFee {
    /**
     * 增值服务编码
     */
    @JsonProperty("serviceCode")
    private String serviceCode;
    /**
     * 增值服务名称
     */
    @JsonProperty("serviceName")
    private String serviceName;
    /**
     * 费用项编码
     */
    @JsonProperty("FeeCode")
    private String feeCode;
    /**
     * 费用金额
     */
    @JsonProperty("FeeNumber")
    private Double feeNumber;
    /**
     * 费用项名称
     */
    @JsonProperty("FeeName")
    private String feeName;
    /**
     * 货币单位
     */
    @JsonProperty("ISOCode")
    private String iSOCode;
    /**
     * 增值明细信息
     */
    @JsonProperty("attrList")
    private List<Attr> attrList;
}
