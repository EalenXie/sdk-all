package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月27日 0027 09 01
 */
@Getter
@Setter
public class InventoryDetailVO {

    @JsonProperty("inventorydetaillist")
    private List<InventoryDetailResp> inventoryDetails;

}
