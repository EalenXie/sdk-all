package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 14:20
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QueryTrackingStatusPayload {

    /**
     * 查询参数类型
     */
    @JsonProperty("code_type")
    private String codeType;
    /**
     * 包含订单号的字符串列表
     */
    @JsonProperty("value_list")
    private List<String> valueList;

}
