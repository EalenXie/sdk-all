package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 16:37
 */
@Getter
@Setter
public class ApiStatusesResponse {

    /**
     * apiStatuses
     */
    @JsonProperty("apiStatuses")
    private List<ApiStatuses> apiStatuses;
}
