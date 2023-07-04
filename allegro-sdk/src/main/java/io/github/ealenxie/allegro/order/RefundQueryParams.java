package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:52
 * @version 1.0
 */
@Getter
@Setter
public class RefundQueryParams extends PageQueryParams {
    /**
     * offerId
     */
    @JsonProperty("lineItem.offer.id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offerId;
    /**
     * login
     */
    @JsonProperty("buyer.login")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String login;
    /**
     * status
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
}
