package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.vo.ResponseAsk;
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
