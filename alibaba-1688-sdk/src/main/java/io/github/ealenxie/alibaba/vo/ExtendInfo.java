package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 48
 */
@Getter
@Setter
public class ExtendInfo {
    /**
     * 扩展结构的key
     */
    @JsonProperty("key")
    private String key;
    /**
     * 扩展结构的value
     */
    @JsonProperty("value")
    private String value;
}
