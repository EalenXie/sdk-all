package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxClassification {
    /**
     * 税种
     */
    @JsonProperty("Name")
    private String name;
    /**
     * 税务识别码
     */
    @JsonProperty("Value")
    private String value;
}