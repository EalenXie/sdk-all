package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/4 9:16
 */
@Getter
@Setter
public class RequestParcelPickupVO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("input")
    private RequestParcelInput input;
}
