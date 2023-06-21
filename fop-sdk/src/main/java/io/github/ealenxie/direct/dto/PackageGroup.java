package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/24 17:45
 */
@Getter
@Setter
public class PackageGroup {

    @JsonProperty("orderList")
    private List<String> orderList;
    @JsonProperty("orderNum")
    private Integer orderNum;
    @JsonProperty("totalWeight")
    private Integer totalWeight;
    @JsonProperty("packageMaterialWeight")
    private Integer packageMaterialWeight;
    @JsonProperty("pickupAddress")
    private PickupAddress pickupAddress;
    @JsonProperty("requestId")
    private String requestId;
}
