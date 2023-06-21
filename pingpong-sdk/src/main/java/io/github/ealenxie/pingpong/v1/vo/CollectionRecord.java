package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 16:52
 */
@Getter
@Setter
public class CollectionRecord {
    /**
     * 流水号
     */
    @JsonProperty("tx_id")
    private String txId;
    /**
     * 资金归集时间(格式：yyyyMMddHHmmss)
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    @JsonProperty("collection_time")
    private String collectionTime;
    /**
     * 店铺ID
     */
    @JsonProperty("seller_id")
    private String sellerId;
    /**
     * 店铺名称
     */
    @JsonProperty("store_name")
    private String storeName;
    /**
     * 店铺所属平台
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 店铺所属国家/地区
     */
    @JsonProperty("nation")
    private String nation;
    /**
     * 店铺所属客户ID
     */
    @JsonProperty("from_client_id")
    private String fromClientId;
    /**
     * 店铺所属客户名称
     */
    @JsonProperty("from_client_name")
    private String fromClientName;
    /**
     * 接收方客户名称
     */
    @JsonProperty("from_account_id")
    private String fromAccountId;
    /**
     * 接收方客户ID
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 接收方客户名称
     */
    @JsonProperty("client_name")
    private String clientName;
    /**
     * 接收方账号ID
     */
    @JsonProperty("account_id")
    private String accountId;
    /**
     * 归集金额
     */
    @JsonProperty("collection_amount")
    private String collectionAmount;
    /**
     * 到账金额
     */
    @JsonProperty("ultimately_amount")
    private String ultimatelyAmount;
    /**
     * 服务费
     */
    @JsonProperty("fee_amount")
    private String feeAmount;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 状态
     * Init 待处理
     * Processing 处理中
     * Failed 处理失败
     * Finished 处理成功
     */
    @JsonProperty("status")
    private String status;
}
