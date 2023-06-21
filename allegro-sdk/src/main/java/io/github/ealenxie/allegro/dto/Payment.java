package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/3 12:36
 */
@Getter
@Setter
public class Payment {
    @JsonProperty("id")
    private String id;
}
