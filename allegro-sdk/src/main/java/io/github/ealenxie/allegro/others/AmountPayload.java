package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AmountPayload {

    /**
     * maxAmount
     */
    @JsonProperty("maxAmount")
    private Money maxAmount;
}
