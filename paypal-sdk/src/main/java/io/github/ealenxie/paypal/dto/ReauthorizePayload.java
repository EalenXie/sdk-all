package io.github.ealenxie.paypal.dto;

import io.github.ealenxie.paypal.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/28 15:20
 */
@Getter
@Setter
public class ReauthorizePayload {

    private Money amount;

}
