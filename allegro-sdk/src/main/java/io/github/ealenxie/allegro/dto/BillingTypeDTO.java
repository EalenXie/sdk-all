package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillingTypeDTO {

    @JsonProperty("Accept-Language")
    private String language;
}
