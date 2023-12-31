package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 9:56
 */
@Getter
@Setter
public class WarehouseUpdatePayload {

    /**
     * address
     */
    @JsonProperty("address")
    private Address address;
}
