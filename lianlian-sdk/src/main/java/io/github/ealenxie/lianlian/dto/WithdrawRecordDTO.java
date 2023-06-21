package io.github.ealenxie.lianlian.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by EalenXie on 2022/6/7 17:23
 */
@Getter
@Setter
public class WithdrawRecordDTO {

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
    private String withdrawStatus;
}
