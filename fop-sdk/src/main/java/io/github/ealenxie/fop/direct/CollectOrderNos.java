package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 16:43
 */
@Getter
@Setter
public class CollectOrderNos {
    /**
     * 预约单号
     */
    @JsonProperty("collect_order_no")
    private List<String> collectOrderNo;
}
