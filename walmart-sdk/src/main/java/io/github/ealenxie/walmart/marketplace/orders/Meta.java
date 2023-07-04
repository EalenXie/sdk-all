package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Meta {
    @JsonProperty("totalCount")
    private int totalCount;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("nextCursor")
    private String nextCursor;
}
