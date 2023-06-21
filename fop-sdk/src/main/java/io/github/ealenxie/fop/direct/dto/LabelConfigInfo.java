package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class LabelConfigInfo {
    @JsonProperty("label_size")
    private String labelSize;
    @JsonProperty("response_label_format")
    private String responseLabelFormat;
    @JsonProperty("create_logistics_label")
    private String createLogisticsLabel;
    @JsonProperty("logistics_label_config")
    private LogisticsLabelConfig logisticsLabelConfig;
    @JsonProperty("create_package_label")
    private String createPackageLabel;
}
