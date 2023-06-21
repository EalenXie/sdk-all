package io.github.ealenxie.shopify.enums;

@SuppressWarnings("all")
public enum Recommendation {

    /**
     * There is a low level of risk that this order is fraudulent. The order risk found no indication of fraud 就是之前的LOW
     */
    accept,

    /**
     * There is a medium level of risk that this order is fraudulent. The merchant should investigate the order. 就是之前的MEDIUM
     */
    investigate,

    /**
     * There is a high level of risk that this order is fraudulent. The merchant should cancel the order.就是之前的HIGH
     */
    cancel
}


