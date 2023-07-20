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
     * 装箱单号
     */
    @JsonProperty("bigPackageNo")
    private String bigPackageNo;
    /**
     * 装箱单Base64字符串
     */
    @JsonProperty("packingList")
    private String packingList;
    /**
     * PDF
     */
    @JsonProperty("format")
    private String format;
    /**
     * 装箱单尺寸
     */
    @JsonProperty("size")
    private String size;
}
