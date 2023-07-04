package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 16:40
 * @version 1.0
 */
@Getter
@Setter
public class PackageConfigurationResponse {
    /**
     * packages
     */
    @JsonProperty("packages")
    private List<PackageConfigurationPayload> packages;
}
