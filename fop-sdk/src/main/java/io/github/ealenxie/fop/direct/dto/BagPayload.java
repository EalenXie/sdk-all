package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 15:10
 */
@Getter
@Setter
public class BagPayload {
    /**
     * 袋序号
     */
    @JsonProperty("bag_no")
    private String bagNo;

    /**
     * 小包集合
     */
    @JsonProperty("order_list")
    private List<RefNoPayload> orderList;
}
