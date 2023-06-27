package io.github.ealenxie.fop.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:57
 */
@Getter
@Setter
public class GetCategory {
    /**
     * 申报产品种类父类节点代码。(一级节点的父类节点代码为0)
     */
    @JsonProperty("category_parent_code")
    private Integer categoryParentCode;

    /**
     * 申报产品种类业务类型。
     * <p>
     * 可选值：I（进口业务）；E（出口业务。默认值为：E（出口业务）。
     */
    @JsonProperty("business_type")
    private String businessType;
}
