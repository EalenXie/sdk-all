package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author EalenXie created on 2023/7/15 14:02
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WarehouseIdData {
    /**
     * warehouseID
     */
    @JsonProperty("warehouseID")
    private String warehouseID;
}
