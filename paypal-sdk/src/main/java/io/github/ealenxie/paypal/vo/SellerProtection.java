package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/11/28 14:25
 */
@Getter
@Setter
public class SellerProtection {
    @JsonProperty("status")
    private String status;
    @JsonProperty("dispute_categories")
    private List<String> disputeCategories;
}
