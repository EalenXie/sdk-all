package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/10/21 11:33
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CancelOrderDTO {

    @JsonProperty("order_code")
    private String orderCode;
    @JsonProperty("reason")
    private String reason;
}
