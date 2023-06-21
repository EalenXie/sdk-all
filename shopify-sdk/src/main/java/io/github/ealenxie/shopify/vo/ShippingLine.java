package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ShippingLine {

    /**
     * id
     **/
    @JsonProperty("id")
    private Long id;
    /**
     * 配送商标识符
     **/
    @JsonProperty("carrier_identifier")
    private String carrierIdentifier;
    /**
     * 编码
     **/
    @JsonProperty("code")
    private String code;
    /**
     * 配送商类别
     **/
    @JsonProperty("delivery_category")
    private String deliveryCategory;
    /**
     * 折后价
     **/
    @JsonProperty("discounted_price")
    private String discountedPrice;
    /**
     * 折后价集
     **/
    @JsonProperty("discounted_price_set")
    private DataSet discountedPriceSet;
    /**
     * 电话
     **/
    @JsonProperty("phone")
    private String phone;
    /**
     * 价格
     **/
    @JsonProperty("price")
    private String price;
    /**
     * 价格集
     **/
    @JsonProperty("price_set")
    private DataSet priceSet;
    /**
     * 请求履行服务id
     **/
    @JsonProperty("requested_fulfillment_service_id")
    private String requestedFulfillmentServiceId;
    /**
     * 来源
     **/
    @JsonProperty("source")
    private String source;
    /**
     * 标题
     **/
    @JsonProperty("title")
    private String title;
    /**
     * 税线
     **/
    @JsonProperty("tax_lines")
    private List<TaxLine> taxLines;
    /**
     * 折扣分配
     **/
    @JsonProperty("discount_allocations")
    private List<DiscountAllocation> discountAllocations;

}
