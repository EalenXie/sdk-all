package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 10:37
 */

@NoArgsConstructor
@Data
public class ReturnOrderListResponse {


    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParamsTotal pageParams;
    /**
     * list
     */
    @JsonProperty("list")
    private java.util.List<ReturnOrderList> list;
}
