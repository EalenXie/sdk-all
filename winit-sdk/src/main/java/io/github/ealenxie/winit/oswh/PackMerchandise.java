package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 16:52
 * @version 1.0
 */
@Getter
@Setter
public class PackMerchandise {
    /**
     * merchandiseCode
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * qty
     */
    @JsonProperty("qty")
    private String qty;
    /**
     * itemList
     */
    @JsonProperty("itemList")
    private List<PackItem> itemList;
}
