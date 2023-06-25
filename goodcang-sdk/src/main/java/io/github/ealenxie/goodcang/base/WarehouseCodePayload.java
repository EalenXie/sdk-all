package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 11:39
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseCodePayload {

    /**
     * 尾程仓库代码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
}
