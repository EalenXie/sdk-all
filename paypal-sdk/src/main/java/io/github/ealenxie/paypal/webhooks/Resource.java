package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/20 10:56
 **/
@Getter
@Setter
public class Resource {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * create_time
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * update_time
     */
    @JsonProperty("update_time")
    private String updateTime;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * amount
     */
    @JsonProperty("amount")
    private Amount amount;
    /**
     * parent_payment
     */
    @JsonProperty("parent_payment")
    private String parentPayment;
    /**
     * valid_until
     */
    @JsonProperty("valid_until")
    private String validUntil;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}

