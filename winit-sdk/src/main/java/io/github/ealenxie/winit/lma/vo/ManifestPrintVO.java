package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 17:08
 * @version 1.0
 */
@Getter
@Setter
public class ManifestPrintVO {

    /**
     * 格式
     * pdf/png/jpg/jpeg
     */
    @JsonProperty("formatType")
    private String formatType;
    /**
     * Base64的文件
     */
    @JsonProperty("manifest")
    private String manifest;
}
