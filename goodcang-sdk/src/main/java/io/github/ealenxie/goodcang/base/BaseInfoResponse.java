package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 13:04
 */
@Getter
@Setter
public class BaseInfoResponse {

    /**
     * 电池UN编码列表
     */
    @JsonProperty("product_un_code_list")
    private List<ProductUnCode> productUnCodeList;
}
