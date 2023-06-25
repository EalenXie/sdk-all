package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 13:05
 */
@Getter
@Setter
public class ProductUnCode {
    /**
     * 电池UN编码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 电池UN编码名称
     */
    @JsonProperty("name")
    private String name;
}
