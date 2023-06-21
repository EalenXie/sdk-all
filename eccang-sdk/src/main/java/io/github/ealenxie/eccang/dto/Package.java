package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/12 15:25
 */
@Getter
@Setter
public class Package {
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("packageQty")
    private String packageQty;
    @JsonProperty("packageCode")
    private String packageCode;
}
