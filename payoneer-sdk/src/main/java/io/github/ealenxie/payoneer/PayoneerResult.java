package io.github.ealenxie.payoneer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/31 13:22
 */
@Getter
@Setter
public class PayoneerResult<T> {
    @JsonProperty("result")
    private T result;
}
