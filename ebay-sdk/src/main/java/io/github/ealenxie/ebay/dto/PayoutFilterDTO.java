package io.github.ealenxie.ebay.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 10:50
 */
@Getter
@Setter
public class PayoutFilterDTO implements EbayFilterDTO {

    /**
     * 格式为 [2018-10-23T00:00:01.000Z..2018-11-09T00:00:01.000Z]
     */
    private String payoutDate;


    private String lastAttemptedPayoutDate;
    /**
     * 支出状态
     * SUCCEEDED：搜索成功的支付。
     * INITIATED：搜索已启动但未处理的付款。
     * RETRYABLE_FAILED：搜索失败的支付，但将再次尝试的支付。如果按lastAttemptedPayoutDate过滤，则必须使用此值。
     * TERMINAL_FAILED：搜索失败的支付，以及不会再次尝试的支付。
     * REVERSED：搜索被撤销的支出。
     */
    private String payoutStatus;

}
