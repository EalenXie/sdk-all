package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 11 31
 */
@Getter
@Setter
public class LogisticsInfo {
    /**
     * 发件人信息
     */
    @JsonProperty("sender")
    private Sender sender;
    /**
     * serviceFeature
     */
    @JsonProperty("serviceFeature")
    private String serviceFeature;
    /**
     * 订单号列表，无子订单的等于主订单编号，否则为对应子订单列表
     */
    @JsonProperty("orderEntryIds")
    private String orderEntryIds;
    /**
     * 物流单号，运单号
     */
    @JsonProperty("logisticsBillNo")
    private String logisticsBillNo;
    /**
     * 物流信息ID
     */
    @JsonProperty("logisticsId")
    private String logisticsId;
    /**
     * 收件人信息
     */
    @JsonProperty("receiver")
    private Receiver receiver;
    /**
     * 物流公司编码
     */
    @JsonProperty("logisticsCompanyName")
    private String logisticsCompanyName;
    /**
     * 物流状态。WAITACCEPT:未受理;CANCEL:已撤销;ACCEPT:已受理;TRANSPORT:运输中;NOGET:揽件失败;SIGN:已签收;UNSIGN:签收异常
     */
    @JsonProperty("status")
    private String status;
    /**
     * 商品信息
     */
    @JsonProperty("sendGoods")
    private List<LogisticsSendGood> sendGoods;

    /**
     * gmtSystemSend
     */
    @JsonProperty("gmtSystemSend")
    private String gmtSystemSend;
    /**
     * 备注
     */
    @JsonProperty("remarks")
    private String remarks;
    /**
     * 物流公司ID
     */
    @JsonProperty("logisticsCompanyId")
    private String logisticsCompanyId;
}
