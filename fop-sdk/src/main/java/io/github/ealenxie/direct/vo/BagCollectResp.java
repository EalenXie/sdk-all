package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 16:24
 */
@Getter
@Setter
public class BagCollectResp {

    @JsonProperty("bag_list")
    private List<BagCollect> bagList;
}
