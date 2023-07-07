package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 12:52
 */
@Getter
@Setter
public class Search {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String value;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String field;

}
