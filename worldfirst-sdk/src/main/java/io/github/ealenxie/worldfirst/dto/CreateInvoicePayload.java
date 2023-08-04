package io.github.ealenxie.worldfirst.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/31 15:40
 **/
@NoArgsConstructor
@Data
@Getter
@Setter
public class CreateInvoicePayload {

    /**
     * 由集成商定义的唯一单据号，用于标识每笔单据
     * <p>
     * 字段最大长度：32
     */
    private String requestId;
    /**
     * 指用于完成账单支付的产品类型。可取值如下：
     * CASHIER_PAYMENT: 指收银台支付。
     * AUTO_DEBIT: 指自动扣款
     */
    private String productCode;
    /**
     * 单据相关信息，包括单据类型。
     */
    private Invoice invoice;
    /**
     * 支付相关信息，包括支付金额、手续费金额等。
     */
    private PayToDetail payToDetail;
}

