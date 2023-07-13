package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class Vat {
    @JsonProperty("number")
    private String number;
    @JsonProperty("name")
    private String name;
    @JsonProperty("entity")
    private String entity;
}
