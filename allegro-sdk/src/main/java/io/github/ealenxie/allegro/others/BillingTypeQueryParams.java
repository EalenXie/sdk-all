package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillingTypeQueryParams {

    @JsonProperty("Accept-Language")
    private String language;
}
