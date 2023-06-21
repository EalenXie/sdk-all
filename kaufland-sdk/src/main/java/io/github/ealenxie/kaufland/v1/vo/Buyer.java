package io.github.ealenxie.kaufland.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/12 14:59
 */
@Getter
@Setter
public class Buyer {
    @JsonProperty("id_buyer")
    private Integer idBuyer;
    @JsonProperty("email")
    private String email;
}
