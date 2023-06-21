package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月27日 0027 09 01
 */
@Getter
@Setter
public class InventoryDetail {

    /**
     * 客户操作账号
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * sku编号。注：单次最大支持100种SKU种类查询，如超出请分批查询。
     */
    @JsonProperty("lstsku")
    private List<String> lstSku;

    /**
     * 仓库代码。需要查询库存的仓库代码。（详细参考公共服务，获取仓库代码）
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

}
