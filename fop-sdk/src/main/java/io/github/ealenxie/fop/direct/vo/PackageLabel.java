package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:50
 */
@Getter
@Setter
public class PackageLabel {

    /**
     * 袋号
     */
    @JsonProperty("containerNo")
    private String containerNo;

    /**
     * 标签地址
     */
    @JsonProperty("labelUrl")
    private String labelUrl;
}
