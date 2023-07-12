package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 11:33
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShipNodesQueryParams {

    @JsonProperty("includeCalendarDayConfiguration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean includeCalendarDayConfiguration;

}
