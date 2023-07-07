package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 16:37
 */
@NoArgsConstructor
@Data
public class ApiStatusesResponse {

    /**
     * apiStatuses
     */
    @JsonProperty("apiStatuses")
    private List<ApiStatuses> apiStatuses;
}
