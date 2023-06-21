package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Refund {

    /**
     * id
     **/
    @JsonProperty("id")
    private Long id;
    /**
     * 管理员id
     **/
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    /**
     * 创建于
     **/
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * 备注
     **/
    @JsonProperty("note")
    private String note;
    /**
     * 订单号
     **/
    @JsonProperty("order_id")
    private Long orderId;
    /**
     * 处理时间
     **/
    @JsonProperty("processed_at")
    private String processedAt;
    /**
     * 是否补货
     **/
    @JsonProperty("restock")
    private Boolean restock;
    /**
     * 用户id
     **/
    @JsonProperty("user_id")
    private Long userId;
    /**
     * 交易详情
     **/
    @JsonProperty("transactions")
    private List<Transaction> transactions;
    /**
     * 退款项目
     **/
    @JsonProperty("refund_line_items")
    private List<RefundLineItem> refundLineItems;

}
