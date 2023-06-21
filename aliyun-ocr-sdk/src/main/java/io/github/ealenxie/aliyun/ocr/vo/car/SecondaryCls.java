package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:46
 */
@Getter
@Setter
public class SecondaryCls {
    /**
     * prob
     */
    @JsonProperty("prob")
    private Double prob;
    /**
     * typeStr
     */
    @JsonProperty("type_str")
    private String typeStr;
}
