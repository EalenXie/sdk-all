package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/22 15:16
 */
@Getter
@Setter
public class AmazonOrderItems {

    /**
     * 亚马逊订单id
     */
    @JsonProperty("AmazonOrderId")
    private String amazonOrderId;
    @JsonProperty("NextToken")
    private String nextToken;
    @JsonProperty("OrderItems")
    private List<AmazonOrderItem> orderItems;

}
