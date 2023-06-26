package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 16:01
 */
@Getter
@Setter
public class UnauthorizedListResponse {

    /**
     * 列表
     */
    @JsonProperty("list")
    private List<ReturnOrderUnauthorized> list;
    /**
     * 总数量
     */
    @JsonProperty("total")
    private Integer total;
}
