package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:58
 */
@Getter
@Setter
public class DeclareCategory {
    /**
     * 申报产品种类代码
     */
    @JsonProperty("category_code")
    private Integer categoryCode;

    /**
     * 申报产品种类父类节点代码。(一级节点的父类节点为0)
     */
    @JsonProperty("category_parent_code")
    private Integer categoryParentCode;

    /**
     * 申报产品种类中文名称。
     */
    @JsonProperty("category_name")
    private String categoryName;

    /**
     * 申报产品种类英文名称。
     */
    @JsonProperty("category_ename")
    private String categoryEname;
}
