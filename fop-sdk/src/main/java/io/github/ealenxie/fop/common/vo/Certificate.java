package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class Certificate {
    @JsonProperty("certificate_type")
    private String certificateType;
    @JsonProperty("certificate_url")
    private String certificateUrl;
    @JsonProperty("is_long_term")
    private String isLongTerm;
}
