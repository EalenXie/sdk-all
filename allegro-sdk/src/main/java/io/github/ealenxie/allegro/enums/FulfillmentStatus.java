package io.github.ealenxie.allegro.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author EalenXie
 * @since 2022/11/21 12:58
 */
@Getter
@RequiredArgsConstructor
public enum FulfillmentStatus {
    NEW,

    PROCESSING,

    READY_FOR_SHIPMENT,

    READY_FOR_PICKUP,

    SENT,

    PICKED_UP,

    CANCELLED,

    SUSPENDED


}
