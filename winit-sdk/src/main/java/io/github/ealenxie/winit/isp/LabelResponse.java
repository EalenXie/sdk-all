package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 17:09
 */
@Getter
@Setter
public class LabelResponse {

    /**
     * failedCount
     */
    @JsonProperty("failedCount")
    private Integer failedCount;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private List<String> trackingNo;
    /**
     * successCount
     */
    @JsonProperty("successCount")
    private Integer successCount;
    /**
     * files
     */
    @JsonProperty("files")
    private List<String> files;
}
