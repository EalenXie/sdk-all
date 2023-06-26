package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 10:41
 */
@Getter
@Setter
public class PutawayResponse {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
    /**
     * 入库单状态
     */
    @JsonProperty("receiving_status")
    private Integer receivingStatus;
    /**
     * 客户SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 上架数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 上架时间
     */
    @JsonProperty("putaway_time")
    private String putawayTime;
    /**
     * 库存类型
     */
    @JsonProperty("inventory_type")
    private Integer inventoryType;
    /**
     * 是否有效期管理
     */
    @JsonProperty("shelf_lift")
    private Integer shelfLift;
    /**
     * 有效期天数
     */
    @JsonProperty("shelf_lift_day")
    private Integer shelfLiftDay;
    /**
     * 效期实收明细
     */
    @JsonProperty("shelf_life_list")
    private List<ShelfLife> shelfLifeList;
}
