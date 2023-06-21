package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/12 15:25
 */
@Getter
@Setter
public class Fitting {
    @JsonProperty("productSku")
    private String productSku;
    @JsonProperty("fittingQty")
    private String fittingQty;
    @JsonProperty("fittingDesc")
    private String fittingDesc;
}
