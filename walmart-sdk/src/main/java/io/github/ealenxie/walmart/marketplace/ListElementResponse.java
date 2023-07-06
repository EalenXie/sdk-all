package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 13:37
 */
@NoArgsConstructor
@Data
public class ListElementResponse<T> {

    /**
     * list
     */
    @JsonProperty("list")
    private ListElement<T> list;
}
