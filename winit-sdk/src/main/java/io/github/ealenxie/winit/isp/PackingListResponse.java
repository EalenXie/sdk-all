package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 17:00
 */
@Getter
@Setter
public class PackingListResponse {

    /**
     * bigPackageNo
     */
    @JsonProperty("bigPackageNo")
    private String bigPackageNo;
    /**
     * packingList
     */
    @JsonProperty("packingList")
    private String packingList;
    /**
     * format
     */
    @JsonProperty("format")
    private String format;
    /**
     * size
     */
    @JsonProperty("size")
    private String size;
}
