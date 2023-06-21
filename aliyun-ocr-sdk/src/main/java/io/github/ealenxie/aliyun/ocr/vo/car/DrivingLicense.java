package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/6 16:28
 */
@Getter
@Setter
public class DrivingLicense {

    /**
     * face
     */
    @JsonProperty("face")
    private RecognizeData<DrivingLicenseFace> face;

    @JsonProperty("back")
    private RecognizeData<DrivingLicenseBack> back;
}
