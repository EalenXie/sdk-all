package io.github.ealenxie.shopify.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountApplication {

    /**
     * 目标类型
     **/
    @JsonProperty("target_type")
    private String targetType;
    /**
     * 类型
     **/
    @JsonProperty("type")
    private String type;
    /**
     * 值
     **/
    @JsonProperty("value")
    private String value;
    /**
     * 值类型
     **/
    @JsonProperty("value_type")
    private String valueType;
    /**
     * 分配方式
     **/
    @JsonProperty("allocation_method")
    private String allocationMethod;
    /**
     * 目标选择
     **/
    @JsonProperty("target_selection")
    private String targetSelection;
    /**
     * 编码
     **/
    @JsonProperty("code")
    private String code;

}
