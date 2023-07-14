package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 16:47
 * @version 1.0
 */
@Getter
@Setter
public class SubPackageResponse {

    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * msg
     */
    @JsonProperty("msg")
    private String msg;
    /**
     * successNumber
     */
    @JsonProperty("successNumber")
    private Integer successNumber;
    /**
     * subPackageLabels
     */
    @JsonProperty("subPackageLabels")
    private List<String> subPackageLabels;
    /**
     * files
     */
    @JsonProperty("files")
    private String files;
}
