package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 14:50
 */
@Getter
@Setter
public class VietnamIdCard {
    /**
     * face
     */
    @JsonProperty("face")
    private RecognizeData<VietnamIdCardFace> face;

    @JsonProperty("back")
    private RecognizeData<VietnamIdCardBack> back;

}
