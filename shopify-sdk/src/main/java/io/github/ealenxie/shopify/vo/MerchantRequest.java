package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/27 17:05
 */
@Getter
@Setter
public class MerchantRequest {


    @JsonProperty("message")
    private String message;
    @JsonProperty("request_options")
    private RequestOption requestOptions;
    @JsonProperty("kind")
    private String kind;
}
