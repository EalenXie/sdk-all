package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/20 17:24
 * @version 1.0
 */
@Getter
@Setter
public class OutboundOrderResp<O> {

    /**
     * 每页条数
     */
    @JsonProperty("currentPageSize")
    private Integer currentPageSize;
    /**
     * 总条数
     */
    @JsonProperty("total")
    private Integer total;
    /**
     * 页码
     */
    @JsonProperty("currentPageNum")
    private Integer currentPageNum;
    /**
     * 出库单集合
     */
    @JsonProperty("list")
    private List<O> list;
}
