package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/31 15:57
 **/
@Getter
@Setter
public class Invoice {
    /**
     * 单据类型。可取值如下：
     * BILL：指账单。
     * ORDER：指交易订单。
     * <p>
     * 字段最大长度：8
     */
    private String invoiceType;
    /**
     * 账单相关信息，包括账单类型、账单编号、账单金额等。
     * 当 invoiceType = BILL 时，此字段为必填
     */
    private Bill bill;
}

