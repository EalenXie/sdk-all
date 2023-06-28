package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/4 14:47
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParcelIdPayload {
    @JsonProperty("parcelId")
    private String parcelId;
}
