package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.Figure;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/4 16:10
 */
@Setter
@Getter
public class IdCard {
    /**
     * 正面识别结果
     */
    @JsonProperty("face")
    private RecognizeData<IdCardFace> face;

    /**
     * 反面识别结果
     */
    @JsonProperty("back")
    private RecognizeData<IdCardBack> back;

    @JsonProperty("figure")
    private List<Figure> figure;

}
