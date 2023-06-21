package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:30
 */
@Getter
@Setter
public class LabelUrlInfo {
    @JsonProperty("logistics_label")
    private String logisticsLabel;
    @JsonProperty("custom_label")
    private String customLabel;
    @JsonProperty("package_label")
    private String packageLabel;
}
