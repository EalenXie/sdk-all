package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 17:03
 * @version 1.0
 */
@Getter
@Setter
public class AssignClassifiedPackageResponse {
    /**
     * basePackage
     */
    @JsonProperty("basePackage")
    private IdPayload basePackage;
    /**
     * extraPackages
     */
    @JsonProperty("extraPackages")
    private List<ExtraPackage> extraPackages;
}
