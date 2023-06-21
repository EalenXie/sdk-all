package io.github.ealenxie.kaufland.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/12 15:01
 */
@Getter
@Setter
public class Invoice {

    @JsonProperty("number")
    private String number;
    @JsonProperty("type")
    private String type;
    @JsonProperty("url")
    private String url;

}
