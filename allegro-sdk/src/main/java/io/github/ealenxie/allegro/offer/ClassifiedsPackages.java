package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 15:17
 * @version 1.0
 */
@Getter
@Setter
public class ClassifiedsPackages {
    /**
     * basePackage
     */
    @JsonProperty("basePackage")
    private ParametersValue basePackage;
    /**
     * extraPackages
     */
    @JsonProperty("extraPackages")
    private List<ExtraPackages> extraPackages;
}