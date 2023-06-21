package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:56
 */
@Getter
@Setter
public class CreateNewParcelVO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("input")
    private CreateNewParcelInput input;
}
