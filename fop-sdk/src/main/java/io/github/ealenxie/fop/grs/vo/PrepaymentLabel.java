package io.github.ealenxie.fop.grs.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:24
 */
@Getter
@Setter
public class PrepaymentLabel {


    @JsonProperty("label_url")
    private String labelUrl;
    @JsonProperty("estimate_amount")
    private String estimateAmount;
    @JsonProperty("mail_no")
    private String mailNo;
}
