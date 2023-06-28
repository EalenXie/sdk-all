package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:11
 */
@Getter
@Setter
public class DeclareProductCodePayload {

    /**
     * 申报产品代码
     * <p>
     * 客户自定义申报产品代码
     */
    @JsonProperty("declare_product_code")
    private String declareProductCode;
}
