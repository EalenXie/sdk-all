package io.github.ealenxie.lianlian.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by EalenXie on 2022/6/7 11:03
 * Tips : 连连资金流水接口时间段的查询有个bug, 文档写的精确到时分秒，其实是精确到天(记录这个bug时间是2022-06-21)
 */
@Getter
@Setter
public class TransactionsDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String accountId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
    private Integer pageNum = 1;
    private Integer pageSize = 100;
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currency;
    @JsonProperty("platform")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platform;
    @JsonProperty("transType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transType;
    @JsonProperty("virtualCardNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String virtualCardNo;

    public TransactionsDTO(String accountId, Date startTime, Date endTime) {
        this.accountId = accountId;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
