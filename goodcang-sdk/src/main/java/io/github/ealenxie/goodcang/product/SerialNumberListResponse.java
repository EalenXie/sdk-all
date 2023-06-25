package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 17:22
 */
@Getter
@Setter
public class SerialNumberListResponse {


    /**
     * 序列信息数组
     */
    @JsonProperty("list")
    private List<SerialNumberResponse> list;
    /**
     * 总数
     */
    @JsonProperty("total")
    private Integer total;
}
