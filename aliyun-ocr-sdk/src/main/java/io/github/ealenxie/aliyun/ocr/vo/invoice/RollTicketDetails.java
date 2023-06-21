package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/4/4 10:00
 */
@Getter
@Setter
public class RollTicketDetails {
    /**
     * 货物或应税劳务、服务名称
     */
    @JsonProperty("itemName")
    private String itemName;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * 单价
     */
    @JsonProperty("unitPrice")
    private String unitPrice;
    /**
     * 金额
     */
    @JsonProperty("amount")
    private String amount;

}
