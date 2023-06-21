package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 32
 */
@Getter
@Setter
public class SKUAttrInfo {
    /**
     * sku属性ID
     */
    @JsonProperty("attributeID")
    private Long attributeID;
    /**
     * sku值ID，1688不用关注
     */
    @JsonProperty("attValueID")
    private Long attValueID;
    /**
     * sku值内容，国际站不用关注
     */
    @JsonProperty("attributeValue")
    private String attributeValue;
    /**
     * 自定义属性值名称，1688无需关注
     */
    @JsonProperty("customValueName")
    private String customValueName;
    /**
     * sku图片
     */
    @JsonProperty("skuImageUrl")
    private String skuImageUrl;
    /**
     * sku属性ID所对应的显示名，比如颜色，尺码
     */
    @JsonProperty("attributeDisplayName")
    private String attributeDisplayName;
}
