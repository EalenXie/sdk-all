package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/6 16:13
 */
@Getter
@Setter
public class VehicleLicense {
    /**
     * face
     */
    @JsonProperty("face")
    private RecognizeData<VehicleLicenseFace> face;

    @JsonProperty("back")
    private RecognizeData<VehicleLicenseBack> back;
}
