package io.github.ealenxie.wish.brands;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/3 12:45
 */
@Getter
@Setter
public class Brand {

    @JsonProperty("website")
    private String website;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
}
