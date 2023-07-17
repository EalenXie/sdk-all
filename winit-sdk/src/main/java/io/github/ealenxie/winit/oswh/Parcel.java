package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 11:11
 */
@NoArgsConstructor
@Data
public class Parcel {
    /**
     * merchandiseInfos
     */
    @JsonProperty("merchandiseInfos")
    private List<MerchandiseInfos> merchandiseInfos;
}
