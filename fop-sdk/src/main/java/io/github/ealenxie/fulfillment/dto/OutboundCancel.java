package io.github.ealenxie.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class OutboundCancel {
    /**
     * 委托单号，用改单号作为物流号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 出库委托参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 取消原因类型，客户取消时需要选择一个取消原因。可选值：
     * AP(地址问题);
     * RO(重复下单);
     * OS(商品缺货);
     * BC(买家取消);
     * CF(计费失败);
     * OT(其它原因)。*注:如果选择OT(其它原因)，支持传入参数cancel_remark（取消原因备注、自定义备注信息）
     */
    @JsonProperty("cancel_type")
    private String cancelType;

    /**
     * 取消原因备注，自定义备注信息。*注:如果选择OT(其它原因)，支持传入参数cancel_remark（取消原因备注），自定义备注信息
     */
    @JsonProperty("cancel_remark")
    private String cancelRemark;
}
