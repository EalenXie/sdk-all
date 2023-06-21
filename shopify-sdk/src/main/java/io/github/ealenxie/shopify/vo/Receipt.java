package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Receipt {

    @JsonProperty("testcase")
    private Boolean testcase;
    @JsonProperty("authorization")
    private String authorization;

}
