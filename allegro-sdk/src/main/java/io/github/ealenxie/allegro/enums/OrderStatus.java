package io.github.ealenxie.allegro.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * 订单状态
 */
@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    /**
     * BOUGHT - purchase without checkout form filled in *
     * 已购买-购买时无需填写付款表格
     */
    BOUGHT,
    /**
     * FILLED_IN - checkout form filled in but payment is not completed yet so data could still change *
     * 已填写付款表格，但付款尚未完成，因此数据仍可更改*
     */
    FILLED_IN,
    /**
     * READY_FOR_PROCESSING - payment completed. Purchase is ready for processing. *
     * 付款完成。购买已准备好进行处理
     */
    READY_FOR_PROCESSING,
    /**
     * CANCELLED - purchase cancelled by buyer.
     * 买方取消购买
     */
    CANCELLED


}
