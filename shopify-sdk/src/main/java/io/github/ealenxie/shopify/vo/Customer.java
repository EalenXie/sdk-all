package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Customer {

    /**
     * id
     **/
    @JsonProperty("id")
    private Long id;
    /**
     * 邮件
     **/
    @JsonProperty("email")
    private String email;
    /**
     * 是否接受营销
     **/
    @JsonProperty("accepts_marketing")
    private Boolean acceptsMarketing;
    /**
     * 创建于
     **/
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * 修改于
     **/
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * 名
     **/
    @JsonProperty("first_name")
    private String firstName;
    /**
     * 姓
     **/
    @JsonProperty("last_name")
    private String lastName;
    /**
     * 订单数
     **/
    @JsonProperty("orders_count")
    private Integer ordersCount;
    /**
     * 状态
     **/
    @JsonProperty("state")
    private String state;
    /**
     * 总花费
     **/
    @JsonProperty("total_spent")
    private String totalSpent;
    /**
     * 最后一个订单id
     **/
    @JsonProperty("last_order_id")
    private Long lastOrderId;
    /**
     * 备注
     **/
    @JsonProperty("note")
    private String note;
    /**
     * 验证邮箱
     **/
    @JsonProperty("verified_email")
    private Boolean verifiedEmail;
    /**
     * 多通道标识符
     **/
    @JsonProperty("multipass_identifier")
    private String multipassIdentifier;
    /**
     * 是否免税
     **/
    @JsonProperty("tax_exempt")
    private Boolean taxExempt;
    /**
     * 电话
     **/
    @JsonProperty("phone")
    private String phone;
    /**
     * 标签
     **/
    @JsonProperty("tags")
    private String tags;
    /**
     * 最后一个订单名
     **/
    @JsonProperty("last_order_name")
    private String lastOrderName;
    /**
     * 币种
     **/
    @JsonProperty("currency")
    private String currency;
    /**
     * 接受营销的更新时间
     **/
    @JsonProperty("accepts_marketing_updated_at")
    private String acceptsMarketingUpdatedAt;
    /**
     * 营销级别
     **/
    @JsonProperty("marketing_opt_in_level")
    private String marketingOptInLevel;
    /**
     * 免税
     **/
    @JsonProperty("tax_exemptions")
    private List<String> taxExemptions;
    /**
     * 管理员id
     **/
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    /**
     * 默认地址
     **/
    @JsonProperty("default_address")
    private DefaultAddress defaultAddress;

}
