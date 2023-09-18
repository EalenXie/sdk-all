package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvalidationFrozen {
    /**
     * 失效日期
     */
    @JsonProperty("invalidationDate")
    private Long invalidationDate;

    /**
     * 失效原因
     */
    @JsonProperty("invalidationReason")
    private String invalidationReason;
}