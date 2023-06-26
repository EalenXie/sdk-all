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
public class CancelOrderResponse extends ResponseAsk<Void> {

    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;

    /**
     * 取消状态
     */
    @JsonProperty("cancel_status")
    private Integer cancelStatus;


    @Override
    public boolean isSuccess() {
        return super.isSuccess() && cancelStatus == 2;
    }

}
