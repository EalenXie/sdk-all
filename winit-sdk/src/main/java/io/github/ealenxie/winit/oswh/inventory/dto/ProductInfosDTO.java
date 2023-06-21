package io.github.ealenxie.winit.oswh.inventory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/1/28 17:09
 * @version 1.0
 */
@Getter
@Setter
public class ProductInfosDTO {
    @JsonProperty("productList")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ProductDTO> productDTOList;
}
