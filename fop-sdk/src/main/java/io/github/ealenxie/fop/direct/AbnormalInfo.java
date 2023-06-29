package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 18:08
 */
@Getter
@Setter
public class AbnormalInfo {
    /**
     * 异常发生时间
     */
    @JsonProperty("occurrence_time")
    private String occurrenceTime;

    /**
     * 异常描述
     */
    @JsonProperty("reason_description")
    private String reasonDescription;

    /**
     * 异常原因
     */
    @JsonProperty("reason_type")
    private String reasonType;
}
