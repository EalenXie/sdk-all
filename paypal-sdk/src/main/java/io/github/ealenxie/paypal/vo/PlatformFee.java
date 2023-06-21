package io.github.ealenxie.paypal.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/28 15:10
 */
@Getter
@Setter
public class PlatformFee {

    private Money amount;

    private Payee payee;
}
