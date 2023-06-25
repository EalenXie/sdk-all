package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 14:51
 */
@Getter
@Setter
public class UpdateCustomsClearancePayload {
    /**
     * 商品SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 是否品牌 只能输入Y/N
     */
    @JsonProperty("is_brand")
    private String isBrand;
    /**
     * 商品品牌
     */
    @JsonProperty("product_brand")
    private String productBrand;
    /**
     * 商品型号
     */
    @JsonProperty("product_model")
    private String productModel;
    /**
     * 成交单位
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * 中文申报品名
     */
    @JsonProperty("product_declared_name_cn")
    private String productDeclaredNameCn;
    /**
     * 英文申报品名
     */
    @JsonProperty("product_declared_name")
    private String productDeclaredName;
    /**
     * 认证资料文件路径
     */
    @JsonProperty("certification_file_url")
    private List<String> certificationFileUrl;
    /**
     * 出口国
     */
    @JsonProperty("export_country")
    private String exportCountry;
    /**
     * 出口国申报单价
     */
    @JsonProperty("export_declared_value")
    private Integer exportDeclaredValue;
    /**
     * 商品图片链接
     */
    @JsonProperty("image_link")
    private List<String> imageLink;
    /**
     * 商品链接
     */
    @JsonProperty("product_link")
    private String productLink;
    /**
     * 进口国附件对象
     */
    @JsonProperty("attachments")
    private List<Attachment> attachments;
}
