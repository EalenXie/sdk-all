package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class LineItem {


    /**
     * 发件人地址
     */
    @JsonProperty("origin_location")
    private OriginAddress originLocation;
    /**
     * id
     **/
    @JsonProperty("id")
    private Long id;
    /**
     * 管理员ID
     **/
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    /**
     * 可履行数量
     **/
    @JsonProperty("fulfillable_quantity")
    private Integer fulfillableQuantity;
    /**
     * 可履行服务
     **/
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    /**
     * 履行状态
     **/
    @JsonProperty("fulfillment_status")
    private String fulfillmentStatus;
    /**
     * 是否是礼物卡
     **/
    @JsonProperty("gift_card")
    private Boolean giftCard;
    /**
     * 克
     **/
    @JsonProperty("grams")
    private Integer grams;
    /**
     * 名称
     **/
    @JsonProperty("name")
    private String name;
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
     * 产品是否存在
     **/
    @JsonProperty("product_exists")
    private Boolean productExists;
    /**
     * 产品id
     **/
    @JsonProperty("product_id")
    private String productId;
    /**
     * 产品属性
     **/
    @JsonProperty("properties")
    private List<String> properties;
    /**
     * 数量
     **/
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 是否需要运送
     **/
    @JsonProperty("requires_shipping")
    private Boolean requiresShipping;
    /**
     * sku
     **/
    @JsonProperty("sku")
    private String sku;
    /**
     * 是否交税
     **/
    @JsonProperty("taxable")
    private Boolean taxable;
    /**
     * 标题
     **/
    @JsonProperty("title")
    private String title;
    /**
     * 总折扣
     **/
    @JsonProperty("total_discount")
    private String totalDiscount;
    /**
     * 总折扣集
     **/
    @JsonProperty("total_discount_set")
    private DataSet totalDiscountSet;
    /**
     * 变体id
     **/
    @JsonProperty("variant_id")
    private String variantId;
    /**
     * 变体库存管理
     **/
    @JsonProperty("variant_inventory_management")
    private String variantInventoryManagement;
    /**
     * 变体标题
     **/
    @JsonProperty("variant_title")
    private String variantTitle;
    /**
     * 供应商
     **/
    @JsonProperty("vendor")
    private String vendor;
    /**
     * 税目
     **/
    @JsonProperty("tax_lines")
    private List<TaxLine> taxLines;
    /**
     * 折扣详情
     **/
    @JsonProperty("discount_allocations")
    private List<DiscountAllocation> discountAllocations;

    /**
     * 单个实现中项目数量的唯一标识符。一个订单可以有多个执行线项目。
     */
    @JsonProperty("fulfillment_line_item_id")
    private String fulfillmentLineItemId;


    /**
     * 任务对象的列表，每个对象包含关于行项目上任务的信息。
     */
    @JsonProperty("duties")
    private List<Duty> duties;


}
