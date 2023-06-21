package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InventoryAgeTotal {
    @JsonProperty("total")
    private String total;
    @JsonProperty("list")
    private List<InventoryAge> list;
}
