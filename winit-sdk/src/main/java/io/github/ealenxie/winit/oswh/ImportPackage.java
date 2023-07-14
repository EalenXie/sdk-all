package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 16:52
 * @version 1.0
 */
@Getter
@Setter
public class ImportPackage {
    /**
     * packageNo
     */
    @JsonProperty("packageNo")
    private String packageNo;
    /**
     * thirdSerno
     */
    @JsonProperty("thirdSerno")
    private String thirdSerno;
    /**
     * merchandiseList
     */
    @JsonProperty("merchandiseList")
    private List<PackMerchandise> merchandiseList;
    /**
     * height
     */
    @JsonProperty("height")
    private String height;
    /**
     * length
     */
    @JsonProperty("length")
    private String length;
    /**
     * weight
     */
    @JsonProperty("weight")
    private String weight;
    /**
     * width
     */
    @JsonProperty("width")
    private String width;
}
