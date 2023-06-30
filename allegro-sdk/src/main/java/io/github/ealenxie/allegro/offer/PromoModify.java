package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 16:00
 */
@NoArgsConstructor
@Data
public class PromoModify {
    /**
     * basePackage
     */
    @JsonProperty("basePackage")
    private IdPayload basePackage;
    /**
     * extraPackages
     */
    @JsonProperty("extraPackages")
    private List<IdPayload> extraPackages;
    /**
     * modificationTime
     */
    @JsonProperty("modificationTime")
    private String modificationTime;
}
