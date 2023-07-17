package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 11:11
 */
@Getter
@Setter
public class Parcel {
    /**
     * merchandiseInfos
     */
    @JsonProperty("merchandiseInfos")
    private List<MerchandiseInfos> merchandiseInfos;
}
