package io.github.ealenxie.lianlian.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/7 11:03
 */
@Getter
@Setter
public class AccountDTO {
    private Integer pageNum = 1;
    private Integer pageSize = 100;
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currency;
    @JsonProperty("platform")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platform;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer shopStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String holderId;
}
