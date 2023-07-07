package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:29
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FromDataQueryParams {

    @JsonProperty("fromDate")
    private String fromDate;
}
