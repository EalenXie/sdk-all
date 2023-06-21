package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/8/9 15:32
 */
@Getter
@Setter
public class CancelOrderResponse extends ResponseAsk<Void> {

    @JsonProperty("order_code")
    private String orderCode;

    @JsonProperty("cancel_status")
    private Integer cancelStatus;


    @Override
    public boolean isSuccess() {
        return super.isSuccess() && cancelStatus == 2;
    }

}
