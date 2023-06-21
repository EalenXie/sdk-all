package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 12:23
 */
@Getter
@Setter
public class OutBoundBillingVO {

    @JsonProperty("billinglist")
    private List<Billing> billinglist;
}
