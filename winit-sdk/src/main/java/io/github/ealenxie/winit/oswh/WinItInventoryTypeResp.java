package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/1/28 10:31
 * @version 1.0
 */
@Getter
@Setter
public class WinItInventoryTypeResp {
    /**
     * 分页参数
     */
    @JsonProperty("pageParams")
    private PageResponse pageParams;
    /**
     * 库存数据
     */
    @JsonProperty("list")
    private List<WinItInventoryType> list;
}
