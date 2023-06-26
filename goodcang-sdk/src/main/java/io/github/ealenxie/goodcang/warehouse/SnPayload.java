package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 10:23
 */
@Getter
@Setter
public class SnPayload {
    /**
     * 序列号集成码
     */
    @JsonProperty("data_code")
    private String dataCode;
    /**
     * 序列号列表
     */
    @JsonProperty("sn_item_list")
    private List<String> snItemList;
}
