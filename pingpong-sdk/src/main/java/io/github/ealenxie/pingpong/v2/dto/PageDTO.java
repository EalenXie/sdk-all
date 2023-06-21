package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 15:46
 * @version 1.0
 */
@Getter
@Setter
public class PageDTO {
    /**
     * ⻚码，默认查询第1⻚
     */
    @JsonProperty("pageNo")
    private Integer pageNo = 1;
    /**
     * 每⻚记录条数，默认50条，最多100条
     */
    @JsonProperty("pageSize")
    private Integer pageSize = 50;
}
