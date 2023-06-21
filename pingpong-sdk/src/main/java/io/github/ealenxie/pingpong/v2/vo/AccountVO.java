package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 15:39
 * @version 1.0
 */
@Getter
@Setter
public class AccountVO {
    /**
     * 店铺收款账户ID
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * 店铺所在地区
     */
    @JsonProperty("nation")
    private String nation;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 收款账号
     */
    @JsonProperty("cardNo")
    private String cardNo;
    /**
     * 收款 IBAN号
     */
    @JsonProperty("iban")
    private Object iban;
    /**
     * 银⾏名称
     */
    @JsonProperty("bankName")
    private String bankName;
    /**
     * 银⾏代码
     */
    @JsonProperty("bankCode")
    private String bankCode;
    /**
     * 分⾏代码
     */
    @JsonProperty("branchNumber")
    private String branchNumber;
    /**
     * SORT CODE
     */
    @JsonProperty("sortCode")
    private String sortCode;
    /**
     * ROUTING NUMBER
     */
    @JsonProperty("routingNumber")
    private String routingNumber;
    /**
     * SwiftCode
     */
    @JsonProperty("swiftCode")
    private String swiftCode;
    /**
     * 卡类型：CHECKING：⽀票 ；SAVINGS：储蓄卡
     */
    @JsonProperty("accountType")
    private String accountType;
}
