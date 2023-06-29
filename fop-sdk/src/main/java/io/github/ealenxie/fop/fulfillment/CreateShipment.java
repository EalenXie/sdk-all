package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 创建派送单
 */
@Getter
@Setter
public class CreateShipment {

    /**
     * 客户订单参考号
     */
    @JsonProperty("ref_no")
    private String refNo;
    /**
     * 出库仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 物流产品信息
     */
    @JsonProperty("logistics_service_info")
    private LogisticsServiceInfo logisticsServiceInfo;
    /**
     * 收件人信息
     */
    @JsonProperty("consignee_info")
    private ConsigneeInfo consigneeInfo;
    /**
     * SKU信息
     */
    @JsonProperty("sku_list")
    private List<CreateShipmentSku> skuList;
}
