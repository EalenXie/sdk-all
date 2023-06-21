package io.github.ealenxie.ebay.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 10:35
 */
@Getter
@Setter
public class EbayPageDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit = "20";
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sort;
}
