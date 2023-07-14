package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 18:23
 */
@Getter
@Setter
public class UmsAddressGetData {

    /**
     * dispatchType
     */
    @JsonProperty("dispatchType")
    private String dispatchType;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
}
