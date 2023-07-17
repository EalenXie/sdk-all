package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.winit.PageTotalResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 14:22
 */
@Getter
@Setter
public class PickupAddressList {

    /**
     * addressList
     */
    @JsonProperty("addressList")
    private List<PickupAddress> addressList;
    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageTotalResponse pageParams;
}
