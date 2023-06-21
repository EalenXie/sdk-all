package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/12 17:12
 */
@Getter
@Setter
public class SubProducts {

    @JsonProperty("pcrProductSku")
    private String pcrProductSku;
    @JsonProperty("pcrQty")
    private Integer pcrQty;

}
