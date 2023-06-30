package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 16:00
 */
@Getter
@Setter
public class PromoPackageModify {
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
