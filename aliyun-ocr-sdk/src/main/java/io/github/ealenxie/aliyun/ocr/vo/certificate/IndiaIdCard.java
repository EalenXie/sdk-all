package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:07
 */
@Getter
@Setter
public class IndiaIdCard {


    /**
     * face
     */
    @JsonProperty("face")
    private RecognizeData<IndiaIdCardFace> face;
    /**
     * back
     */
    @JsonProperty("back")
    private RecognizeData<IndiaIdCardBack> back;


}
