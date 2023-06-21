package io.github.ealenxie.worldfirst.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 14:02
 */
@Getter
@Setter
public class InquiryStatementDTO {

    /**
     * 账单开始时间。
     */
    @JsonFormat(pattern = "yyyy-MM-d'T'HH:mm:ss'Z'")
    private Date startTime;

    /**
     * 账单结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-d'T'HH:mm:ss'Z'")
    private Date endTime;

    /**
     * 调用查询的交易类型
     * TRANSFER
     * WITHDRAWAL
     * CONVERSION
     * CHARGE
     * COLLECTION
     * DEDUCTION
     * FUND_COLLECTION
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> transactionTypeList;

    /**
     * 集成商查询的币种列表
     * USD,EUR,GBP,NZD,CAD,AUD,JPY,SGD,HKD,CNH
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> currencyList;

    /**
     * 每页包含的条目数
     */
    private Integer pageSize;
    /**
     * 当前页码
     */
    private Integer pageNumber;
}
