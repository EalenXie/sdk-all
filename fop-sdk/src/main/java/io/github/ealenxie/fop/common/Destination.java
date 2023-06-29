package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 0:02
 */
@Getter
@Setter
public class Destination {
    /**
     * 货物要到达的邮编
     * <p>
     * 试算时邮编若为空，按国家随机匹配报价分区，邮编中包含字母需要大写
     */
    @JsonProperty("post_code")
    private String postCode;

    /**
     * 货物要到达的国家代码，统一采用国家二字码
     * <p>
     * 如中国大陆的二字码：CN
     */
    @JsonProperty("country")
    private String country;
}
