package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class ListMessageQueryParams extends Page {

    @JsonProperty("before")
    private String before;

    @JsonProperty("after")
    private String after;
}
