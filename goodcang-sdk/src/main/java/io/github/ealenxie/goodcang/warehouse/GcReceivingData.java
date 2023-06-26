package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 13:05
 */
@Getter
@Setter
public class GcReceivingData {
    /**
     * 收货时间
     */
    @JsonProperty("received_time")
    private String receivedTime;
    /**
     * 入库单箱号
     */
    @JsonProperty("box_no")
    private String boxNo;
    /**
     * 商品高度
     */
    @JsonProperty("product_height")
    private Integer productHeight;
    /**
     * 商品长度
     */
    @JsonProperty("product_length")
    private Integer productLength;
    /**
     * 商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 商品编码
     */
    @JsonProperty("product_weight")
    private Integer productWeight;
    /**
     * 商品宽度
     */
    @JsonProperty("product_width")
    private Integer productWidth;
    /**
     * 预报数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 收货数量
     */
    @JsonProperty("received_qty")
    private Integer receivedQty;
    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
}
