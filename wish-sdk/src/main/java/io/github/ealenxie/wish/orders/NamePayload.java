package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/18 16:35
 */
@Getter
@Setter
public class NamePayload {

    @JsonProperty("name")
    private String name;
}
