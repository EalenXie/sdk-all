package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/2 13:11
 */
@Getter
@Setter
public class MerchantIdPayload {

    @JsonProperty("merchant_id")
    private String merchantId;
}
