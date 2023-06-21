package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 11:26
 */
@Getter
@Setter
public class ConsumptionDetails {
    /**
     * 日期
     */
    @JsonProperty("date")
    private String date;
    /**
     * 项目
     */
    @JsonProperty("item")
    private String item;
    /**
     * 消费
     */
    @JsonProperty("consumption")
    private String consumption;
    /**
     * 付款
     */
    @JsonProperty("payment")
    private String payment;
}
