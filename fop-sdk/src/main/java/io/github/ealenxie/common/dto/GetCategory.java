package io.github.ealenxie.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:57
 */
@Getter
@Setter
public class GetCategory {

    @JsonProperty("category_parent_code")
    private Integer categoryParentCode;
    @JsonProperty("business_type")
    private String businessType;
}
