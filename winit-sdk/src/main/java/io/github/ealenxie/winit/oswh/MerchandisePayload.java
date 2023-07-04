package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/2/3 13:53
 **/
@Getter
@Setter
public class MerchandisePayload {
    /**
     * Winit商品条码（M码）
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * 卖家商品编码
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 下单数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 验货数量
     */
    @JsonProperty("inspectionQty")
    private Integer inspectionQty;
    /**
     * 实际上架数量
     */
    @JsonProperty("actualQuantity")
    private Integer actualQuantity;
    /**
     * 商品条码
     * 万邑通内商品条码与sku一对一对应
     */
    @JsonProperty("productBarcode")
    private String productBarcode;
    /**
     * 以订单级依sku进行汇总的数量
     */
    @JsonProperty("skuCode3rdList")
    private List<OtherSkuCode> skuCode3rdList;
}

