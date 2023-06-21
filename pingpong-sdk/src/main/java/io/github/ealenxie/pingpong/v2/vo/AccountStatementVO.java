package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author create by sch  2023/6/8 16:45
 * @version 1.0
 */
@Getter
@Setter
public class AccountStatementVO {

    /**
     * 业务流⽔号
     */
    @JsonProperty("txId")
    private String txId;
    /**
     * 平台CODE
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 店铺收款账户ID
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * 交易发⽣时间，unix时间戳（秒）
     */
    @JsonProperty("transferTime")
    private Long transferTime;
    /**
     * 交易类型:
     * IN：⼊账
     * OUT：出账
     */
    @JsonProperty("transferType")
    private String transferType;
    /**
     * 具体业务类型描述
     */
    @JsonProperty("bizType")
    private String bizType;
    /**
     * ⾦额
     */
    @JsonProperty("amount")
    private BigDecimal amount;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 发⽣前余额
     */
    @JsonProperty("beforeBalance")
    private BigDecimal beforeBalance;
    /**
     * 发⽣后余额
     */
    @JsonProperty("afterBalance")
    private BigDecimal afterBalance;
}
