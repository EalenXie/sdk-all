package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InventoryList {

    /**
     * 客户操作账号
     */
    @JsonProperty("customer_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String customerCode;
    /**
     * sku编号。注：单次最大支持100种SKU种类查询，如超出请分批查询。
     */
    @JsonProperty("lstsku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> lstsku;
    /**
     * 批次号。注：单次最大支持100个批次号查询，如超出请分批查询。
     */
    @JsonProperty("lstbatch_no")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> lstbatchNo;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 页码
     */
    @JsonProperty("page_no")
    private Integer pageNo = 1;
    /**
     * 每页记录数
     */
    @JsonProperty("page_size")
    private Integer pageSize = 50;
}
