package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/12 17:11
 */
@Getter
@Setter
public class ProductCombination {
    @JsonProperty("FNSKU")
    private String pcrFnsku;
    @JsonProperty("pcrFbaAsin")
    private String pcrFbaAsin;
    @JsonProperty("warehouseId")
    private String warehouseId;
    @JsonProperty("pcrAddTime")
    private String pcrAddTime;
    @JsonProperty("pcrUpdateTime")
    private String pcrUpdateTime;
    @JsonProperty("subProducts")
    private SubProducts subProducts;
}
