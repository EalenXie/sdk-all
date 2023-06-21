package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 10 25
 */
@Getter
@Setter
public class OpQueryMarketingMixConfigDTO {

    /**
     * 卖家memberId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sellerMemberId")
    private String sellerMemberId;
    /**
     * 卖家LoginId，sellerMemberId为空时，以loginId为准
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sellerLoginId")
    private String sellerLoginId;

}
