package io.github.ealenxie.fop.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 0:02
 */
@Getter
@Setter
public class Destination {
    @JsonProperty("post_code")
    private String postCode;
    @JsonProperty("country")
    private String country;
}
