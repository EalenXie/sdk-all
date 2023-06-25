package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 12:45
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignBusinessTypePayload {

    /**
     * 费用业务类型
     */
    @JsonProperty("sign_business_type")
    private Integer signBusinessType;
}
