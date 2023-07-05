package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.AllegroError;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/4/4 14:36
 */
@Getter
@Setter
public class ParcelPickupStatusResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("errors")
    private List<AllegroError> errors;
}
