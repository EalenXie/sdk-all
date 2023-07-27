package io.github.ealenxie.payoneer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/6 11:27
 */
@Getter
@Setter
public class BalanceItem {
    /**
     * 接收账户Id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 实体类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 货币
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 账户余额状态
     * 0 卡/账户 未发行
     * 1 已发行但未激活的卡
     * 2 卡/账户发行已激活
     * 99 卡/帐户被冻结
     * 100 卡取消
     * 101 卡丢失或被盗
     */
    @JsonProperty("status")
    private String status;
    /**
     * Not Issued
     * IssuedNotActivated
     * Activated
     * Blocked
     * Cancelled
     * LostOrStolen
     */
    @JsonProperty("status_name")
    private String statusName;
    /**
     * 可用的余额信息
     */
    @JsonProperty("available_balance")
    private String availableBalance;
    /**
     * 更新时间
     */
    @JsonProperty("update_time")
    private String updateTime;
}
