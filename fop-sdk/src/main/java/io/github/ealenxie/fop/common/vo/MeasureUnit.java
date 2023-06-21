package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:46
 */
@Getter
@Setter
public class MeasureUnit {

    @JsonProperty("code")
    private String code;
    @JsonProperty("name_cn")
    private String nameCn;
    @JsonProperty("name_en")
    private String nameEn;
    @JsonProperty("symbol")
    private String symbol;
}
