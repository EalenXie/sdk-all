package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 15:06
 */
@Getter
@Setter
public class CreateCollectBig {

    /**
     * 揽收地址信息
     */
    @JsonProperty("pickup_info")
    private PickupInfoVO pickupInfo;

    /**
     * 袋序号
     */
    @JsonProperty("bag_list")
    private List<BagVO> bagList;
}
