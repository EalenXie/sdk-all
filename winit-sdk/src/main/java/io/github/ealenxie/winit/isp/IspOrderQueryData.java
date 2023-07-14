package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 17:12
 */
@Getter
@Setter
public class IspOrderQueryData {

    /**
     * orderNo
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * refNo
     */
    @JsonProperty("refNo")
    private String refNo;
}
