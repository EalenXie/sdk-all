package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 商品详情
 *
 * @author zhs
 * @since 2022年12月16日 0016 09 16
 */
@Getter
@Setter
public class ProductInfo {

    /**
     * 商品ID
     */
    @JsonProperty("productID")
    private Long productID;
    /**
     * 商品类型，在线批发商品(wholesale)或者询盘商品(sourcing)，1688网站缺省为wholesale
     */
    @JsonProperty("productType")
    private String productType;
    /**
     * 类目ID，标识商品所属类目
     */
    @JsonProperty("categoryID")
    private Long categoryID;
    /**
     * 商品属性和属性值
     */
    @JsonProperty("attributes")
    private List<ProductAttribute> attributes;
    /**
     * 分组ID，确定商品所属分组。1688可传入多个分组ID，国际站同一个商品只能属于一个分组，因此默认只取第一个
     */
    @JsonProperty("groupID")
    private List<Long> groupID;
    /**
     * 商品状态。published:上网状态;member expired:会员撤销;auto expired:自然过期;expired:过期(包含手动过期与自动过期);member deleted:会员删除;modified:修改;new:新发;deleted:删除;TBD:to be delete;approved:审批通过;auditing:审核中;untread:审核不通过;
     */
    @JsonProperty("status")
    private String status;
    /**
     * 商品标题，最多128个字符
     */
    @JsonProperty("subject")
    private String subject;
    /**
     * 商品详情描述，可包含图片中心的图片URL
     */
    @JsonProperty("description")
    private String description;
    /**
     * 语种，参见FAQ 语种枚举值，1688网站默认传入CHINESE
     */
    @JsonProperty("language")
    private String language;
    /**
     * 信息有效期，按天计算，国际站无此信息
     */
    @JsonProperty("periodOfValidity")
    private Integer periodOfValidity;
    /**
     * 业务类型。1：商品，2：加工，3：代理，4：合作，5：商务服务。国际站按默认商品。
     */
    @JsonProperty("bizType")
    private Integer bizType;
    /**
     * 是否图片私密信息，国际站此字段无效
     */
    @JsonProperty("pictureAuth")
    private Boolean pictureAuth;
    /**
     * 商品主图
     */
    @JsonProperty("image")
    private ProductImage image;
    /**
     * sku信息
     */
    @JsonProperty("skuInfos")
    private List<ProductSKUInfo> skuInfos;
    /**
     * 商品销售信息
     */
    @JsonProperty("saleInfo")
    private ProductSaleInfo saleInfo;
    /**
     * 商品物流信息
     */
    @JsonProperty("shippingInfo")
    private ShippingInfo shippingInfo;
    /**
     * 商品国际贸易信息，1688无需处理此字段
     */
    @JsonProperty("internationalTradeInfo")
    private InternationalTradeInfo internationalTradeInfo;
    /**
     * 商品扩展信息
     */
    @JsonProperty("extendInfos")
    private List<ExtendInfo> extendInfos;
    /**
     * 供应商用户ID
     */
    @JsonProperty("supplierUserId")
    private String supplierUserId;
    /**
     * 质量星级(0-5)
     */
    @JsonProperty("qualityLevel")
    private Integer qualityLevel;
    /**
     * 供应商loginId
     */
    @JsonProperty("supplierLoginId")
    private String supplierLoginId;
    /**
     * 类目名
     */
    @JsonProperty("categoryName")
    private String categoryName;
    /**
     * 主图视频播放地址
     */
    @JsonProperty("mainVedio")
    private String mainVedio;
    /**
     * 商品货号，产品属性中的货号
     */
    @JsonProperty("productCargoNumber")
    private String productCargoNumber;
    /**
     * 是否海外代发
     */
    @JsonProperty("crossBorderOffer")
    private Boolean crossBorderOffer;
    /**
     * 参考价格，返回价格区间，可能为空
     */
    @JsonProperty("referencePrice")
    private String referencePrice;
    /**
     * 创建时间
     */
    @JsonProperty("createTime")
    private String createTime;
    /**
     * 获取用户最后一次修改商品信息的时间
     */
    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;

}
