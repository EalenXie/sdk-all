package io.github.ealenxie.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月27日 0027 09 57
 */
@Getter
@Setter
public class GetInboundLabel {

    /**
     * 入库委托单号。*注：支持按入库委托单号和SKU编码单独查询。如果按入库委托单号查询时，则SKU ID参数条件不生效。如果只按SKU ID查询，入库委托单号为空时，则标签类型只能选择SKU标签类型：LABEL_SKU_L1和LABEL_SKU_L2。入库委托单号和SKU ID同时传入时，只支持按入库委托单号查询，不支持同时按入库委托单号加SKU ID组合查询。
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 客户操作帐号。*注：如果只获取SKU标签，客户操作账号必填。
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * SKU ID 数字条码。*注：如果只按SKU ID查询，入库委托单号为空时，则标签类型只能选择SKU标签类型：LABEL_SKU_L1和LABEL_SKU_L2。
     */
    @JsonProperty("sku_id")
    private String skuId;

    /**
     * 标签类型。可选值：
     * 入库清单类型:
     * LABEL_IC_A4(标签格式大小：A4);
     * SKU标签类型：
     * LABEL_SKU_L1(标签格式大小：7*2.2cm标签);
     * LABEL_SKU_L2(标签格式大小：7*4cm标签);
     * 箱唛标签类型：
     * LABEL_BOX_L1(标签格式大小：8*9cm标签);
     * LABEL_BOX_L2(标签格式大小：10*6cm标签);
     * LABEL_BOX_L3(标签格式大小：10*15cm标签);
     * LABEL_BOX_L4(标签格式大小：10*20cm标签);
     * LABEL_BOX_A4(标签格式大小：A4);
     */
    @JsonProperty("type")
    private String type;

    /**
     * 打印备注。针对SKU类型标签和箱唛类型标签可以支持标签添加显示备注信息。例如：Made in China
     */
    @JsonProperty("print_remark")
    private String printRemark;

}
