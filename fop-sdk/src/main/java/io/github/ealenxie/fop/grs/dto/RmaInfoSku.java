package io.github.ealenxie.fop.grs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:15
 */
@Getter
@Setter
public class RmaInfoSku {
    /**
     * 客户退到grs仓库商品的sku，必需在FB4订单宝中处于发布状态
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * 商品数量
     */
    @JsonProperty("plan_qty")
    private Integer planQty;

    /**
     * 商品是否需要拍照服务：grs提供标准拍照服务
     * <p>
     * Y：都需要，N：不需要
     */
    @JsonProperty("sku_photograph_service")
    private String skuPhotographService;

    /**
     * 商品是否需要更换条码服务：grs提供的更换条码服务
     * <p>
     * Y：需要，N：不需要
     */
    @JsonProperty("replace_product_code_service")
    private String replaceProductCodeService;

    /**
     * sku更换后的条码：此sku在订单中维护外部条码或数字条码，如果选择了更换条码，必需填写
     */
    @JsonProperty("new_product_code")
    private String newProductCode;

    /**
     * sku商品过期时间：此sku在如果在订单宝中设置了过期时间管理，相应的需要设置商品过期时间
     * <p>
     * 格式：yyyy-MM-dd，例如2019-01-01
     */
    @JsonProperty("expired_date")
    private String expiredDate;
}
