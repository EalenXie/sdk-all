package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class ValueAddedService {
    /**
     * 增值服务代码
     */
    @JsonProperty("code")
    private String code;

    /**
     * 增值服务描述/具体内容
     */
    @JsonProperty("content")
    private String content;
}
