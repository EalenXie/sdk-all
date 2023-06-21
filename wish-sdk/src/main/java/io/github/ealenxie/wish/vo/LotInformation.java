package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class LotInformation {
    @JsonProperty("lot_id")
    private String lotId;
    @JsonProperty("quantity")
    private Integer quantity;
}
