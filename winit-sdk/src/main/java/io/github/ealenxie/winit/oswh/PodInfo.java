package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 13:51
 */
@NoArgsConstructor
@Data
public class PodInfo {
    /**
     * podUrl
     */
    @JsonProperty("podUrl")
    private String podUrl;
    /**
     * formatType
     */
    @JsonProperty("formatType")
    private String formatType;
}
