package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class FbwInformation {
    @JsonProperty("fbw_warehouse_code")
    private String fbwWarehouseCode;
    @JsonProperty("fbw_fees")
    private List<FbwFees> fbwFees;
    @JsonProperty("lot_information")
    private List<LotInformation> lotInformation;
}
