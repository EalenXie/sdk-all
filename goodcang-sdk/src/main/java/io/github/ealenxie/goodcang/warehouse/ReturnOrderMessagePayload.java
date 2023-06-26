package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 16:41
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnOrderMessagePayload {

    /**
     * 退件订单号
     */
    @JsonProperty("returnOrderCodes")
    private List<String> returnOrderCodes;
    /**
     * 留言说明
     */
    @JsonProperty("message")
    private String message;
}
