package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 9:56
 */
@NoArgsConstructor
@Data
public class WarehouseUpdatePayload {

    /**
     * address
     */
    @JsonProperty("address")
    private Address address;
}
