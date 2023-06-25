package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 13:44
 */
@Getter
@Setter
public class DeclareListResponse {

    /**
     * 申报名列表
     */
    @JsonProperty("declare_list")
    private List<String> declareList;
}
