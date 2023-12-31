package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class Offer {
    /**
     * 优惠id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 优惠名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 外部系统报价信息
     */
    @JsonProperty("external")
    private IdPayload external;

}
