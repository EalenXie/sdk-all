package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/15 13:55
 */
@Getter
@Setter
public class OrderCancelListData {

    /**
     * orderNoList
     */
    @JsonProperty("orderNoList")
    private List<CancelOrderData> orderNoList;
}
