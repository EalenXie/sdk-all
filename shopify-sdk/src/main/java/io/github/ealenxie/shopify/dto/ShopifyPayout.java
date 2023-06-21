package io.github.ealenxie.shopify.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ShopifyPayout {
    /**
     * id
     */
    private long id;
    /**
     * 状态
     */
    private String status;
    /**
     * 时间
     */
    private Date date;
    /**
     * 币种
     */
    private String currency;
    /**
     * 金额
     */
    private String amount;
    /**
     * 总结
     */
    private Summary summary;
}
