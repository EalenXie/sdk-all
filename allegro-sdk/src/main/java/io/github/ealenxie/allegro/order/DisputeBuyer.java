package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/3 12:47
 */
@Getter
@Setter
public class DisputeBuyer {
    @JsonProperty("id")
    private String id;
    @JsonProperty("login")
    private String login;
}
