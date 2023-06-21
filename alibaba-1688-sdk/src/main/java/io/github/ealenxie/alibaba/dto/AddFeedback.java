package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/16 13:10
 */
@Getter
@Setter
public class AddFeedback {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tradeFeedbackParam")
    private TradeFeedbackParam tradeFeedbackParam;

}
