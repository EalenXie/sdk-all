package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 17:34
 */

@Getter
@Setter
public class SerialNumberResponse {
    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 序列号
     */
    @JsonProperty("serial_number")
    private String serialNumber;
    /**
     * 状态
     */
    @JsonProperty("status_text")
    private String statusText;
    /**
     * 创建时间
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * 更新时间
     */
    @JsonProperty("update_time")
    private String updateTime;
    /**
     * 出库时间
     */
    @JsonProperty("ship_time")
    private String shipTime;
    /**
     * 废弃时间
     */
    @JsonProperty("discard_time")
    private String discardTime;
    /**
     * 序列号集成码
     */
    @JsonProperty("data_code")
    private String dataCode;
    /**
     * 入库单号
     */
    @JsonProperty("inbound_code")
    private String inboundCode;
}
