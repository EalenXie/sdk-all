package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:24
 */
@Getter
@Setter
public class BagCollect {
    /**
     * 揽收大包号
     */
    @JsonProperty("bag_collect_no")
    private String bagCollectNo;

    /**
     * 袋序号
     */
    @JsonProperty("bag_no")
    private String bagNo;
}
