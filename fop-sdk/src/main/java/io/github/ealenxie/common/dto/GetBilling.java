package io.github.ealenxie.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * fop交运请求实体
 */
@Getter
@Setter
public class GetBilling {
    /**
     * 业务类型。可选值：I（入库委托）；O（出库委托）；T（调拨委托）
     */
    @JsonProperty("business_type")
    private String businessType;
    /**
     * 业务单号（参考号和业务单号只能支持一个查询,两个参数同时传入时，只支持业务单号查询。）
     */
    @JsonProperty("order_no")
    private String orderNo;
    /**
     * 参考号（参考号和业务单号只能支持一个查询,两个参数同时传入时，只支持业务单号查询。）
     */
    @JsonProperty("ref_no")
    private String refNo;

}
