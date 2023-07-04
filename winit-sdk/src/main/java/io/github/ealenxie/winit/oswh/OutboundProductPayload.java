package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/20 16:41
 * @version 1.0
 */
@Getter
@Setter
public class OutboundProductPayload {
    /**
     * 商品编码，SKU
     */
    @JsonProperty("productCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productCode;
    /**
     * 商品数量
     */
    @JsonProperty("productNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer productNum;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String specification;
}
