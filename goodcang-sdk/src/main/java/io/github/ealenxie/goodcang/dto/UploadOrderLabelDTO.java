package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.vo.LabelInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/8/18 17:16
 */
@Getter
@Setter
public class UploadOrderLabelDTO {
    @JsonProperty("order_code")
    private String orderCode;
    @JsonProperty("tracking_number")
    private String trackingNumber;
    @JsonProperty("package_area_code")
    private String packageAreaCode;
    @JsonProperty("label_info")
    private LabelInfo labelInfo;
}
