package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 17:56
 */
@Getter
@Setter
public class SmCodeTwcToWarehouse {
    /**
     * 物流产品
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 物流产品名称
     */
    @JsonProperty("sm_code_name")
    private String smCodeName;
    /**
     * 物流产品绑定中转仓目的仓对象数组
     */
    @JsonProperty("twc_to_warehouse")
    private List<TwcToWarehouse> twcToWarehouse;
}
