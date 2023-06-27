package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.ListTotalPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 12:11
 */
@Getter
@Setter
public class CostFlowResponse extends ListTotalPayload<CostFlow> {

    /**
     * 下一页token
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    /**
     * 上一页token
     */
    @JsonProperty("prev_page_token")
    private String prevPageToken;
}
