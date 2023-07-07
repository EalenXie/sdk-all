package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 10:40
 */
@Getter
@Setter
public class DataResponse<T> {
    @JsonProperty("data")
    private T data;
    @JsonProperty("errors")
    private List<Error> errors;
}
