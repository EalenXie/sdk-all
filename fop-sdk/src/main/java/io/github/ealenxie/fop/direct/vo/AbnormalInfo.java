package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 18:08
 */
@Getter
@Setter
public class AbnormalInfo {
    @JsonProperty("occurrence_time")
    private String occurrenceTime;
    @JsonProperty("reason_description")
    private String reasonDescription;
    @JsonProperty("reason_type")
    private String reasonType;
}
