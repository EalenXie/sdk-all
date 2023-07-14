package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 14:06
 * @version 1.0
 */
@Getter
@Setter
public class ProductLabelInfoResponse {

    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParamsResponse pageParams;
    /**
     * list
     */
    @JsonProperty("list")
    private List<LabelInfo> list;
}
