package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:46
 */
@Getter
@Setter
public class MeasureUnit {
    /**
     * 计量单位唯一编码
     */
    @JsonProperty("code")
    private String code;

    /**
     * 中文名
     */
    @JsonProperty("name_cn")
    private String nameCn;

    /**
     * 英文名
     */
    @JsonProperty("name_en")
    private String nameEn;

    /**
     * 符号
     */
    @JsonProperty("symbol")
    private String symbol;
}
