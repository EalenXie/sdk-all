package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 18:24
 */
@Getter
@Setter
public class UmsAddressPickupResponse {
    /**
     * list
     */
    @JsonProperty("list")
    private List<PickupService> list;
}
