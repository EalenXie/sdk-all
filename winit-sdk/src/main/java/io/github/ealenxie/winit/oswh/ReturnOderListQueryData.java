package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.winit.PageParams;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 10:31
 */
@NoArgsConstructor
@Data
public class ReturnOderListQueryData {

    /**
     * returnGoodsOrderNo
     */
    @JsonProperty("returnGoodsOrderNo")
    private String returnGoodsOrderNo;
    /**
     * expressNo
     */
    @JsonProperty("expressNo")
    private String expressNo;
    /**
     * outboundOrderNo
     */
    @JsonProperty("outboundOrderNo")
    private String outboundOrderNo;
    /**
     * rmaNo
     */
    @JsonProperty("rmaNo")
    private String rmaNo;
    /**
     * customerOrderNo
     */
    @JsonProperty("customerOrderNo")
    private String customerOrderNo;
    /**
     * destroyOutboundOrder
     */
    @JsonProperty("destroyOutboundOrder")
    private String destroyOutboundOrder;
    /**
     * originCode
     */
    @JsonProperty("originCode")
    private String originCode;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * oderStartDatetime
     */
    @JsonProperty("OderStartDatetime")
    private String oderStartDatetime;
    /**
     * oderEndDatetime
     */
    @JsonProperty("OderEndDatetime")
    private String oderEndDatetime;
    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParams pageParams;
}
