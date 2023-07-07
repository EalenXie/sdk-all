package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 13:37
 */
@Getter
@Setter
public class ListElementResponse<T> {

    /**
     * list
     */
    @JsonProperty("list")
    private ListElement<T> list;
}
