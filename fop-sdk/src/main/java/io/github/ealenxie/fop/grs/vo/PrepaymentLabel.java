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

    /**
     * 面单标签下载URL
     */
    @JsonProperty("label_url")
    private String labelUrl;

    /**
     * 预估金额（单位：人民币，最多5位小数点）
     */
    @JsonProperty("estimate_amount")
    private String estimateAmount;

    /**
     * 物流单号
     */
    @JsonProperty("mail_no")
    private String mailNo;
}
