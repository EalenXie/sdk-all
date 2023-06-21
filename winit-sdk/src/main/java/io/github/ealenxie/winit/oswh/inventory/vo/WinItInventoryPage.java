package io.github.ealenxie.winit.oswh.inventory.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 10:40
 * @version 1.0
 */
@Getter
@Setter
public class WinItInventoryPage {
    /**
     * 页码
     */
    @JsonProperty("pageNo")
    private Integer pageNo;
    /**
     * 每页条数
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
    /**
     * 总条数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
