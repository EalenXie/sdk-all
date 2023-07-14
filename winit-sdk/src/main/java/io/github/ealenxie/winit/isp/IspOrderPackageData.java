package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 16:54
 */
@Getter
@Setter
public class IspOrderPackageData {
    /**
     * length
     */
    @JsonProperty("length")
    private String length;
    /**
     * width
     */
    @JsonProperty("width")
    private String width;
    /**
     * height
     */
    @JsonProperty("height")
    private String height;
    /**
     * weight
     */
    @JsonProperty("weight")
    private String weight;
    /**
     * merchandiseList
     */
    @JsonProperty("merchandiseList")
    private List<IspOrderMerchandiseData> merchandiseList;
}
