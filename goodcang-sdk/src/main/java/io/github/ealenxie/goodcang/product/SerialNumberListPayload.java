package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.Pagination;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 17:17
 */
@Getter
@Setter
public class SerialNumberListPayload extends Pagination {

    /**
     * 查询类型
     */
    @JsonProperty("code_type")
    private Integer codeType;
    /**
     * 查询状态
     */
    @JsonProperty("status")
    private Integer status;
    /**
     * 查询值
     */
    @JsonProperty("code_value")
    private String codeValue;
    /**
     * 查询时间类型
     */
    @JsonProperty("time_type")
    private Integer timeType;
    /**
     * 开始时间
     */
    @JsonProperty("start_time")
    private String startTime;
    /**
     * 结束时间
     */
    @JsonProperty("end_time")
    private String endTime;

}
