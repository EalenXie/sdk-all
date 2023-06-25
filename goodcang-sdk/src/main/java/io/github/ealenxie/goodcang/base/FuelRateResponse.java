package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 12:51
 */
@Getter
@Setter
public class FuelRateResponse {


    /**
     * 费率
     */
    @JsonProperty("list")
    private List<FuelRate> list;
    /**
     * 总数
     */
    @JsonProperty("total")
    private Integer total;
}
