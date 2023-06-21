package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 14:19
 */
@Getter
@Setter
public class Buyer {
    /**
     * 买家的eBay用户ID
     */
    @JsonProperty("username")
    private String username;
}
