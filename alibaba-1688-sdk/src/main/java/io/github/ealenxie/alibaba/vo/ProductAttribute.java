package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 28
 */
@Getter
@Setter
public class ProductAttribute {
    /**
     * 属性ID
     */
    @JsonProperty("attributeID")
    private Long attributeID;
    /**
     * 属性名称
     */
    @JsonProperty("attributeName")
    private String attributeName;
    /**
     * 属性值ID
     */
    @JsonProperty("valueID")
    private Long valueID;
    /**
     * 属性值
     */
    @JsonProperty("value")
    private String value;
    /**
     * 是否为自定义属性，国际站无需关注
     */
    @JsonProperty("isCustom")
    private Boolean isCustom;
}
