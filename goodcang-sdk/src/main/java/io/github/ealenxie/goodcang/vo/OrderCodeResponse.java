package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/8/9 15:32
 */
@Getter
@Setter
public class OrderCodeResponse extends ResponseAsk<Void> {

    @JsonProperty("order_code")
    private String orderCode;

}
