package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/11/2 14:52
 */
@Getter
@Setter
public class OrderDetail {


    @JsonProperty("op_id")
    private String opId;
    @JsonProperty("productSku")
    private String productSku;
    @JsonProperty("qty")
    private String qty;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("warehouseSku")
    private String warehouseSku;
    @JsonProperty("warehouseSkuQty")
    private String warehouseSkuQty;
    @JsonProperty("warehouseSkuList")
    private List<WarehouseSkuVO> warehouseSkuList;
    @JsonProperty("productTitle")
    private String productTitle;
    @JsonProperty("pic")
    private String pic;
    @JsonProperty("opSite")
    private String opSite;
    @JsonProperty("productUrl")
    private String productUrl;
    @JsonProperty("refItemId")
    private String refItemId;
    @JsonProperty("opRefItemLocation")
    private String opRefItemLocation;
    @JsonProperty("saleOrderCode")
    private String saleOrderCode;
    @JsonProperty("saleOrderCodeOrg")
    private String saleOrderCodeOrg;
    @JsonProperty("unitPrice")
    private String unitPrice;
    @JsonProperty("unitFinalValueFee")
    private String unitFinalValueFee;
    @JsonProperty("transactionPrice")
    private String transactionPrice;
    @JsonProperty("operTime")
    private String operTime;
    @JsonProperty("action")
    private String action;
    @JsonProperty("opRefTnx")
    private String opRefTnx;
}
