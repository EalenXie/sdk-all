package io.github.ealenxie.cne.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * cne sku请求实体
 * zhn
 **/
@Getter
@Setter
public class Goods {
    /**
     * 海关申报物品描述
     */
    @JsonProperty("cxGoods")
    private String cxGoods;

    /**
     * 海关申报物品数量
     */
    @JsonProperty("ixQuantity")
    private Integer ixQuantity;

    /**
     * 物品英文描述
     */
    @JsonProperty("cxGoodsA")
    private String cxGoodsA;

    /**
     * 物品SKU
     */
    @JsonProperty("cxGCodeA")
    private String cxGCodeA;

    /**
     * 海关申报单价
     */
    @JsonProperty("fxPrice")
    private Double fxPrice;

    /**
     * 物品仓库编码
     */
    @JsonProperty("cxGCodeB")
    private String cxGCodeB;

    /**
     * 物品仓位编码
     */
    @JsonProperty("cxGCodeC")
    private String cxGCodeC;

    /**
     * 产品图片链接
     */
    @JsonProperty("cxgPic")
    private String cxgPic;

    /**
     * 产品链接
     */
    @JsonProperty("cxgURL")
    private String cxgURL;

    /**
     * 真实价格
     */
    @JsonProperty("cxTrueprice")
    private Double cxTrueprice;

    /**
     * 申报币种
     */
    @JsonProperty("cxMoney")
    private String cxMoney;

    /**
     * 原产地国家代码
     */
    @JsonProperty("cxOrigin")
    private String cxOrigin;
}

