package io.github.ealenxie.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:11
 */
@Getter
@Setter
public class DeclareProductCodeVO {


    @JsonProperty("declare_product_code")
    private String declareProductCode;
}
