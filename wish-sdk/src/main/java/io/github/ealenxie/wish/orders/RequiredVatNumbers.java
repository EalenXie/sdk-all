package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class RequiredVatNumbers {
    @JsonProperty("voec")
    private Voec voec;
    @JsonProperty("eori")
    private Voec eori;
    @JsonProperty("vat")
    private Vat vat;
}
