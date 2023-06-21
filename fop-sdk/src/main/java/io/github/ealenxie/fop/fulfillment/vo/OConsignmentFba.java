package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * fop	FBA订单装箱明细
 */
@Setter
@Getter
public class OConsignmentFba {

    /**
     * FBA箱唛编码
     */
    @JsonProperty("fba_box_code")
    private String boxCode;
    /**
     * 客户SKU编码
     */
    @JsonProperty("im_code")
    private String imCode;
    /**
     * FBA商品数量
     */
    @JsonProperty("fba_im_quantity")
    private String imQuantity;
    /**
     * FBA商品编码
     */
    @JsonProperty("fba_im_code")
    private String fbaImCode;
    /**
     * FBA商品编码标签打印数量
     */
    @JsonProperty("fba_label_quantity")
    private String labelQuantity;
    /**
     * 是否贴FBA商品标签标识
     */
    @JsonProperty("fba_item_label_sign")
    private String itemLabelSign;
    /**
     * 备注信息1
     */
    @JsonProperty("fba_inspect_company")
    private String inspectCompany;
    /**
     * 备注信息2
     */
    @JsonProperty("fba_inspect_company_address")
    private String inspectCompanyAddress;
    /**
     * 选择认证logo样式  E=ec
     */
    @JsonProperty("fba_inspection_logo")
    private String inspectionLogo;
}
