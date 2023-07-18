package io.github.ealenxie.paypal.payments;

import io.github.ealenxie.paypal.Money;
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
