package io.github.ealenxie.payoneer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/6/30 12:43
 */
@Getter
@Setter
public class ReceiveAccountDetails {
    @JsonProperty("items")
    private List<AccountItems> items;
    @JsonProperty("total")
    private Integer total;
}
