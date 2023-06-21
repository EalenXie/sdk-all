package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 50
 */
@Getter
@Setter
public class BizGroupInfo {
    /**
     * 是否支持
     */
    @JsonProperty("support")
    private Boolean support;
    /**
     * 垂直市场名字，如微供市场、货品市场
     */
    @JsonProperty("description")
    private String description;
    /**
     * 垂直市场标记
     */
    @JsonProperty("code")
    private String code;
}
