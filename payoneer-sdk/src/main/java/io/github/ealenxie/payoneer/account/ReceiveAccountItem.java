package io.github.ealenxie.payoneer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/30 12:43
 */
@Getter
@Setter
public class ReceiveAccountItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("status")
    private String status;
    @JsonProperty("status_description")
    private String statusDescription;
    @JsonProperty("details")
    private ReceiveAccountDetails details;
}
