package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/8 15:33
 * @version 1.0
 */
@Getter
@Setter
public class PageResp<T> {
    /**
     * 总数
     */
    @JsonProperty("total")
    private Integer total;
    /**
     * 总⻚数
     */
    @JsonProperty("pages")
    private Integer pages;
    /**
     * 每⻚记录条数
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
    /**
     * 当前⻚码
     */
    @JsonProperty("pageNo")
    private Integer pageNo;
    /**
     * 具体查询结果
     */
    @JsonProperty("results")
    private List<T> results;
}
