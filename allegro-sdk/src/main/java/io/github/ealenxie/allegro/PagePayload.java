package io.github.ealenxie.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PagePayload {

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("offset")
    private Integer offset;

}
