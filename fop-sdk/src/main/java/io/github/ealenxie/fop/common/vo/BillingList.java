package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/10/8 17:07
 */
@Getter
@Setter
public class BillingList {

    /**
     * 费用信息集合
     */
    @JsonProperty("billinglist")
    private List<Billing> billings;
}
