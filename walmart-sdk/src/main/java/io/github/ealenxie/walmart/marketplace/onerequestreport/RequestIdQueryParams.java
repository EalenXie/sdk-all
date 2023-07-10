package io.github.ealenxie.walmart.marketplace.onerequestreport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 18:00
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestIdQueryParams {
    @JsonProperty("requestId")
    private String requestId;
}
