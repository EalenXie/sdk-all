package io.github.ealenxie.lianlian.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by EalenXie on 2022/6/7 11:03
 * <a href="https://developer.lianlianglobal.com/docs/llp-api/e361747518aa8-">TransactionsEntry</a>
 */
@Getter
@Setter
public class TransactionsEntryListDTO {


    /**
     * 入账单创建开始时间 yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date startTime;
    /**
     * 入账单创建结束时间 yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date endTime;

    /**
     * 入账单最后更新开始时间 yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("startUpdateTime")
    private Date startUpdateTime;

    /**
     * 入账单最后更新结束时间 yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("endUpdateTime")
    private Date endUpdateTime;

    @JsonProperty("pageNum")
    private Integer pageNum = 1;

    @JsonProperty("pageSize")
    private Integer pageSize = 100;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String creditStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String virtualCardNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String holderId;

}
