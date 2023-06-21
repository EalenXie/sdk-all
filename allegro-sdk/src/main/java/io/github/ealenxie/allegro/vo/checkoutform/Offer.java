package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private External external;
}
