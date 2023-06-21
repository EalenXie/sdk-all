package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class NoteAttribute {

    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;

}
