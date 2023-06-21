package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class Method {
    /**
     * 支付方式id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 交货方式名称
     */
    @JsonProperty("name")
    private String name;
}
