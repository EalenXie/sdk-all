package io.github.ealenxie.winit.oswh.inventory.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.ealenxie.winit.oswh.deser.WarehouseStorageDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/1/20 12:55
 */
@Getter
@Setter
public class WarehouseStorageResp {
    @JsonProperty("currentPageSize")
    private Integer currentPageSize;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("currentPageNum")
    private Integer currentPageNum;
    @JsonProperty("list")
    @JsonDeserialize(using = WarehouseStorageDeserializer.class)
    private List<WarehouseStorage> list;
}
