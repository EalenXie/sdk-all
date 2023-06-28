package io.github.ealenxie.fop.direct.vo;

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
    /**
     * 响应大包,类型是List对象集合
     */
    @JsonProperty("bag_list")
    private List<BagCollect> bagList;
}
