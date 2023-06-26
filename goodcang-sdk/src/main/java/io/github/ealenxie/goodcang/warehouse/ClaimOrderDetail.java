package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 16:33
 */
@Getter
@Setter
public class ClaimOrderDetail {

    /**
     * 退件认领日志列表
     */
    @JsonProperty("log_list")
    private List<LogList> logList;
    /**
     * 售后单号
     */
    @JsonProperty("asro_code")
    private String asroCode;
    /**
     * 认领单
     */
    @JsonProperty("claim_code")
    private String claimCode;
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 认领单商品信息
     */
    @JsonProperty("product_list")
    private List<ClaimProduct> productList;
    /**
     * 添加时间
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * 认领时间
     */
    @JsonProperty("claim_time")
    private String claimTime;
    /**
     * 客户代码
     */
    @JsonProperty("customer_code")
    private String customerCode;
    /**
     * 超期销毁剩余时间
     */
    @JsonProperty("expire_disposal_time")
    private String expireDisposalTime;
    /**
     * 销毁时间
     */
    @JsonProperty("disposal_time")
    private String disposalTime;
    /**
     * 商品内件信息
     */
    @JsonProperty("internal_info_list")
    private List<ClaimInternalInfo> internalInfoList;
    /**
     * 退货图片列表
     */
    @JsonProperty("return_pic_url_list")
    private List<String> returnPicUrlList;
    /**
     * 服务类型
     */
    @JsonProperty("service_type")
    private Integer serviceType;
    /**
     * 状态
     */
    @JsonProperty("status")
    private Integer status;
    /**
     * 更新时间
     */
    @JsonProperty("update_time")
    private String updateTime;
    /**
     * 退件仓
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 退件仓中文名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;
}
