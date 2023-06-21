package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/7/26 18:24
 */
@Getter
@Setter
public class External {

    /**
     * 外部系统的商品id
     */
    @JsonProperty("id")
    private String id;
}
