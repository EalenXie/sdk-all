package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:50
 */
@Getter
@Setter
public class CashOnDelivery {
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("expressAvailable")
    private Boolean expressAvailable;
}
