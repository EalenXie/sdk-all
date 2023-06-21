package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:58
 */
@Getter
@Setter
public class DeclareCategory {
    @JsonProperty("category_code")
    private Integer categoryCode;
    @JsonProperty("category_parent_code")
    private Integer categoryParentCode;
    @JsonProperty("category_name")
    private String categoryName;
    @JsonProperty("category_ename")
    private String categoryEname;
}
