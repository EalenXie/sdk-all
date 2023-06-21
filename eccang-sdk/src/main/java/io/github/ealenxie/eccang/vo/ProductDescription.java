package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/12 17:08
 */
@Getter
@Setter
public class ProductDescription {

    @JsonProperty("language")
    private String language;
    @JsonProperty("pdd_description")
    private String pddDescription;

}
