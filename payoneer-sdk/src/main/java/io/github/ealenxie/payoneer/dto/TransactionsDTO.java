package io.github.ealenxie.payoneer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/31 13:54
 */
@Getter
@Setter
public class TransactionsDTO {
    /**
     * 开始时间 YYYY-MM-DDTHH:MM:SS.SSSZ  require
     */
    private String from;
    /**
     * 结束时间 YYYY-MM-DDTHH:MM:SS.SSSZ  require
     */
    private String to;
    /**
     * 页码值
     */
    @JsonProperty("page_size")
    private String pageSize;

    /**
     * 是否包含详细信息  true/false
     */
    @JsonProperty("include_details")
    private Boolean includeDetails = Boolean.TRUE;
}
