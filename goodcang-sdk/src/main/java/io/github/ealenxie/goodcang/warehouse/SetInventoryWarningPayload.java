package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SetInventoryWarningPayload {
    @JsonProperty("list")
    private List<SetInventory> list;
}
