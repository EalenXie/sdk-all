package io.github.ealenxie.winit.lma.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 14:39
 * @version 1.0
 */
@Getter
@Setter
public class ProductInfo {
    /**
     * winitPSC产品编码
     */
    @JsonProperty("winitProductCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String winitProductCode;
}
