package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:39
 */

@Getter
@Setter
public class OrderVO {
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("weight")
    private String weight;

}
