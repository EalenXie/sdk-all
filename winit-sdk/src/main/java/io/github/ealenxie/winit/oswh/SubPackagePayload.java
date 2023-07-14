package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:46
 * @version 1.0
 */
@Getter
@Setter
public class SubPackagePayload {
    /**
     * subPackageNumber
     */
    @JsonProperty("subPackageNumber")
    private String subPackageNumber;
}
