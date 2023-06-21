package io.github.ealenxie.allegro.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author EalenXie
 * @since 2022/11/21 13:02
 */
@Getter
@RequiredArgsConstructor
public enum ShipmentSummarySentStatus {
    /**
     * none of line items have tracking number specified
     * 完全没有标发
     */
    NONE,
    /**
     * Some of lines items have tracking number specified
     * 部分标发
     */
    SOME,
    /**
     * All of lines items have tracking number specified全部标发
     */
    ALL


}
