package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 13:49
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LanguageQueryParam {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("language")
    private String language;

}
