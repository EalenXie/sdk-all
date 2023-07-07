package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:41
 * @version 1.0
 */
@Getter
@Setter
public class OptCapProgramPayload {

    /**
     * subsidyEnrolled
     */
    @JsonProperty("subsidyEnrolled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean subsidyEnrolled;
    /**
     * subsidyPreference
     */
    @JsonProperty("subsidyPreference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean subsidyPreference;
}
