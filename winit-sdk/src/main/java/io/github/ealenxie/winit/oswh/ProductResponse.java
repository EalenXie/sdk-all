package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 13:52
 * @version 1.0
 */

@Getter
@Setter
public class ProductResponse {

    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParamsResponse pageParams;
    /**
     * list
     */
    @JsonProperty("list")
    private List<ProductList> list;
}
