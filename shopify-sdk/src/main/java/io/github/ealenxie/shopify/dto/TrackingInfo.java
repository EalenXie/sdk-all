package io.github.ealenxie.shopify.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/09/27 14:29
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrackingInfo {
    /**
     * number
     */
    private String number;
    /**
     * url
     */
    private String url;
    /**
     * company
     */
    private String company;
}
