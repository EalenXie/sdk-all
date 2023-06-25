package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 13:50
 */
@Getter
@Setter
public class MaterialListResponse {
    /**
     * 材质列表
     */
    @JsonProperty("material_list")
    private List<String> materialList;
}
