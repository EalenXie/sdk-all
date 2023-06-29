package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class LabelConfigInfo {
    /**
     * 尺寸
     */
    @JsonProperty("label_size")
    private String labelSize;

    /**
     * 格式
     * <p>
     * 如：PDF
     */
    @JsonProperty("response_label_format")
    private String responseLabelFormat;

    /**
     * 是否创建注册标签
     */
    @JsonProperty("create_logistics_label")
    private String createLogisticsLabel;

    /**
     * 物流标签配置
     */
    @JsonProperty("logistics_label_config")
    private LogisticsLabelConfig logisticsLabelConfig;

    /**
     * 是否创建包标签
     */
    @JsonProperty("create_package_label")
    private String createPackageLabel;
}
