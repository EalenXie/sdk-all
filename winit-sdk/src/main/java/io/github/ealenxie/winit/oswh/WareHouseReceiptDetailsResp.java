package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/1/28 14:44
 * @version 1.0
 */
@Getter
@Setter
public class WareHouseReceiptDetailsResp {
    @JsonProperty("pageParams")
    private PageResponse pageParams;
    @JsonProperty("list")
    private List<WareHouseReceiptDetails> list;
}
