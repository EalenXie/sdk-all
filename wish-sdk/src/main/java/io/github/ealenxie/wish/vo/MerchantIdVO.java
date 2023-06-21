package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/2 13:11
 */
@Getter
@Setter
public class MerchantIdVO {

    @JsonProperty("merchant_id")
    private String merchantId;
}
