package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class Invoice {
    /**
     * 是否需要开票
     */
    @JsonProperty("required")
    private Boolean required;
    /**
     * 发票地址
     */
    @JsonProperty("address")
    private InvoiceAddress address;
    /**
     * 延期付款条款购买发票的到期日期。对于其他付款方式，此字段将为空。
     */
    @JsonProperty("dueDate")
    private String dueDate;
}
