package io.github.ealenxie.fruugo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/08/24 15:03
 */
@Getter
@Setter
public class FruugoShipDTO {
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 商品数量
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ItemDTO> item;

    /**
     * 快递公司URL
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingUrl;
    /**
     * 包裹的跟踪代码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingCode;
    /**
     * 发给客户消息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String messageToCustomer;
    /**
     * 发给Fruugo消息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String messageToFruugo;
}
