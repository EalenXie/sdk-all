package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 15:18
 * @version 1.0
 */

@Getter
@Setter
public class QueryTrackingNoVO {

    /**
     * 查询接口集合
     */
    @JsonProperty("orderList")
    private List<OrderList> orderList;
}
