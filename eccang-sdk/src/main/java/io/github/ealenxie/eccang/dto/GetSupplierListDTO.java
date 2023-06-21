package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * @author 无敌暴龙战士
 * @since 2022/12/26 8:59
 */
@Getter
@Setter
public class GetSupplierListDTO {
    /**
     * 启用状态，0正式供应商，1草稿，2待审核，3暂停供应商
     */
    @JsonProperty("supplierStatus")
    private Integer supplierStatus;

    /**
     * 结算类型，1:货到付款，2:款到发货，3:帐期
     */
    @JsonProperty("accountType")
    private Integer accountType;

    /**
     * 供应商代码
     */
    @JsonProperty("supplierCode")
    private String supplierCode;

    /**
     * 供应商名称
     */
    @JsonProperty("supplierName")
    private String supplierName;

    /**
     * 采购员
     */
    @JsonProperty("buyerId")
    private String buyerId;

    /**
     * 跟单员
     */
    @JsonProperty("trackId")
    private String trackId;

    /**
     * 主营品类代码，一级品类代码
     */
    @JsonProperty("supplierMainCategoryCode")
    private Integer supplierMainCategoryCode;
    /**
     * 供应商数据更新时间条件筛选 --yyyy-mm-dd hh:ii:ss
     */
    @JsonProperty("dateFor")
    private String dateFor;
    /**
     * 供应商数据更新时间条件筛选 --yyyy-mm-dd hh:ii:ss
     */
    @JsonProperty("dateTo")
    private String dateTo;
}
