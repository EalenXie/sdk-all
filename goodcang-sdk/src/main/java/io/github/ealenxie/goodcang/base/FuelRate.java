package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 12:53
 */
@Getter
@Setter
public class FuelRate {
    /**
     * 燃油费率
     */
    @JsonProperty("fls_rate")
    private String flsRate;
    /**
     * 开始有效时间
     */
    @JsonProperty("fls_begin_time")
    private String flsBeginTime;
    /**
     * 结束有效时间
     */
    @JsonProperty("fls_end_time")
    private String flsEndTime;
    /**
     * 结束有效时间
     */
    @JsonProperty("sm_name")
    private String smName;
    /**
     * 物流产品代码
     */
    @JsonProperty("sm_code")
    private String smCode;
}
