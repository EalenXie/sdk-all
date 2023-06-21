package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/2 15:37
 **/
@Getter
@Setter
public class MerchandiseListDTO {
    /**
     * 商品编码 必填
     */
    @JsonProperty("merchandiseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseCode;
    /**
     * 数量 必填
     */
    @JsonProperty("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String quantity;
    /**
     * 商品规格
     * 注意：若规格存在，则必填；若不存，则可不填
     */
    @JsonProperty("specification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String specification;
    /**
     * 商品规格
     * 注意：若规格存在，则必填；若不存，则可不填
     */
    @JsonProperty("validDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String validDate;
}

