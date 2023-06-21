package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:24
 */
@Getter
@Setter
public class BagCollect {
    @JsonProperty("bag_collect_no")
    private String bagCollectNo;
    @JsonProperty("bag_no")
    private String bagNo;
}
