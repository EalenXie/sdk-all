package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 17:33
 */
@NoArgsConstructor
@Data
public class PlanOrderBoxListResponse {

    /**
     * 装箱信息列表
     */
    @JsonProperty("list")
    private List<Box> list;
    /**
     * 记录总数
     */
    @JsonProperty("total")
    private Integer total;
}
