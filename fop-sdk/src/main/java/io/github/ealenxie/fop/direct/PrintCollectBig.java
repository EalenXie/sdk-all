package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 16:33
 */
@Getter
@Setter
public class PrintCollectBig {
    /**
     * 揽收大包号
     */
    @JsonProperty("bag_collect_no")
    private List<String> bagCollectNo;
}
