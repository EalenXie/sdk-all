package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author lanzhi
 * Created on 2023/7/31 15:59
 **/
@Getter
@Setter
public class Bill {
    /**
     * 该账单的类型。可取值如下：
     * VATMASTER_PAY_VAT
     * AMAZON_TRANSPARENCY_FEE
     * EPR_FEE
     * ADS_FEE
     * LOGISTICS_FEE
     * TRADEMARK_FEE
     * VAT
     * REQUEST_TO_PAY
     */
    private String billType;
    /**
     * 账单编号
     * 字段最大长度：128
     */
    private String billNumber;
    /**
     * 账单金额
     */
    private Amount billAmount;
    /**
     * 账单备注
     * 字段最大长度：512
     */
    private String remark;
    /**
     * 账单创建时间。此字段赋值应遵循 ISO 8601 格式
     */
    private Date billCreateTime;
    /**
     * 账单支付截止时间。此字段赋值应遵循 ISO 8601 格式
     */
    private Date billDueTime;
    /**
     * 账单发件方信息
     */
    private User billSender;
    /**
     * 账单收件人信息
     */
    private User billReceiver;
    /**
     * 账单周期。可取值如下：
     * DAILY：指账单周期为一天。
     * WEEKLY：指账单周期为一周。
     * ANNUAL：指账单周期为一年。
     * FLEXIBLE：指账单周期为非固定周期。
     * 字段最大长度：16
     * 如果未传，默认此字段赋值为FLEXIBLE。
     */
    private String billTerm;
    /**
     * 账单明细
     * 字段最大长度：512
     */
    private String billItems;
    /**
     * 其他信息
     * 字段最大长度：64
     */
    private String billField;
}

