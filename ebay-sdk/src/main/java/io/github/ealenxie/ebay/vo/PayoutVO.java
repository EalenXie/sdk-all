package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/31 15:43
 */
@Getter
@Setter
public class PayoutVO {
    @JsonProperty("href")
    private String href;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("payouts")
    private List<Payouts> payouts;
    @JsonProperty("total")
    private Integer total;
}
