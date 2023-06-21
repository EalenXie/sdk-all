package io.github.ealenxie.winit.oswh.outbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 11:03
 * @version 1.0
 */
@Getter
@Setter
public class ItemList {
    /**
     * 商品单品码
     * 当商品为单品管理时才会有，若商品为商品管理，则为空
     */
    @JsonProperty("itemCode")
    private String itemCode;
}
